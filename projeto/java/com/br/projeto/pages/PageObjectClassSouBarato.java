package com.br.projeto.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassSouBarato extends PageObject {
	
	@FindBy(xpath = "//div[@class='lightpop-close md-btn-visible']/a")
	private WebElement botaoFechaAbaReceberPromocoes;

	@FindBy(linkText = "Produtos Reembalados")
	private WebElement linkProdutosReembalados;

	@FindBy(id = "product-buy-button")
	private WebElement botaoComprar;
	
	@FindBy(xpath = "//ul[@class='list-actions']/li")
	private List<WebElement> botoesComprarPaginaFrete;

	public List<WebElement> getBotoesComprarPaginaFrete() {
		return botoesComprarPaginaFrete;
	}

	@FindBy(linkText = "Sim, continuar")
	private WebElement linkConfirmaCompraReembalado;

	@FindBy(css = ".page-title")
	private WebElement TituloMinnhaSacola;

	@FindBy(xpath = "//select[@class='form-control select__quantity']")
	private WebElement selectQuantidadeProdutos;

	@FindBy(xpath = "//li[@class='radio-bordered animate-item-blind']")
	private List<WebElement> tipodeFrete;

	@FindBy(id = "cep")
	private WebElement campoCEP;

	@FindBy(id = "calculate-freight-button")
	private WebElement botaoCalculaFrete;

	@FindBy(css = ".warranty-button")
	private WebElement botaoContinuarPaginaGarantia;

	@FindBy(className = "entrar-title")
	private WebElement tituloLogin;

	@FindBy(xpath = "//li[@class='radio-bordered animate-item-blind']")
	private List<WebElement> opcoesFrete;

	@FindBy(id = "main-header-menu-toggle")
	private WebElement botaoMenu;

	@FindBy(linkText = "Eletrodomésticos")
	private WebElement opcaoEletrodomesticos;

	@FindBy(linkText = "Geladeiras e Freezeres")
	private WebElement opcaoGeladeirasFreezeres;

	@FindBy(xpath = "//*[@id='skusbox']/div/button")
	private List<WebElement> opcoesTensao;

	@FindBy(id = "header-search-input")
	private WebElement campoBusca;

	@FindBy(linkText = "VANTAGENS")
	private WebElement abaVantagens;

	@FindBy(linkText="Conheça as vantagens")
	private WebElement linkConhecaVantagens;

	@FindBy(id = "vantagens-cartoes")
	private WebElement abaVantagensAberta;

	@FindBy(linkText = "+ que Limite")
	private WebElement linkLimite;
	
	@FindBy(linkText = "Produtos Usados")
	private WebElement linkPordutosUsados;

	@FindBy(xpath = "//section[@class='p-card']")
	private List<WebElement> listaProdutos;

	public WebElement getBotaoFechaAbaReceberPromocoes() {
		return botaoFechaAbaReceberPromocoes;
	}

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

	public WebElement getCampoBusca() {
		return campoBusca;
	}

	public List<WebElement> getOpcoesFrete() {
		return opcoesFrete;
	}

	public WebElement getTituloLogin() {
		return tituloLogin;
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

	public WebElement getBotaoComprar() {
		return botaoComprar;
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

	public List<WebElement> getOpcoesTensao() {
		return this.opcoesTensao;
	}

	public WebElement getAbaVantagensAberta() {
		return abaVantagensAberta;
	}

	public WebElement getLinkLimite() {
		return linkLimite;
	}

	public List<WebElement> getListaDeProdutos() {
		return this.listaProdutos;
	}
}
