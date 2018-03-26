package com.br.projeto.steps.business;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.br.projeto.pages.PageObjectClassSouBarato;

import io.openbdt.element.WebBrowserScreenElement;
import jxl.common.Logger;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessSouBarato {

	PageObjectClassSouBarato page;
	private static Logger LOG = Logger.getLogger(StepBusinessSouBarato.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement;
	

	@Step
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}
	
	public void fecharPopUpReceberPromocoes(){
		viewElement.click(page.getBotaoFechaAbaReceberPromocoes());
	}

	public void clicarEmProdutosReembalados() {
		viewElement.click(page.getLinkProdutosReembalados());
	}

	public void selecionarProdutoPorPalavra(String busca) {
		for(WebElement elemento: page.getListaDeProdutos()){
			if(elemento.getText().contains(busca)){
				viewElement.click(elemento);
				break;
			}
		}
	}
	
	public void clicarEmComprar(){
		viewElement.click(page.getBotaoComprar());
	}
	
	public void confirmaProdutoReembalado(){
		viewElement.click(page.getLinkConfirmaCompraReembalado());
		viewElement.click(page.getBotaoContinuarPaginaGarantia());
	}
	
	public void selecionarQuantidadeProduto(int quantidade){
		if(!viewElement.getDriver().getPageSource().contains("Minha sacola")){
			viewElement.click(page.getBotaoContinuarPaginaGarantia());
		}
		viewElement.waitForElementIsPresent(20, page.getTituloMinnhaSacola());
		viewElement.selectByVisibleText(page.getSelectQuantidadeProdutos(), quantidade+"");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			LOG.error(e.getStackTrace().toString());
		}
	}
	
	public void preencherCep(String CEP){
		viewElement.sendText(page.getCampoCEP(), CEP);
		viewElement.click(page.getBotaoCalculaFrete());
	}

	public void selecionarTipoFrete(int tipoFrete) {
		viewElement.waitForElementIsPresent(30, page.getOpcoesFrete().get(2));
		viewElement.click(page.getOpcoesFrete().get(tipoFrete - 1));
	}
	
	public boolean validarPaginaLogin() {
		return viewElement.getText(page.getTituloLogin()).equals("Identificação");
	}

	public void clicarEmMenu() {
		viewElement.click(page.getBotaoMenu());
	}

	public void selecionarOpcaoEletrodomesticos() {
		viewElement.mouseOver(page.getOpcaoEletrometiscos());
	}

	public void clicarEmGeladeirasFreezeres() {
		viewElement.click(page.getOpcaoGeladeirasFreezeres());
	}

	public void selecionarGeladeiraMarca(String marca) {
		for(WebElement elemento: page.getListaDeProdutos()){
			if(elemento.getText().contains(marca)){
				viewElement.click(elemento);
				break;
			}
		}
	}

	public void pesquisarPor(String iphone) {
		viewElement.click(page.getCampoBusca());
		viewElement.sendText(page.getCampoBusca(), iphone + Keys.ENTER.toString());
	}

	public void selecionarPrimeiroProdutoDaBusca() {
		viewElement.click(page.getListaDeProdutos().get(0));
	}

	public void passarMouseSobreVantagens() {
		viewElement.mouseOver(page.getAbaVantagens());
	}
	
	public void clicarEmConhecaVantagens(){
		viewElement.mouseOver(page.getLinkConhecaVantagens());
		viewElement.click(page.getLinkConhecaVantagens());
	}
	
	public boolean verificaAbaVantagensAberta(){
		return viewElement.isEnabled(page.getAbaVantagensAberta());
	}

	public void clicarLinkLimite() {
		viewElement.click(page.getLinkLimite());
	}

	public void clicarEmLinkProdutosUsados() {
		viewElement.click(page.getLinkPordutosUsados());
	}

	public void exibirFretes() {
		LOG.info("Fretes disponíveis");
		for(WebElement elemento : page.getOpcoesFrete()){
			LOG.info(elemento.getText());
		}
	}

	public void clicarEmComprarAntesPaginaLogin() {
		viewElement.waitAndClick(page.getBotoesComprarPaginaFrete().get(1),30);
	}

}
