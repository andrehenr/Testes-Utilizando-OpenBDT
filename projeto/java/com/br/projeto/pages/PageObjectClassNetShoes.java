package com.br.projeto.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassNetShoes extends PageObject {

	@FindBy(linkText = "CALÇADOS")
	private WebElement linkCalcados;

	@FindBy(xpath = "//*[@id='item-list']/div[1]/div")
	private List<WebElement> listaCalcados;

	@FindBy(xpath = "//*[@id='buy-box']/section[1]/div/ul/li/a")
	private List<WebElement> listaCoresCalcados;

	@FindBy(xpath = "//*[@id='buy-box']/section[2]/div/ul/li/a")
	private List<WebElement> listaTamanhoCalcados;

	@FindBy(id = "buy-button-now")
	private WebElement botaoComprar;

	@FindBy(xpath = "//*[@id='content']/section/div/section/table/tbody/tr/td[1]/div[2]/div[3]/ul/li")
	private List<WebElement> listaAtributosPreCompra;

	@FindBy(xpath = "//*[@id='content']/section/div/section/table/tbody/tr/td[1]/div[2]/strong")
	private WebElement nomeProduto;

	@FindBy(id = "search-input")
	private WebElement campoBusca;

	@FindBy(xpath = "//*[@id='item-list']/div/div")
	private List<WebElement> listaCamisetas;

	@FindBy(xpath = "//*[@id='buy-box']/section[2]/div/ul/li")
	private List<WebElement> listaTamanhoCamisetas;

	@FindBy(xpath = "//*[@id='involucro']/section[2]/ul/li")
	private List<WebElement> linksOutlet;

	@FindBy(xpath = "//*[@id='item-list']/div[1]/div/div[2]/a")
	private List<WebElement> listaTenisPreco;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div[3]/div/form/div[4]/ul/li/label/span")
	private List<WebElement> listaTamanhoTenis;

	@FindBy(name = "shipping[zipCode]")
	private WebElement campoCEP;
	
	@FindBy(className = "calculate-shipping__button")
	private WebElement botaoCalcularFrete;
	
	@FindBy(id = "column-shipping-calculated")
	private WebElement informacoesSobreFrete;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div[3]/div[1]/div/a")
	private WebElement linkVoltarParaLoja;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/table/tfoot/tr[5]/td[1]/form/button")
	private WebElement linkLimparCarrinho;
	
	public WebElement getLinkVoltarParaLoja() {
		return linkVoltarParaLoja;
	}

	public WebElement getLinkLimparCarrinho() {
		return linkLimparCarrinho;
	}

	public WebElement getInformacoesSobreFrete(){
		return informacoesSobreFrete;
	}

	public WebElement getCampoCEP() {
		return campoCEP;
	}

	public WebElement getBotaoCalcularFrete() {
		return botaoCalcularFrete;
	}

	public List<WebElement> getListaTamanhoTenis() {
		return listaTamanhoTenis;
	}

	public List<WebElement> getListaTenisPreco() {
		return listaTenisPreco;
	}

	public List<WebElement> getLinksOutlet() {
		return linksOutlet;
	}

	public List<WebElement> getListaTamanhoCamisetas() {
		return listaTamanhoCamisetas;
	}

	public WebElement getCampoBusca() {
		return campoBusca;
	}

	public WebElement getNomeProduto() {
		return nomeProduto;
	}

	public List<WebElement> getListaAtributosPreCompra() {
		return listaAtributosPreCompra;
	}

	public WebElement getBotaoComprar() {
		return botaoComprar;
	}

	public List<WebElement> getListaTamanhoCalcados() {
		return listaTamanhoCalcados;
	}

	public List<WebElement> getListaCoresCalcados() {
		return listaCoresCalcados;
	}

	public List<WebElement> getListaCalcados() {
		return listaCalcados;
	}

	public WebElement getLinkCalcados() {
		return linkCalcados;
	}

	public List<WebElement> getListaCamisetas() {
		return listaCamisetas;
	}

}
