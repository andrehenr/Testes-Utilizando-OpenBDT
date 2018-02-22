package com.br.projeto.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassCorreio extends PageObject {

	@FindBy(id = "acesso-busca")
	private WebElement campoBuscaCEPEnderecoPaginaIncial;

	@FindBy(xpath = "//*[@id='busca-acesso-rapido']/form/input[2]")
	private WebElement botaoBuscaCEPEnderecoPaginaInicial;

	@FindBy(xpath = "//div[@class='ctrlcontent']/p")
	private WebElement mensagemDeBusca;

	private By linhaDeResultadoDaBusca = By
			.tagName("tr");
	
	private By linkProximosResultados = By.linkText("[ Próxima ]");

	private By divContemLinkProximo = By.cssSelector(
			"div.ctrlcontent > div:nth-child(4)");

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
	
	@FindBy(name = "valorDeclarado")
	private WebElement campoValorDeclarado;
	
	@FindBy(xpath = "//tr[@class='destaque' and position() = 2]/td")
	private WebElement campoResultadoPrazo;
	
	@FindBy(xpath = "//tr[@class='destaque' and position() = 1]/td")
	private WebElement campoResultadoPreco;
	
	@FindBy(xpath = "//img[@alt='Rede de Atendimento']")
	private WebElement linkRedeAtendimento;
	
	@FindBy(name = "estadoAgencia")
	private WebElement selectEstadoAgencia;
	
	@FindBy(name = "municipioAgencia")
	private WebElement selectMunicipioAgencia;
	
	@FindBy(name = "bairroAgencia")
	private WebElement selectBairroAgencia;
	
	@FindBy(id = "tableNomeAgencia")
	private List<WebElement> nomesDasAgencias;
	
	@FindBy(css = ".dadosAgencia")
	private List<WebElement> dadosDasAgencias;

	@FindBy(id = "tipoBusca")
	private List<WebElement> radioTipoBusca;
	
	public WebElement getSelectEstadoAgencia() {
		return selectEstadoAgencia;
	}

	public WebElement getSelectMunicipioAgencia() {
		return selectMunicipioAgencia;
	}

	public WebElement getSelectBairroAgencia() {
		return selectBairroAgencia;
	}

	public List<WebElement> getNomesDasAgencias() {
		return nomesDasAgencias;
	}

	public List<WebElement> getDadosDasAgencias() {
		return dadosDasAgencias;
	}

	public WebElement getLinkRedeAtendimento() {
		return linkRedeAtendimento;
	}

	public List<WebElement> getRadioTipoBusca() {
		return radioTipoBusca;
	}
	
	public WebElement getCampoResultadoPrazo() {
		return campoResultadoPrazo;
	}

	public WebElement getCampoResultadoPreco() {
		return campoResultadoPreco;
	}

	public WebElement getCampoValorDeclarado() {
		return campoValorDeclarado;
	}

	public WebElement getProximaEmbalagem() {
		return proximaEmbalagem;
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
