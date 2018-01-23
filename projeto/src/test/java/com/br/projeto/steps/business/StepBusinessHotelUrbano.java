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
		List<WebElement> listaElementos = page.getResultadoDosHoteis();
		listaElementos.get(2).click();
		mudaDePagina(null);
	}
	
	public void mudaDePagina(WebElement elementoEsperado) {
		for (String windows : viewElement.getDriver().getWindowHandles()) {
			viewElement.getDriver().switchTo().window(windows);
		}
		if(elementoEsperado != null) viewElement.waitForElementIsPresent(30, elementoEsperado);
	}

	public boolean verificarStatusCincoEstrelasDoHotel() {
		return page.getIconesEstrelas().size() == 5;
	}

	public void exibirInformacoesHotel() {
		LOG.info("Hotel Cinco Estrelas: "+page.getNomeHotel().getText());
	}

}
