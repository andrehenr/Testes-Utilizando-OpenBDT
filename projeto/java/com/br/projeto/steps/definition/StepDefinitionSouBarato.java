package com.br.projeto.steps.definition;

import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;

import com.br.projeto.steps.business.StepBusinessSouBarato;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionSouBarato {

	@Steps
	StepBusinessSouBarato stepB;
	
	@Given("^entro na pagina incial do Sou Barato$")
	public void acessarSouBarato() {
	    stepB.openHome("http://www.soubarato.com.br/");
	}

	@When("^clico no link de Produtos Reembalados$")
	public void clicarLinkProdutos_Reembalados(){
		stepB.clicarEmProdutosReembalados();
	}

	@When("^seleciono produto que tem a palavra \"([^\"]*)\"$")
	public void selecionarProduto(String busca){
		stepB.selecionarProdutoPorPalavra(busca);
	}
	
	@When("^clico em comprar produto$")
	public void clicarProduto(){
		stepB.clicarEmComprar();
	}
	
	@When("^confirmo que quero produto$")
	public void confirmarProduto(){
		stepB.confirmaProdutoReembalado();
	}
	
	@When("^seleciono a quantidade \"([^\"]*)\"$")
	public void selecionoQuantidade(int quantidade){
		stepB.selecionarQuantidadeProduto(quantidade);
	}
	
	@When("^preencho cep \"([^\"]*)\"$")
	public void preenchoCEP(String CEP){
		stepB.preencherCep(CEP);
	}
	
	@When("^seleciono tipo de frete \"([^\"]*)\"$")
	public void selecionoTipoFrete(int tipoFrete){
	    stepB.selecionarTipoFrete(tipoFrete);
	}
	
	@When("^clico em Comprar$")
	public void clicoComprar(){
		stepB.clicarEmComprarPaginaFrete();
	}
	
	@Then("^valido pagina de identificacao$")
	public void validoPaginaIdentificacao(){
		Assert.assertTrue(stepB.validarPaginaLogin());
	}
	
	@Given("^clico no menu$")
	public void clicoMenu() {
	    stepB.clicarEmMenu();
	}

	@Given("^seleciono Eletrodomesticos$")
	public void seleciono_Eletrodomesticos() {
		stepB.selecionarOpcaoEletrodomesticos();
	}

	@Given("^clico na opcao de Geladeiras e Freezeres$")
	public void clicoOpcaoGeladeirasFreezeres(){
		stepB.clicarEmGeladeirasFreezeres();
	}
	
	@Given("^seleciono geladeira por marca \"([^\"]*)\"$")
	public void selecionoGeladeiraMarca(String marca){
	    stepB.selecionarGeladeiraMarca(marca);
	}
}
