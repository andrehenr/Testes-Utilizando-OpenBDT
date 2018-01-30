package com.br.projeto.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassNetShoes extends PageObject {

	@FindBy(id = "CALÇADOS-link")
	private WebElement linkCalcados;

	@FindBy(css = ".name")
	private List<WebElement> listaCalcados;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div[3]/div/form/div[3]/ul/li/label/a")
	private List<WebElement> listaCoresCalcados;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div[3]/div/form/div[4]/ul/li/label/span")
	private List<WebElement> listaTamanhoCalcados;

	@FindBy(id = "buy-now-button")
	private WebElement botaoComprar;

	@FindBy(xpath = "/html/body/div[3]/div[2]/table/tbody/tr/td[1]/div/div[2]/div[1]/ul/li")
	private List<WebElement> listaAtributosPreCompra;

	@FindBy(xpath = "/html/body/div[3]/div[2]/table/tbody/tr/td[1]/div/div[2]/p[1]/a")
	private WebElement nomeProduto;

	@FindBy(id = "search")
	private WebElement campoBusca;

	@FindBy(css = ".nm-product-name")
	private List<WebElement> listaCamisetas;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div[3]/div/form/div[4]/ul/li/label/span")
	private List<WebElement> listaTamanhoCamisetas;

	@FindBy(linkText = "Tênis")
	private WebElement linkTenisOutlet;

	@FindBy(css = ".new-price")
	private List<WebElement> listaTenisPreco;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div[3]/div/form/div[4]/ul/li/label/span")
	private List<WebElement> listaTamanhoTenis;

	@FindBy(name = "cep-first-input")
	private WebElement primeiroCampoCEP;

	@FindBy(name = "cep-second-input")
	private WebElement segundoCampoCep;

	@FindBy(xpath = "/html/body/div[3]/div[2]/table/tfoot/tr[1]/td[1]/div/form/div/div/div[4]/button")
	private WebElement botaoCalcularFrete;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/table/tfoot/tr[1]/td[3]/p")
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

	public WebElement getPrimeiroCampoCEP() {
		return primeiroCampoCEP;
	}

	public WebElement getSegundoCampoCep() {
		return segundoCampoCep;
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

	public WebElement getLinkTenisOutlet() {
		return linkTenisOutlet;
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
