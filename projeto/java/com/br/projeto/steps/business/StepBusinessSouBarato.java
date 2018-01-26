package com.br.projeto.steps.business;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import com.br.projeto.pages.PageObjectClass;
import com.br.projeto.pages.PageObjectClassSouBarato;

import jxl.common.Logger;
import net.serenity_bdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessSouBarato {

	PageObjectClassSouBarato page;
	private static Logger LOG = Logger.getLogger(StepBusinessSouBarato.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	@Step
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}

	public void clicarEmProdutosReembalados() {
		viewElement.click(page.getLinkProdutosReembalados());
	}

	public void selecionarProdutoPorPalavra(String busca) {
		for(WebElement elemento: page.getListaDePordutosReembalados()){
			if(elemento.getText().contains(busca)){
				viewElement.click(elemento);
				break;
			}
		}
	}
	
	public void clicarEmComprar(){
		viewElement.click(page.getBotaComprar());
	}
	
	public void confirmaProdutoReembalado(){
		viewElement.click(page.getLinkConfirmaCompraReembalado());
	}
	
	public void selecionarQuantidadeProduto(int quantidade){
		viewElement.waitForElementIsPresent(20, page.getTituloMinnhaSacola());
		viewElement.selectByVisibleText(page.getSelectQuantidadeProdutos(), quantidade+"");
	}
	
	public void preencherCep(String CEP){
		viewElement.sendText(page.getCampoCEP(), CEP);
		viewElement.click(page.getBotaoCalculaFrete());
	}
}
