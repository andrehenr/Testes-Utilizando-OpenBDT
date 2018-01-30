package com.br.projeto.steps.business;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.br.projeto.pages.PageObjectClassNetShoes;

import io.openbdt.element.WebBrowserScreenElement;
import jxl.common.Logger;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessNetShoes {

	PageObjectClassNetShoes page;
	private static Logger LOG = Logger.getLogger(StepBusinessNetShoes.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	@Step
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}
	
	public void clicarEmCalcados(){
		viewElement.click(page.getLinkCalcados());
	}
	
	public void buscarPorTenis(String busca){
		for(WebElement elemento : page.getListaCalcados()){
			if(elemento.getText().contains(busca)){
				viewElement.click(elemento);
				break;
			}
		}
	}
	
	public void selecionarCorTenis(String cor){
		for(WebElement elemento: page.getListaCoresCalcados()){
			if(elemento.getText().contains(cor)){
				viewElement.click(elemento);
				break;
			}
		}
	}

	public void selecionarTamanhoTenis(String tamanho) {
		for(WebElement elemento: page.getListaTamanhoCalcados()){
			if(elemento.getText().equals(tamanho)){
				viewElement.click(elemento);
				break;
			}
		}
	}

	public void clicarEmComprar() {
		viewElement.click(page.getBotaoComprar());
	}

	public boolean validarProdutoCorreto(String busca, String cor, String tamanho) {
		return page.getNomeProduto().getText().contains(busca) &&
				page.getListaAtributosPreCompra().get(0).getText().contains(cor) &&
				page.getListaAtributosPreCompra().get(1).getText().contains(tamanho);
	}

	public void pesquisarCamisetaSelecao() {
		viewElement.sendText(page.getCampoBusca(), "Camiseta Seleção Brasileira" + Keys.ENTER.toString());
	}

	public void selecionarPorPalavra(String busca) {
		for(WebElement elemento : page.getListaCamisetas()){
			if(viewElement.getText(elemento).contains(busca)){
				viewElement.click(elemento);
				break;
			}
		} 
	}

	public void selecionarTamanhoCamiseta(String tamanho) {
		for(WebElement elemento : page.getListaTamanhoCamisetas()){
			if(elemento.getText().equals(tamanho)){
				viewElement.click(elemento);
				break;
			}
		}
	}

	public boolean validarInformacoesCamiseta(String palavra, String tamanho) {
		return page.getListaAtributosPreCompra().get(1).getText().contains(tamanho) &&
				page.getNomeProduto().getText().contains(palavra);
	}

	public void preencherCaixaBusca(String busca) {
		viewElement.sendText(page.getCampoBusca(), busca + Keys.ENTER.toString());
	}

	public void clicarEmTenis() {
		viewElement.click(page.getLinkTenisOutlet());
	}

	public void buscarPorTenis(double preco) {
		for(WebElement elemento: page.getListaTenisPreco()){
			String valorModificado = elemento.getText().replace(",", ".").substring(3);
			if(Double.valueOf(valorModificado) < preco){
				viewElement.click(elemento);
				break;
			}
		}
	}

	public void selecionarTamanhoCalcado(String tamanho) {
		for(WebElement elemento : page.getListaTamanhoTenis()){
			if(elemento.getText().equals(tamanho)){
				viewElement.click(elemento);
			}
		}
	}

	public void clicarEmCalcularFrete() {
		viewElement.click(page.getBotaoCalcularFrete());
	}

	public void preencherCampoCEP(String cep) {
		String[] cepSeparado = cep.split("-");
		viewElement.sendText(page.getPrimeiroCampoCEP(), cepSeparado[0]);
		viewElement.sendText(page.getSegundoCampoCep(), cepSeparado[1]);
	}

	public void exibirFrete() {
		LOG.info(viewElement.getText(page.getInformacoesSobreFrete()));
	}

	public void clicarEmLimparCarinho() {
		viewElement.click(page.getLinkLimparCarrinho());
	}

	public void clicarEmVoltarParaALoja() {
		viewElement.click(page.getLinkVoltarParaLoja());
	}

	public boolean validarPaginaInicial() {
		return viewElement.getDriver().getCurrentUrl().equals("http://www.netshoes.com.br/");
	}
	
}
