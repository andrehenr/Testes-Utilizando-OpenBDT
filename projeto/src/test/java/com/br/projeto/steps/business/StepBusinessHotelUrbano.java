package com.br.projeto.steps.business;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import com.br.projeto.pages.PageObjectClass;
import com.br.projeto.pages.PageObjectClassHotelUrbano;

import jxl.common.Logger;
import net.serenity_bdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessHotelUrbano {

	PageObjectClassHotelUrbano page;
	private static Logger LOG = Logger.getLogger(StepBusinessHotelUrbano.class);

	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	@Step
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}

	public void clicarEmHoteis() {
		viewElement.click(page.getLinkHoteis());
	}

	public void preencheCampoPesquisa(String cidade) {
		viewElement.sendText(page.getCaixaPesquisaHoteis(), cidade);
	}

	public void clicarEmPesquisarHoteis() {
		viewElement.click(page.getBotaoPesquisarHoteis());
	}

	public void clicarCheckCincoEstrelas() {
		viewElement.waitForElementIsPresent(10, page.getCheckBoxHoteisCincoEstrelas());
		viewElement.scrollIntoView(page.getCheckBoxHoteisCincoEstrelas());
		viewElement.click(page.getCheckBoxHoteisCincoEstrelas());
	}

	public void selecionaPrimeiroHotel() {
		viewElement.waitForElementIsPresent(10, page.getResultadoDosHoteis().get(1));
		List<WebElement> listaElementos = page.getResultadoDosHoteis();
		listaElementos.get(1).click();
		mudaDePagina(null);
	}

	public void mudaDePagina(WebElement elementoEsperado) {
		for (String windows : viewElement.getDriver().getWindowHandles()) {
			viewElement.getDriver().switchTo().window(windows);
		}
		if (elementoEsperado != null)
			viewElement.waitForElementIsPresent(30, elementoEsperado);
	}

	public boolean verificarStatusCincoEstrelasDoHotel() {
		return page.getIconesEstrelas().size() == 5;
	}

	public void exibirInformacoesHotel() {
		LOG.info("Hotel Cinco Estrelas: " + page.getNomeHotel().getText());
	}

	public void clicarEmAereos() {
		viewElement.click(page.getLinkAereos());
	}

	public void preencherCampoDestinoVoo(String destino) {
		viewElement.waitAndClick(page.getLinkCampoDestino(), 10);
		viewElement.sendText(page.getCampoDestinoVoo(), destino);
	}

	public void selecionaDataIdaVoo(String dataIda) {
		String[] data = dataIda.split(" ");
		viewElement.click(page.getCampoDataIda());
		while (!page.getMesSelecionadoIda().getText().contains(data[1])) {
			viewElement.click(page.getBotaoProximoMes());
		}
		boolean comecouMes = false;
		int d = 0;
		while(!comecouMes) {
			if(page.getDiasDoCalendarioEmExibicao().get(d).getText().equals("1")) {
				comecouMes = true;
			}
			else {
				d++;
			}
		}
		while (!page.getDiasDoCalendarioEmExibicao().get(d).getText()
				.equals(Integer.valueOf(data[0]).toString())) {
				d++;
		}
		viewElement.click(page.getDiasDoCalendarioEmExibicao().get(d));
	}

	public void selecionarQuantidadeAdultos(int quantidadeAdultos) {
		viewElement.click(page.getCamposPassagem().get(0));
		viewElement.click(page.getQuantidadePassagensDozeMais().get(quantidadeAdultos-1));
	}

	public void selecionarQuantidadeCriancas(int quantidadeCriancas) {
		viewElement.click(page.getCamposPassagem().get(1));
		viewElement.click(page.getQuantidadePassagensDozeMenos().get(quantidadeCriancas));
	}

	public void selecionarQuantidadeBebes(int quantidadeBebes) {
		viewElement.click(page.getCamposPassagem().get(2));
		viewElement.click(page.getQuantidadePassagensBebes().get(quantidadeBebes));
	}

	public void clicarNoBotaoPesquisarVoo() {
		viewElement.click(page.getBotaoPesquisarVoos());
		
	}

	public void exibirInformacoesVoo() {
		viewElement.waitForElementIsPresent(30, page.getTotalResultadosVoo());
		viewElement.scrollIntoView(page.getTotalResultadosVoo());
		String resultado = page.getTotalResultadosVoo().getText();
		LOG.info(resultado.substring(resultado.indexOf("e ")+1));
	}

}
