package com.br.projeto.steps.business;

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
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	@Step
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}

	public void clicarEmProdutosReembalados() {
		viewElement.click(page.getLinkProdutosReembalados());
	}

	public void selecionarProdutoPorPalavra(String busca) {
		for(WebElement elemento: page.getListaDePordutosReembalados()){
			if(elemento.getText().contains(busca)){
				viewElement.click(elemento);
				break;
			}
		}
	}
	
	public void clicarEmComprar(){
		viewElement.click(page.getBotaComprar());
	}
	
	public void confirmaProdutoReembalado(){
		viewElement.click(page.getLinkConfirmaCompraReembalado());
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
			e.printStackTrace();
		}
	}
	
	public void preencherCep(String CEP){
		viewElement.sendText(page.getCampoCEP(), CEP);
		viewElement.click(page.getBotaoCalculaFrete());
	}

	public void selecionarTipoFrete(int tipoFrete) {
		viewElement.waitForElementIsPresent(10, page.getOpcoesFrete().get(2));
		viewElement.click(page.getOpcoesFrete().get(tipoFrete - 1));
	}

	public void clicarEmComprarPaginaFrete() {
		viewElement.click(page.getBotaoComprarPaginaFrete());
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
		for(WebElement elemento: page.getListaDeGeladeirasFreezeres()){
			if(elemento.getText().contains(marca)){
				viewElement.click(elemento);
				break;
			}
		}
	}

	public void pesquisarPor(String iphone) {
		viewElement.sendText(page.getCampoBusca(), iphone + Keys.ENTER.toString());
	}

	public void selecionarPrimeiroProdutoDaBusca() {
		viewElement.click(page.getListaProdutosPosPesquisa().get(0));
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

}
