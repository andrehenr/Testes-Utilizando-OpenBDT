package com.br.projeto.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassSouBarato extends PageObject {

	                 
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

	@FindBy(css = ".warranty-button")
	private WebElement botaoContinuarPaginaGarantia;

	@FindBy(id = "buy-button")
	private WebElement botaoComprarPaginaFrete;

	@FindBy(xpath = "//*[@id='root']/div/div[2]/h2/span")
	private WebElement tituloLogin;

	@FindBy(xpath = "//*[@id='app']/section/article/div[2]/div[1]/div/ul/li")
	private List<WebElement> opcoesFrete;

	@FindBy(id = "main-header-menu-toggle")
	private WebElement botaoMenu;

	@FindBy(linkText = "Eletrodomésticos")
	private WebElement opcaoEletrodomesticos;

	@FindBy(linkText = "Geladeiras e Freezeres")
	private WebElement opcaoGeladeirasFreezeres;

	@FindBy(xpath = "//*[@id='containerpage']/div[5]/div/div/div[2]/section/ul/li/section/div[2]/a")
	private List<WebElement> listaDeGeladeirasFreezeres;

	@FindBy(xpath = "//*[@id='skusbox']/div/button")
	private List<WebElement> opcoesTensao;

	@FindBy(xpath = "//*[@id='containerpage']/div[1]/div/div[2]/section/ul/li/section/div[2]/a")
	private List<WebElement> listaProdutosPosPesquisa;

	@FindBy(id = "header-search-input")
	private WebElement campoBusca;

	@FindBy(linkText = "VANTAGENS")
	private WebElement abaVantagens;

	@FindBy(xpath = "//*[@id='area01']/div[1]/div/div/div[1]/ul/li[2]/ul/li[1]/a")
	private WebElement linkConhecaVantagens;

	@FindBy(id = "vantagens-cartoes")
	private WebElement abaVantagensAberta;

	@FindBy(linkText = "+ que Limite")
	private WebElement linkLimite;
	
	@FindBy(linkText = "Produtos Usados")
	private WebElement linkPordutosUsados;

	public WebElement getLinkPordutosUsados() {
		return linkPordutosUsados;
	}

	public WebElement getAbaVantagens() {
		return abaVantagens;
	}

	public WebElement getLinkConhecaVantagens() {
		return linkConhecaVantagens;
	}

	public WebElement getOpcaoEletrodomesticos() {
		return opcaoEletrodomesticos;
	}

	public List<WebElement> getListaProdutosPosPesquisa() {
		return listaProdutosPosPesquisa;
	}

	public WebElement getCampoBusca() {
		return campoBusca;
	}

	public List<WebElement> getOpcoesFrete() {
		return opcoesFrete;
	}

	public WebElement getTituloLogin() {
		return tituloLogin;
	}

	public WebElement getBotaoComprarPaginaFrete() {
		return botaoComprarPaginaFrete;
	}

	public WebElement getBotaoContinuarPaginaGarantia() {
		return botaoContinuarPaginaGarantia;
	}

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

	public WebElement getBotaoMenu() {
		return this.botaoMenu;
	}

	public WebElement getOpcaoEletrometiscos() {
		return this.opcaoEletrodomesticos;
	}

	public WebElement getOpcaoGeladeirasFreezeres() {
		return this.opcaoGeladeirasFreezeres;
	}

	public List<WebElement> getListaDeGeladeirasFreezeres() {
		return this.listaDeGeladeirasFreezeres;
	}

	public List<WebElement> getOpcoesTensao() {
		return this.opcoesTensao;
	}

	public WebElement getAbaVantagensAberta() {
		return abaVantagensAberta;
	}

	public WebElement getLinkLimite() {
		return linkLimite;
	}
}
