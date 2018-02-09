package com.br.projeto.steps.business;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.br.projeto.pages.PageObjectClassNetShoes;

import groovyjarjarantlr.collections.List;
import io.openbdt.element.WebBrowserScreenElement;
import jxl.common.Logger;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessNetShoes {

	PageObjectClassNetShoes page;
	private static Logger LOG = Logger.getLogger(StepBusinessNetShoes.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement;

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
			if(elemento.getAttribute("data-property-name").contains(cor)){
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
		String[] corConcatenada = cor.split(" e ");
		ArrayList<String> atributos = new ArrayList<>();
		atributos.add(page.getListaAtributosPreCompra().get(0).getText());
		atributos.add(page.getListaAtributosPreCompra().get(1).getText());
		if(atributos.get(0).contains("Cor")){
			return page.getNomeProduto().getText().contains(busca) && atributos.get(0).contains(corConcatenada[0]+"+"+corConcatenada[1]) && atributos.get(1).contains(tamanho);
		}
		else{
			return page.getNomeProduto().getText().contains(busca) && atributos.get(0).contains(tamanho) && atributos.get(1).contains(corConcatenada[0]+"+"+corConcatenada[1]);
		}
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
		for(WebElement element: page.getListaAtributosPreCompra()){
			if(element.getText().contains(tamanho)){
				return page.getNomeProduto().getText().contains(palavra);
			}
		}
		return false;
				
	}

	public void preencherCaixaBusca(String busca) {
		viewElement.sendText(page.getCampoBusca(), busca + Keys.ENTER.toString());
	}

	public void clicarEmTenis() {
		for(WebElement element: page.getLinksOutlet()){
			if(element.getText().contains("Calçados Masculinos")){
				viewElement.click(element);
				break;
			}
		}
	}

	public void buscarPorTenis(double preco) {
		for(int i = 0; i < page.getListaTenisPreco().size(); i++){
			WebElement element = page.getListaTenisPreco().get(i);
			String valorModificado = element.getText().replace(",", ".").substring(3,9).replace(" ", "");
			if(Double.valueOf(valorModificado) < preco){
				viewElement.click(page.getListaCalcados().get(i));
				break;
			}
		}
	}

	public void selecionarTamanhoCalcado(String tamanho) {
		for(WebElement elemento : page.getListaTamanhoTenis()){
			if(elemento.getText().equals(tamanho)){
				viewElement.click(elemento);
				break;
			}
		}
	}

	public void clicarEmCalcularFrete() {
		viewElement.click(page.getBotaoCalcularFrete());
	}

	public void preencherCampoCEP(String cep) {
		viewElement.sendText(page.getCampoCEP(), cep);
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
