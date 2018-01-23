package com.br.projeto.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassHotelUrbano extends PageObject {

	@FindBy(xpath = "//*[@id=\"reactRoot\"]/div/div[1]/div/div[1]/div[1]/header/div/div[2]/nav/a[2]")
	private WebElement linkHoteis;

	@FindBy(name = "q")
	private WebElement caixaPesquisaHoteis;

	@FindBy(xpath = "//*[@id=\"get-intent-midia\"]/div/form/div[2]/div[2]/button")
	private WebElement botaoPesquisarHoteis;

	@FindBy(xpath = "//*[@id=\"filters\"]/aside/div[2]/div[2]/div[2]/label[1]")
	private WebElement checkBoxHoteisCincoEstrelas;

	@FindBy(xpath = "//*[@id='result-card']/div")
	private List<WebElement> resultadoDosHoteis;
	
	@FindBy(xpath = "//*[@id='wrap-page-head']/div[1]/span/i")
	private List<WebElement> iconesEstrelas;
	
	@FindBy(xpath = "//*[@id='wrap-page-head']/div[1]/h1/span")
	private WebElement nomeHotel;
	
	@FindBy(xpath = "//*[@id='search']/div[1]/div[4]/div/div/div/input")
	private WebElement campoDestinoVoo;
	
	@FindBy(xpath = "//*[@id='search-date-depart']/div[1]/button")
	private WebElement campoDataIda;
	
	@FindBy(xpath = "//*[@id='date-depart_root']/div/div/div/div/div[2]/div[1]/div/button/div/span")
	private WebElement mesSelecionadoIda;
	
	@FindBy(xpath = "//*[@id='date-depart_root']/div/div/div/div/div[2]/div[3]")
	private WebElement botaoProximoMes;
	
	@FindBy(xpath = "//*[@id='date-depart_table']/tbody/tr/td/div")
	private List<WebElement> diasDoCalendarioEmExibicao;
	
	@FindBy(xpath = "//*[@id='people-and-class']/div[2]/div[1]/div/div/ul/li/a")
	private List<WebElement> quantidadePassagemDozeMais;
	
	@FindBy(xpath = "//*[@id='people-and-class']/div[2]/div[2]/div/div/ul/li/a")
	private WebElement quantidadePassagensDozeMenos;
	
	@FindBy(xpath = "//*[@id='people-and-class']/div[2]/div[4]/div/div/ul/li/a")
	private WebElement quantidadePassagemBebes;
	
	@FindBy(xpath = "//*[@id='search']/a")
	private WebElement botaoPesquisarVoos;
	
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

	public List<WebElement> getQuantidadePassagemDozeMais() {
		return quantidadePassagemDozeMais;
	}

	public WebElement getQuantidadePassagensDozeMenos() {
		return quantidadePassagensDozeMenos;
	}

	public WebElement getQuantidadePassagemBebes() {
		return quantidadePassagemBebes;
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
}
