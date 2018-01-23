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
