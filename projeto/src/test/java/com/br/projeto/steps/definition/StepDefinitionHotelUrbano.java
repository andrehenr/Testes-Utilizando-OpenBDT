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
	public void acesso_ao_site_Hotel_Urbano() {
	    stepB.openHome("https://www.hotelurbano.com/");
	}

	@When("^clico na opcao de Hoteis$")
	public void clico_na_opcao_de_Hoteis() {
	    stepB.clicarEmHoteis();
	}

	@When("^preencho a pesquisa com a cidade \"([^\"]*)\"$")
	public void preencho_a_pesquisa_com_a_cidade(String cidade) {
	    stepB.preencheCampoPesquisa(cidade);
	}

	@When("^pressiono o botao de pesquisa$")
	public void pressiono_o_botao_de_pesquisa(){
	    stepB.clicarEmPesquisarHoteis();
	}

	@When("^filtro por hoteis cinco estrelas$")
	public void filtro_por_hoteis_cinco_estrelas() {
	    stepB.clicarCheckCincoEstrelas();
	}

	@When("^seleciono o primeiro hotel$")
	public void seleciono_o_primeiro_hotel() {
	    stepB.selecionaPrimeiroHotel();
	}

	@When("^verifico as cinco estrelas$")
	public void verifico_as_cinco_estrelas() {
	    Assert.assertTrue(stepB.verificarStatusCincoEstrelasDoHotel());
	}

	@Then("^exibo informacoes do hotel$")
	public void exibo_informacoes_do_hotel()  {
	    stepB.exibirInformacoesHotel();
	}

	@When("^clico na opcao de Aereos$")
	public void clico_na_opcao_de_Aereos() {
	    stepB.clicarEmAereos();
	}
	
	@When("^preencho o campo de destino do voo \"([^\"]*)\"$")
	public void preencho_o_campo_de_destino_do_voo(String destino) {
	    stepB.preencherCampoDestinoVoo(destino);
	}

	@When("^seleciono a data de ida \"([^\"]*)\"$")
	public void seleciono_a_data_de_ida(String dataIda){
		stepB.selecionaDataIdaVoo(dataIda);
	}
	
	@When("^seleciono a quantidade de adultos \"([^\"]*)\"$")
	public void seleciono_a_quantidade_de_adultos(int quantidadeAdultos) {
	    stepB.selecionarQuantidadeAdultos(quantidadeAdultos);
	}

	@When("^seleciono a quantidade de criancas \"([^\"]*)\"$")
	public void seleciono_a_quantidade_de_criancas(int quantidadeCriancas){
	    stepB.selecionarQuantidadeCriancas(quantidadeCriancas);
	}

	@When("^seleciono a quantidade de bebes \"([^\"]*)\"$")
	public void seleciono_a_quantidade_de_bebes(int quantidadeBebes) {
	    stepB.selecionarQuantidadeBebes(quantidadeBebes);
	}

	@When("^clico no botao para pesquisar$")
	public void clico_no_botao_para_pesquisar() throws Throwable {
	    stepB.clicarNoBotaoPesquisarVoo();
	}
	
	@Then("^exibo quantidade de resultados encontrados$")
	public void exibo_quantidade_resultados_encontrados() {
		stepB.exibirInformacoesVoo();
	}
}
