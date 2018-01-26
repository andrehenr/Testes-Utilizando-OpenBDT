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
	
	@When("^seleciono formato \"([^\"]*)\"$")
	public void selecionaFormato(String formato) {
		stepB.selecionaFormato(formato);
	}
	
	@When("^seleciono origem de embalagem \"([^\"]*)\"$")
	public void selecionaTipoEmbalagem(String embalagem) {
		stepB.selecionaEmbalagem(embalagem);
	}
	
	@When("^seleciono tipo de embalagem \"([^\"]*)\"$")
	public void selecionaTamanhoEmbalagem(String tipoEmbalagem) {
		stepB.selecionaTipoEmbalagem(tipoEmbalagem);
	}
	
	@When("^seleciono peso do envio \"([^\"]*)\"$")
	public void seleciono_peso_do_envio(String peso){
	    stepB.selecionarPesoEnvio(peso);
	}

	@When("^seleciono opcao Mao Propria \"([^\"]*)\"$")
	public void seleciono_opcao_Mao_Propria(String maoPropria) {
	    stepB.selecionarMaoPropria(maoPropria);
	}

	@When("^seleciono opcao Aviso de recebimento \"([^\"]*)\"$")
	public void seleciono_opcao_Aviso_de_recebimento(String avisoRecebimento){
	    stepB.selecionarAvisoRecebimento(avisoRecebimento);
	}

	@When("^seleciono opcao Declaracao de Valor \"([^\"]*)\"\"([^\"]*)\"$")
	public void seleciono_opcao_Declaracao_de_Valor(String stringBooleana, String valor){
	    stepB.selecionarDeclaracaoValor(stringBooleana, valor);
	}

	@When("^clico em Enviar$")
	public void clico_em_Enviar(){
	    stepB.clicarEmEnviar();
	}
	
	@Then("^exibo preco e prazo$")
	public void exibo_preco_e_prazo() {
		stepB.exibirPrecoPrazo();
	}
	
	@When("^clico na opcao Rede de Atendimento$")
	public void clico_na_opcao_Rede_de_Atendimento(){
	    stepB.clicarEmRedeDeAtendimento();
	}
	
	@When("^seleciono o tipo de busca por localidade$")
	public void seleciono_o_tipo_de_busca(){
	    stepB.selecionarTipoBusca();
	}
	
	@When("^seleciono estado da agencia \"([^\"]*)\"$")
	public void seleciono_estado_da_agencia(String estado){
	    stepB.selecionarEstadoAgencia(estado);
	}

	@When("^seleciono municipio da agencia \"([^\"]*)\"$")
	public void seleciono_municipio_da_agencia(String municipio){
	    stepB.selecionarMunicipioAgencia(municipio);
	}

	@When("^seleciono bairro da agencia \"([^\"]*)\"$")
	public void seleciono_bairro_da_agencia(String bairro){
	    stepB.selecionarBairroAgencia(bairro);
	}

	@Then("^exibo agencias encontradas$")
	public void exibo_agencias_encontradas() {
	    stepB.exibirAgencias();
	}
	
	@When("^insiro o cep da RSI OSASCO \"([^\"]*)\"$")
	public void insiro_o_cep_da_RSI_OSASCO(String cepRSIOsasco) {
		stepB.preencheCepOrigem(cepRSIOsasco);
	}
	
	@When("^insiro o cep da RSI ALPHAVILLE \"([^\"]*)\"$")
	public void insiro_o_cep_da_RSI_ALPHAVILLE(String cepRSIAlphaville) {
		stepB.preencheCepDestino(cepRSIAlphaville);
	}
	
}
