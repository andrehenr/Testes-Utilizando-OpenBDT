package com.br.projeto.steps.definition;

import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;

import com.br.projeto.steps.business.StepBusinessCorreios;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionCorreios {
	
	@Steps
	StepBusinessCorreios stepB;
	
	@Given("^acesso ao site dos Correios$")
	public void acessoAoSiteDosCorreios() {
		stepB.abreSiteCorreios();
	}
	
	@When("^preencho o campo de Busca dos Correios \"([^\"]*)\"$")
	public void preencherCampoBuscaCorreios(String busca) {
		stepB.preencheCampoBuscaPaginaInicial(busca);
	}
	
	@When("^inicio busca nos Correios$")
	public void iniciarBusca() {
		stepB.clicaEmPesquisa();
	}
	
	@Then("^verifico resultados da pesquisa por endereco$")
	public void verificarResultados() {
		stepB.analisaResultadosPesquisaEndereco();
	}
	
	@When("^preencho o campo de busca dos correios com CEP \"([^\"]*)\"$")
	public void preencherCampoDeBuscaCorreiosCEP(String cep) {
		stepB.preencheCampoBuscaPaginaInicial(cep);
	}
	
	@Then("^verifico resultados da pesquisa por cep \"([^\"]*)\"$")
	public void verificarResultadosPesquisaCep(String enderecoCorreto) {
		Assert.assertTrue(stepB.analisaResultadosPesquisaCep(enderecoCorreto));
	}
	
	@When("^clico em Calculador de Precos e Prazos Nacionais no menu suspenso$")
	public void clicoEmCalculadorPrecosPrazos() {
		stepB.clicaEmCalculadorPrecosPrazos();
	}
	
	@When("^insiro o cep de origem \"([^\"]*)\"$")
	public void insiroCepOrigem(String cepOrigem){
	    stepB.preencheCepOrigem(cepOrigem);
	}

	@When("^insiro o cep de destino \"([^\"]*)\"$")
	public void insiroCepDestino(String cepDestino){
	    stepB.preencheCepDestino(cepDestino);
	}

	@When("^seleciono o tipo de servico \"([^\"]*)\"$")
	public void selecionoTipoServico(String servico){
	    stepB.preencheTipoServico(servico);
	}
	
	@When("^seleciona formato \"([^\"]*)\"$")
	public void selecionaFormato(String formato) {
		stepB.selecionaFormato(formato);
	}
	
	@When("^seleciona origem de embalagem \"([^\"]*)\"$")
	public void selecionaTipoEmbalagem(String embalagem) {
		stepB.selecionaEmbalagem(embalagem);
	}
	
	@When("^seleciona tipo de embalagem \"([^\"]*)\"$")
	public void selecionaTamanhoEmbalagem(String tipoEmbalagem) {
		stepB.selecionaTipoEmbalagem(tipoEmbalagem);
	}
	
}
