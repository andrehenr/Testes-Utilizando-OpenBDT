package com.br.projeto.steps.definition;

import java.util.UUID;

import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;

import com.br.projeto.steps.business.StepBusinessNetShoes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionNetShoes {

	@Steps
	StepBusinessNetShoes stepB;
	
	@Given("^acesso a pagina inicial da Net Shoes$")
	public void acessoPaginaInicialNetShoes() {
		stepB.openHome("http://www.netshoes.com.br/");
	}

	@When("^clico sobre o link de Calcados$")
	public void clicoSobreLinkCalcados(){
		stepB.clicarEmCalcados();
	}

	@When("^pesquiso por tenis \"([^\"]*)\"$")
	public void pesquisoPorTenis(String busca){
		stepB.buscarPorTenis(busca);
	}
	
	@When("^seleciono cor do tenis \"([^\"]*)\"$")
	public void selecionoCorTenis(String cor){
		stepB.selecionarCorTenis(cor);
	}
	
	@When("^seleciono tamanho do tenis \"([^\"]*)\"$")
	public void selecionoTamanhoTenis(String tamanho){
		stepB.selecionarTamanhoTenis(tamanho);
	}
	
	@When("^clico em Comprar Tenis$")
	public void clicoEmComprar(){
		stepB.clicarEmComprar();
	}
	
	@Then("^valido escolha correta \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void validoEscolhaCorreta(String busca, String cor, String tamanho){
	    Assert.assertTrue(stepB.validarProdutoCorreto(busca,cor,tamanho));
	}
	
	@When("^pesquiso por Camiseta da Selecao$")
	public void pesquisoCamisetaSelecao(){
		stepB.pesquisarCamisetaSelecao();
	}
	
	@When("^seleciono por palavra \"([^\"]*)\"$")
	public void selecionoPorPalavra(String busca){
		stepB.selecionarPorPalavra(busca);
	}
	
	@When("^seleciono tamanho da Camiseta \"([^\"]*)\"$")
	public void selecionarTamanhoCamiseta(String tamanho){
		stepB.selecionarTamanhoCamiseta(tamanho);
	}
	
	@When("^clico em Comprar Camiseta$")
	public void clicoComprarCamiseta(){
		stepB.clicarEmComprar();
	}
	
	@Then("^valido informacoes do produto na cesta \"([^\"]*)\" \"([^\"]*)\"$")
	public void validoInformacoesProdutoCesta(String palavra, String tamanho){
	    Assert.assertTrue(stepB.validarInformacoesCamiseta(palavra, tamanho));
	}
	
	@When("^busco por outlet na caixa de busca$")
	public void buscoPorOutletCaixaBusca(){
	    stepB.preencherCaixaBusca("Ofertas");
	}

	@When("^clico no link de Tenis na secao Outlet$")
	public void clicoLinkTenisOutlet(){
		stepB.clicarEmTenis();
	}
	
	@When("^pesquiso por tenis com \"([^\"]*)\"$")
	public void pesquisoPorTenisCom(double preco){
		stepB.buscarPorTenis(preco);
	}
	
	@When("^seleciono tamanho \"([^\"]*)\"$")
	public void selecionarTamanho(String tamanho){
		stepB.selecionarTamanhoTenis(tamanho);
	}
	
	@When("^clico em calcular frete$")
	public void clicoEmCalcularFrete(){
		stepB.clicarEmCalcularFrete();
	}
	
	@When("^preencho o cep \"([^\"]*)\"$")
	public void preenchoCEP(String cep){
		stepB.preencherCampoCEP(cep);
	}
	
	@When("^exibo frete para o produto$")
	public void exiboFrete(){
		stepB.exibirFrete();
	}
	
	@When("^clico em Limpar Carrinho$")
	public void clicoLimparCarrinho(){
		stepB.clicarEmLimparCarinho();
	}
	
	@When("^clico em Volta Para a Loja$")
	public void clicoVoltarParaALoja(){
		stepB.clicarEmVoltarParaALoja();
	}
	
	@When("^valido a volta para a pagina inicial$")
	public void validoVoltaPaginaInicial(){
		Assert.assertTrue(stepB.validarPaginaInicial());
	}
}
