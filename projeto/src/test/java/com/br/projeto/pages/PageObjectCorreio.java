package com.br.projeto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectCorreio extends PageObject {

	@FindBy(id = "acesso-busca")
	private WebElement campoBuscaCEPEnderecoPaginaIncial;

	@FindBy(xpath = "//*[@id='busca-acesso-rapido']/form/input[2]")
	private WebElement botaoBuscaCEPEnderecoPaginaInicial;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/p")
	private WebElement mensagemDeBusca;

	private By linhaDeResultadoDaBusca = By
			.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/table/tbody/tr");
	private By linkProximosResultados = By.linkText("[ Próxima ]");

	private By divContemLinkProximo = By.cssSelector(
			"body > div.back > div.tabs > div:nth-child(2) > div > div > div.column2 > div.content > div.ctrlcontent > div:nth-child(4)");

	@FindBy(css = "#content-precos-prazos > div.select-precos-prazos")
	private WebElement campoAbreMenuSuspenso;

	@FindBy(linkText = "Calculador de Preços e Prazos Nacionais")
	private WebElement linkPrecosPrazos;
	
	@FindBy(name = "cepOrigem")
	private WebElement campoCepOrigem;
	
	@FindBy(name = "cepDestino")
	private WebElement campoCepDestino;
	
	@FindBy(name = "servico")
	private WebElement selectServico;
	
	@FindBy(css = ".caixa")
	private WebElement figuraCaixa;
	
	@FindBy(css = ".rolo")
	private WebElement figuraRolo;
	
	@FindBy(name = "embalagem1")
	private WebElement tipoEmbalagem;
	
	@FindBy(name = "peso")
	private WebElement selectPeso;
	
	@FindBy(name = "MaoPropria")
	private WebElement checkMaoPropria;
	
	@FindBy(name = "avisoRecebimento")
	private WebElement checkAvisoRecebimento;
	
	@FindBy(name = "ckValorDeclarado")
	private WebElement checkDeclaracaoValor;
	
	@FindBy(name = "Calcular")
	private WebElement botaoCalcular;
	
	@FindBy(linkText = "Próxima")
	private WebElement proximaEmbalagem;
	
	@FindBy(xpath = "//*[@id=\"spanTipoEmbalagem\"]/div/div[2]/div/div[3]/div/p/button")
	private WebElement botaoTerceiraEmbalagemCorreios;
	
	public WebElement getProximaEmbalagem() {
		return proximaEmbalagem;
	}

	public WebElement getBotaoTerceiraEmbalagemCorreios() {
		return botaoTerceiraEmbalagemCorreios;
	}

	public WebElement getCampoCepOrigem() {
		return campoCepOrigem;
	}

	public WebElement getCampoCepDestino() {
		return campoCepDestino;
	}

	public WebElement getSelectServico() {
		return selectServico;
	}

	public WebElement getFiguraCaixa() {
		return figuraCaixa;
	}

	public WebElement getFiguraRolo() {
		return figuraRolo;
	}

	public WebElement getTipoEmbalagem() {
		return tipoEmbalagem;
	}

	public WebElement getSelectPeso() {
		return selectPeso;
	}

	public WebElement getCheckMaoPropria() {
		return checkMaoPropria;
	}

	public WebElement getCheckAvisoRecebimento() {
		return checkAvisoRecebimento;
	}

	public WebElement getCheckDeclaracaoValor() {
		return checkDeclaracaoValor;
	}

	public WebElement getBotaoCalcular() {
		return botaoCalcular;
	}

	public By getDivContemLinkProximo() {
		return divContemLinkProximo;
	}

	public WebElement getCampoBuscaCEPEnderecoPaginaIncial() {
		return campoBuscaCEPEnderecoPaginaIncial;
	}

	public WebElement getBotaoBuscaCEPEnderecoPaginaInicial() {
		return botaoBuscaCEPEnderecoPaginaInicial;
	}

	public WebElement getMensagemDeBusca() {
		return mensagemDeBusca;
	}

	public By getLinhaDeResultadoDaBusca() {
		return linhaDeResultadoDaBusca;
	}

	public By getLinkProximosResultados() {
		return linkProximosResultados;
	}

	public WebElement getCampoAbreMenuSuspenso() {
		return this.campoAbreMenuSuspenso;
	}

	public WebElement getLinkPrecosPrazos() {
		return this.linkPrecosPrazos;
	}

}
