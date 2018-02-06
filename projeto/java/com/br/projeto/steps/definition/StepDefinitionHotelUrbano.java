package com.br.projeto.steps.definition;

import java.util.UUID;

import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;

import com.br.projeto.steps.business.StepBusinessHotelUrbano;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionHotelUrbano {

	@Steps
	StepBusinessHotelUrbano stepB;
	
	@Given("^acesso ao site Hotel Urbano$")
	public void acessoSiteHotelUrbano() {
	    stepB.openHome("https://www.hotelurbano.com/");
	}

	@When("^clico na opcao de Hoteis$")
	public void clicoOpcaoHoteis() {
	    stepB.clicarEmHoteis();
	}

	@When("^preencho a pesquisa com a cidade \"([^\"]*)\"$")
	public void preenchoPesquisaComCidade(String cidade) {
	    stepB.preencheCampoPesquisa(cidade);
	}

	@When("^pressiono o botao de pesquisa$")
	public void pressionoBotaoPesquisa(){
	    stepB.clicarEmPesquisarHoteis();
	}

	@When("^filtro por hoteis cinco estrelas$")
	public void filtroHoteisCincoEstrelas() {
	    stepB.clicarCheckCincoEstrelas();
	}

	@When("^seleciono o primeiro hotel$")
	public void selecionoPrimeiroHotel() {
	    stepB.selecionaPrimeiroHotel();
	}

	@When("^verifico as cinco estrelas$")
	public void verificoCincoEstrelas() {
	    Assert.assertTrue(stepB.verificarStatusCincoEstrelasDoHotel());
	}

	@Then("^exibo informacoes do hotel$")
	public void exiboInformacoesHotel()  {
	    stepB.exibirInformacoesHotel();
	}

	@When("^clico na opcao de Aereos$")
	public void clicoOpcaoAereos() {
	    stepB.clicarEmAereos();
	}
	
	@When("^preencho o campo de destino do voo \"([^\"]*)\"$")
	public void preenchoCampoDestinoVoo(String destino) {
	    stepB.preencherCampoDestinoVoo(destino);
	}

	@When("^seleciono a data de ida \"([^\"]*)\"$")
	public void selecionoDataIda(String dataIda){
		stepB.selecionaDataIdaVoo(dataIda);
	}
	
	@When("^seleciono a quantidade de adultos \"([^\"]*)\"$")
	public void selecionoQuantidadeAdultos(int quantidadeAdultos) {
	    stepB.selecionarQuantidadeAdultos(quantidadeAdultos);
	}

	@When("^seleciono a quantidade de criancas \"([^\"]*)\"$")
	public void selecionoQuantidadeCriancas(int quantidadeCriancas){
	    stepB.selecionarQuantidadeCriancas(quantidadeCriancas);
	}

	@When("^seleciono a quantidade de bebes \"([^\"]*)\"$")
	public void selecionoQuantidadeBebes(int quantidadeBebes) {
	    stepB.selecionarQuantidadeBebes(quantidadeBebes);
	}

	@When("^clico no botao para pesquisar$")
	public void clicoBotaoPesquisar() throws Throwable {
	    stepB.clicarNoBotaoPesquisarVoo();
	}
	
	@Then("^exibo quantidade de resultados encontrados$")
	public void exiboQuantidadeResultadosEncontrados() {
		stepB.exibirInformacoesVoo();
	}
	
	@When("^preencho o campo de pesquisa com \"([^\"]*)\"$")
	public void preenchoCampoBusca(String busca) {
	    stepB.preencherCampoBusca(busca);
	}
	
	@When("^seleciono a opcao de ingresso$")
	public void selecionoOpcaoIngresso() {
		stepB.selecionarOpcaoIngresso();
	}
	
	@When("^seleciono a primeira opcao$")
	public void selecionoPrimeiraOpcao() {
		stepB.selcionarPrimeiraOpcaoResultadoIngresso();
	}
	
	@When("^acesso a pagina do Parque$")
	public void acessoPaginaParque() {
		stepB.acessoPaginaParque();
	}
	
	@When("^selecionar numero pessoas \"([^\"]*)\"$")
	public void selecionar_numero_pessoas(String pessoas) {
	    stepB.selecionarQuantidadePessoasParque(pessoas);
	}

	@When("^clicar em Comprar$")
	public void clicar_em_Comprar(){
	    stepB.clicarEmComprar();
	}
	
	@When("^clico em Promocoes$")
	public void clico_em_Promocoes(){
	    stepB.clicarEmPromocoes();
	}

	@Then("^verifico promocoes para \"([^\"]*)\"$")
	public void verificoPromocoesPara(String local) {
	    Assert.assertTrue(stepB.verificarPromocoes(local));
	}
	
	@When("^seleciono hotel \"([^\"]*)\"$")
	public void selecionoHotel(String nomeHotel){
	    stepB.selecionarHotelPeloNome(nomeHotel);
	}
	@When("^seleciono data de Entrada \"([^\"]*)\"$")
	public void selecionoDataEntrada(String dataEntrada) {
	    stepB.selecionaDataEntrada(dataEntrada);
	}

	@When("^seleciono data Saida \"([^\"]*)\"$")
	public void selecionoDataSaida(String dataSaida){
	    stepB.selecionaDataSaida(dataSaida);
	}
	
	@When("^seleciono numero de quartos \"([^\"]*)\"$")
	public void seleciono_numero_de_quartos(int numeroQuartos){
	    stepB.selecionarNumeroQuartos(numeroQuartos);
	}

	@When("^seleciono numero de adultos \"([^\"]*)\"$")
	public void seleciono_numero_de_adultos(int adultos){
	    stepB.selecionarNumeroAdultos(adultos);
	}

	@When("^seleciono numero de criancas \"([^\"]*)\"$")
	public void seleciono_numero_de_criancas(int criancas) {
	    stepB.selecionarNumeroCriancas(criancas);
	}

	@When("^clico em Reservar$")
	public void clico_no_botao_verificar_disponibilidade() {
		stepB.clicarEmReservar();
	}
}
