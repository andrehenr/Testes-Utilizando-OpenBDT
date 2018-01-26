package com.br.projeto.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassSouBarato extends PageObject{

	@FindBy(xpath = "//*[@id='containerpage']/div[2]/div/div/div/section/ul/li/section/div[2]/a")
	private List<WebElement> listaDePordutosReembalados;
	
	@FindBy(linkText = "Produtos Reembalados")
	private WebElement linkProdutosReembalados;
	
	@FindBy(id = "product-buy-button")
	private WebElement botaComprar;
	
	@FindBy(linkText = "Sim, continuar")
	private WebElement linkConfirmaCompraReembalado;
	
	@FindBy(xpath = "//*[@id='app']/section/header/h2")
	private WebElement TituloMinnhaSacola;
	
	@FindBy(xpath = "//*[@id='app']/section/article/div[1]/section/article/ul/li/ul/li[2]/ul/li[1]/div/select")
	private WebElement selectQuantidadeProdutos;
	
	@FindBy(xpath = "//*[@id='app']/section/article/div[2]/div[1]/div/ul/li")
	private List<WebElement> tipodeFrete;
	
	@FindBy(id = "cep")
	private WebElement campoCEP;
	
	@FindBy(id = "calculate-freight-button")
	private WebElement botaoCalculaFrete;

	public List<WebElement> getTipodeFrete() {
		return tipodeFrete;
	}

	public WebElement getTituloMinnhaSacola() {
		return TituloMinnhaSacola;
	}

	public WebElement getSelectQuantidadeProdutos() {
		return selectQuantidadeProdutos;
	}

	public WebElement getCampoCEP() {
		return campoCEP;
	}

	public WebElement getBotaoCalculaFrete() {
		return botaoCalculaFrete;
	}

	public WebElement getLinkConfirmaCompraReembalado() {
		return linkConfirmaCompraReembalado;
	}

	public WebElement getBotaComprar() {
		return botaComprar;
	}

	public List<WebElement> getListaDePordutosReembalados() {
		return listaDePordutosReembalados;
	}

	public WebElement getLinkProdutosReembalados() {
		return linkProdutosReembalados;
	}
}
