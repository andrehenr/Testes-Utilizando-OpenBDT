package com.br.projeto.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassHotelUrbano extends PageObject {

	@FindBy(xpath = "//*[@id='reactRoot']/div/div[1]/div/div[1]/div[1]/header/div/div[2]/nav/a[2]")
	private WebElement linkHoteis;

	@FindBy(name = "q")
	private WebElement caixaPesquisaHoteis;

	@FindBy(xpath = "//*[@id='get-intent-midia']/div/form/div[2]/div[2]/button")
	private WebElement botaoPesquisarHoteis;

	@FindBy(xpath = "//*[@id='filters']/aside/div[2]/div[2]/div[2]/label[1]")
	private WebElement checkBoxHoteisCincoEstrelas;
	
	@FindBy(xpath = "//*[@id='result-card']/div/div/div[2]/div[2]/div[1]/div/h3/a")
	private List<WebElement> linkDosHoteis;

	@FindBy(xpath = "//*[@id='result-card']/div")
	private List<WebElement> resultadoDosHoteis;
	
	@FindBy(xpath = "//*[@id='wrap-page-head']/div[1]/span/i")
	private List<WebElement> iconesEstrelas;
	
	@FindBy(xpath = "//*[@id='wrap-page-head']/div[1]/h1/span")
	private WebElement nomeHotel;
	
	@FindBy(xpath = "//*[@id='reactRoot']/div/div[1]/div/div[1]/div[1]/header/div/div[2]/nav/a[6]")
	private WebElement linkAereos;
	
	@FindBy(xpath = "//*[@id='search']/div[1]/div[4]/div/div/div/input")
	private WebElement campoDestinoVoo;
	
	@FindBy(xpath = "//*[@id='search-date-depart']/div[1]/button")
	private WebElement campoDataIda;
	
	@FindBy(xpath = "//*[@id='date-depart_root']/div/div/div/div/div[2]/div[3]")
	private WebElement botaoProximoMesVoo;
	
	@FindBy(xpath = "//*[@id='date-depart_root']/div/div/div/div/div[2]/div[1]/div/button/div/span")
	private WebElement mesSelecionadoIda;
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div/a[2]")
	private WebElement botaoProximoMes;
	
	@FindBy(xpath = "//*[@id='date-depart_table']/tbody/tr/td/div")
	private List<WebElement> diasDoCalendarioEmExibicao;
	
	@FindBy(xpath = "//*[@id='people-and-class']/div[2]/div[1]/div/div/ul/li/a")
	private List<WebElement> quantidadePassagensDozeMais;
	
	@FindBy(xpath = "//*[@id='people-and-class']/div[2]/div[2]/div/div/ul/li/a")
	private List<WebElement> quantidadePassagensDozeMenos;
	
	@FindBy(xpath = "//*[@id='people-and-class']/div[2]/div[4]/div/div/ul/li/a")
	private List<WebElement> quantidadePassagensBebes;
	
	@FindBy(xpath = "//*[@id='search']/a")
	private WebElement botaoPesquisarVoos;
	
	@FindBy(xpath = "//*[@id='search']/div[1]/div[4]/div/div/a")
	private WebElement linkCampoDestino;
	
	@FindBy(xpath = "//*[@id='people-and-class']/div[2]/div/div")
	private List<WebElement> camposPassagem;
	
	@FindBy(css = ".results-count")
	private WebElement totalResultadosVoo;
	
	@FindBy(xpath = "//*[@id='hu-hotels-autocomplete-field']/div/ul/li[4]")
	private WebElement linkIngresso;
	
	@FindBy(xpath = "//*[@id='offer-options']/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[4]/a")
	private WebElement botaoComprar;
	
	@FindBy(xpath = "//*[@id='offer-options']/div[1]/div/div/select")
	private WebElement selectQuantidadePessoasParque;
	
	@FindBy(xpath = "//*[@id='reactRoot']/div/div[1]/div/div[1]/div[1]/header/div/div[2]/nav/a[4]")
	private WebElement linkPromocoes;
	
	@FindBy(xpath = "//*[@id='reactRoot']/div/div[3]/div[2]/div/div[4]/div/div[2]/div/a/div[2]/div[1]/strong")
	private List<WebElement> locaisRegiaoSudestePromocao;
	
	@FindBy(xpath = "//*[@id=\"result-card\"]/div/div/div[2]/div[2]/div[1]/div/h3/a")
	private List<WebElement> nomesDosHoteis;
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr/td/a")
	private List<WebElement> diasDiponiveisParaReservaEntrada;
	
	
	private By campoDataDeEntrada = By.name("checkin");
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div/div/span[1]")
	private WebElement mesSelecionadoEntrada;
	
	@FindBy(name = "sku_quantity[]")
	private List<WebElement> selectNumeroDeQuartos;
	
	@FindBy(name = "adults")
	private List<WebElement> selectNumeroAdultos;
	
	@FindBy(name = "children")
	private List<WebElement> selectNumeroCriancas;
	
	@FindBy(xpath = "//*[@id=\"wrap-booking-info\"]/div/div[2]/div/input")
	private WebElement botaoReservar;
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div/a[2]")
	private WebElement linkProximoMes;

	public List<WebElement> getLinkDosHoteis() {
		return linkDosHoteis;
	}

	public WebElement getBotaoProximoMesVoo() {
		return botaoProximoMesVoo;
	}

	public List<WebElement> getDiasDiponiveisParaReservaEntrada() {
		return diasDiponiveisParaReservaEntrada;
	}

	public WebElement getMesSelecionadoEntrada() {
		return mesSelecionadoEntrada;
	}

	public By getCampoDataDeEntrada() {
		return campoDataDeEntrada;
	}

	public List<WebElement> getSelectNumeroDeQuartos() {
		return selectNumeroDeQuartos;
	}

	public List<WebElement> getSelectNumeroAdultos() {
		return selectNumeroAdultos;
	}

	public List<WebElement> getSelectNumeroCriancas() {
		return selectNumeroCriancas;
	}

	public WebElement getBotaoReservar() {
		return botaoReservar;
	}

	public WebElement getLinkProximoMes() {
		return linkProximoMes;
	}

	public List<WebElement> getNomesDosHoteis() {
		return nomesDosHoteis;
	}

	public List<WebElement> getLocaisRegiaoSudestePromocao() {
		return locaisRegiaoSudestePromocao;
	}

	public WebElement getLinkIngresso() {
		return linkIngresso;
	}

	public WebElement getBotaoComprar() {
		return botaoComprar;
	}

	public WebElement getSelectQuantidadePessoasParque() {
		return selectQuantidadePessoasParque;
	}

	public WebElement getLinkIngressoThermas() {
		return linkIngresso;
	}

	public WebElement getTotalResultadosVoo() {
		return totalResultadosVoo;
	}

	public List<WebElement> getCamposPassagem() {
		return camposPassagem;
	}

	public WebElement getLinkCampoDestino() {
		return linkCampoDestino;
	}

	public WebElement getLinkAereos() {
		return linkAereos;
	}

	public WebElement getBotaoPesquisarVoos() {
		return botaoPesquisarVoos;
	}

	public WebElement getCampoDestinoVoo() {
		return campoDestinoVoo;
	}

	public WebElement getCampoDataIda() {
		return campoDataIda;
	}

	public WebElement getMesSelecionadoIda() {
		return mesSelecionadoIda;
	}

	public WebElement getBotaoProximoMes() {
		return botaoProximoMes;
	}

	public List<WebElement> getDiasDoCalendarioEmExibicao() {
		return diasDoCalendarioEmExibicao;
	}

	public List<WebElement> getQuantidadePassagensDozeMais() {
		return quantidadePassagensDozeMais;
	}

	public List<WebElement> getQuantidadePassagensDozeMenos() {
		return quantidadePassagensDozeMenos;
	}

	public List<WebElement> getQuantidadePassagensBebes() {
		return quantidadePassagensBebes;
	}

	public WebElement getNomeHotel() {
		return nomeHotel;
	}
	
	public List<WebElement> getIconesEstrelas(){
		return iconesEstrelas;
	}

	public WebElement getLinkHoteis() {
		return linkHoteis;
	}

	public WebElement getCaixaPesquisaHoteis() {
		return caixaPesquisaHoteis;
	}

	public WebElement getBotaoPesquisarHoteis() {
		return botaoPesquisarHoteis;
	}

	public WebElement getCheckBoxHoteisCincoEstrelas() {
		return checkBoxHoteisCincoEstrelas;
	}

	public List<WebElement> getResultadoDosHoteis() {
		return resultadoDosHoteis;
	}

	public WebElement getLinkPromocoes() {
		return linkPromocoes;
	}
}
