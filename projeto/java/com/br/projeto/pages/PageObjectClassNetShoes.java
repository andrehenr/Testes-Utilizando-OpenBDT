package com.br.projeto.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassNetShoes extends PageObject {

	@FindBy(linkText = "CALÇADOS")
	private WebElement linkCalcados;

	@FindBy(xpath = "//div[@itemprop='itemListElement']")
	private List<WebElement> listaCalcados;

	@FindBy(xpath = "//ul[@data-type='color']/li/a")
	private List<WebElement> listaCoresCalcados;

	@FindBy(xpath = "//ul[@data-type='size']/li/a")
	private List<WebElement> listaTamanhoCalcados;

	@FindBy(id = "buy-button-now")
	private WebElement botaoComprar;

	@FindBy(xpath = "//ul[@class='attributes']/li")
	private List<WebElement> listaAtributosPreCompra;

	@FindBy(xpath = "//strong[@class = 'product-name name']")
	private WebElement nomeProduto;

	@FindBy(id = "search-input")
	private WebElement campoBusca;

	@FindBy(xpath = "//*[@id='item-list']/div/div")
	private List<WebElement> listaCamisetas;

	@FindBy(xpath = "//ul[@data-type='size']/li")
	private List<WebElement> listaTamanhoCamisetas;

	@FindBy(className = "categoria-link-p")
	private List<WebElement> linksOutlet;

	@FindBy(xpath = "//a[@itemprop='offers']")
	private List<WebElement> listaTenisPreco;

	@FindBy(className = "product-item")
	private List<WebElement> listaTamanhoTenis;

	@FindBy(name = "shipping[zipCode]")
	private WebElement campoCEP;
	
	@FindBy(className = "calculate-shipping__button")
	private WebElement botaoCalcularFrete;
	
	@FindBy(id = "column-shipping-calculated")
	private WebElement informacoesSobreFrete;
	
	@FindBy(id = "back-to-store")
	private WebElement linkVoltarParaLoja;
	
	@FindBy(linkText = "Limpar Carrinho")
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
