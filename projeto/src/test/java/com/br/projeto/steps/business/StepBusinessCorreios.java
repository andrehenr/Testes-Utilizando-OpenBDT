package com.br.projeto.steps.business;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.br.projeto.pages.PageObjectCorreio;

import io.openbdt.element.WebBrowserScreenElement;
import jxl.common.Logger;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessCorreios {

	private PageObjectCorreio page;
	private String stringBusca;

	@Autowired
	private WebBrowserScreenElement viewElement;

	private static Logger LOG = Logger.getLogger(StepBusiness.class);
	
	public boolean clicarEmProximo () {
		if (viewElement.getDriver().getPageSource().contains("javascript:document.Proxima.submit('Proxima')")) {
			viewElement.click(viewElement.findElement(page.getLinkProximosResultados()));
			return true;
		}
		return false;
	}
	
	public void mudaDePagina() {
		for (String windows : viewElement.getDriver().getWindowHandles()) {
			viewElement.getDriver().switchTo().window(windows);
		}
		viewElement.waitForElementIsPresent(30, page.getMensagemDeBusca());
	}

	public void abreSiteCorreios() {
		viewElement.navigate("http://www.correios.com.br/para-voce");
		viewElement.getDriver().manage().window().maximize();
	}

	public void preencheCampoBuscaPaginaInicial(String busca) {
		stringBusca = busca;
		viewElement.sendText(page.getCampoBuscaCEPEnderecoPaginaIncial(), stringBusca);
	}

	public void clicaEmPesquisa() {
		viewElement.click(page.getBotaoBuscaCEPEnderecoPaginaInicial());
	}

	public void analisaResultadosPesquisaEndereco() {
		mudaDePagina();
		do {
			List<WebElement> listaElementos = viewElement.findElements(page.getLinhaDeResultadoDaBusca());
			if(listaElementos.isEmpty()) {
				LOG.info("\nNenhum resultado encontrado");
			}
			else {
				for (int c = 1; c < listaElementos.size(); c++) {
					List<WebElement> colunas = listaElementos.get(c).findElements(By.tagName("td"));
					if(colunas.get(0).getText().contains(stringBusca)) {
						LOG.info("\n"+colunas.get(0).getText()+" CEP: " + colunas.get(3).getText());
					}
				}
				
			}
		} while (clicarEmProximo());
	}

	public boolean analisaResultadosPesquisaCep(String enderecoCorreto) {
		mudaDePagina();
		do {
			List<WebElement> listaElementos = viewElement.findElements(page.getLinhaDeResultadoDaBusca());
			if(listaElementos.isEmpty()) {
				LOG.info("\nNenhum resultado encontrado");
				return false;
			}
			else {
				for (int c = 1; c < listaElementos.size(); c++) {
					List<WebElement> colunas = listaElementos.get(c).findElements(By.tagName("td"));
					if(colunas.get(0).getText().contains(enderecoCorreto)) {
						return true;
					}
				}
			}
		} while (clicarEmProximo());
		return false;
	}

	public void clicaEmCalculadorPrecosPrazos() {
		viewElement.mouseOver(page.getCampoAbreMenuSuspenso());
		viewElement.click(page.getLinkPrecosPrazos());
	}
}
