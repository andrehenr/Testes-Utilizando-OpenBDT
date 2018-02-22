package com.br.projeto.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassHotelUrbano extends PageObject {

	@FindBy(xpath = "//a[@title='Reserva de Hotéis']")
	private WebElement linkHoteis;

	@FindBy(name = "q")
	private WebElement caixaPesquisaHoteis;

	@FindBy(tagName = "button")
	private WebElement botaoPesquisarHoteis;

	@FindBy(xpath = "//label[@for='filter_stars_5|1']")
	private WebElement checkBoxHoteisCincoEstrelas;

	@FindBy(xpath = "//h3[@class='component-card_title_h']/a")
	private List<WebElement> linkDosHoteis;

	@FindBy(xpath = "//*[@id='result-card']/div")
	private List<WebElement> resultadoDosHoteis;

	@FindBy(className = "icon-star")
	private List<WebElement> iconesEstrelas;

	@FindBy(className = "page-title-text")
	private WebElement nomeHotel;

	@FindBy(xpath = "//a[@title='Passagens Aéreas']")
	private WebElement linkAereos;

	@FindBy(xpath = "//input[@placeholder='Cidade ou aeroporto de destino']")
	private WebElement campoDestinoVoo;

	@FindBy(xpath = "//button[@data-label='Ida']")
	private WebElement campoDataIda;

	@FindBy(xpath = "//div[@aria-controls='date-depart_table' and @title='Próximo mês']")
	private WebElement botaoProximoMesVoo;

	@FindBy(className = "dropdown-accent")
	private WebElement mesSelecionadoIda;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div/a[2]")
	private WebElement botaoProximoMes;

	@FindBy(xpath = "//*[@id='date-depart_table']/tbody/tr/td")
	private List<WebElement> diasDoCalendarioEmExibicao;

	@FindBy(xpath = "//*[@id='search']/a")
	private WebElement botaoPesquisarVoos;

	@FindBy(linkText = "Cidade ou aeroporto de destino")
	private WebElement linkCampoDestino;

	@FindBy(xpath = "//button[@aria-label='Número de passageiros com mais de 12 anos']")
	private WebElement botaoPassagem12Mais;
	
	@FindBy(xpath = "//button[@aria-label='Número de passageiros com menos de 12 anos']")
	private WebElement botaoPassagemCriancas;
	
	@FindBy(xpath = "//button[@aria-label='Número de passageiros com menos de 2 anos']")
	private WebElement botaoPassagemBebes;

	@FindBy(css = ".results-count")
	private WebElement totalResultadosVoo;

	@FindBy(xpath = "//*[@data-event-value='Ingresso Thermas dos Laranjais']")
	private WebElement linkIngresso;

	@FindBy(className = "mapx-produto-pacotes-click-oferta_btn_comprar_1")
	private WebElement botaoComprar;

	@FindBy(tagName = "select")
	private WebElement selectQuantidadePessoasParque;

	@FindBy(xpath = "//a[@title='Promoções de Viagens']")
	private WebElement linkPromocoes;

	@FindBy(xpath = "//div[@data-event-category='Coleção_Produtos_2']")
	private List<WebElement> locaisRegiaoSudestePromocao;

	@FindBy(xpath = "//h3[@class='component-card_title_h']/a")
	private List<WebElement> nomesDosHoteis;

	@FindBy(tagName = "td")
	private List<WebElement> diasDiponiveisParaReservaEntrada;

	private By campoDataDeEntrada = By.name("checkin");

	@FindBy(className = "ui-datepicker-month")
	private WebElement mesSelecionadoEntrada;

	@FindBy(name = "sku_quantity[]")
	private List<WebElement> selectNumeroDeQuartos;

	@FindBy(name = "adults")
	private List<WebElement> selectNumeroAdultos;

	@FindBy(name = "children")
	private List<WebElement> selectNumeroCriancas;

	@FindBy(xpath = "//input[@value='Reservar']")
	private WebElement botaoReservar;

	@FindBy(xpath = "//a[@title='Próximo']")
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

	public WebElement getNomeHotel() {
		return nomeHotel;
	}

	public List<WebElement> getIconesEstrelas() {
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

	public WebElement getBotaoPassagem12Mais() {
		return botaoPassagem12Mais;
	}

	public WebElement getBotaoPassagemCriancas() {
		return botaoPassagemCriancas;
	}

	public WebElement getBotaoPassagemBebes() {
		return botaoPassagemBebes;
	}
}
