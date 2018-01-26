package com.br.projeto.steps.business;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.br.projeto.pages.PageObjectClassHotelUrbano;

import io.openbdt.element.WebBrowserScreenElement;
import jxl.common.Logger;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessHotelUrbano {

	PageObjectClassHotelUrbano page;
	private static Logger LOG = Logger.getLogger(StepBusinessHotelUrbano.class);

	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	@Step
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}

	public void clicarEmHoteis() {
		viewElement.click(page.getLinkHoteis());
	}

	public void preencheCampoPesquisa(String cidade) {
		viewElement.sendText(page.getCaixaPesquisaHoteis(), cidade);
	}

	public void clicarEmPesquisarHoteis() {
		viewElement.click(page.getBotaoPesquisarHoteis());
	}

	public void clicarCheckCincoEstrelas() {
		viewElement.waitForElementIsPresent(10, page.getCheckBoxHoteisCincoEstrelas());
		viewElement.scrollIntoView(page.getCheckBoxHoteisCincoEstrelas());
		viewElement.click(page.getCheckBoxHoteisCincoEstrelas());
	}

	public void selecionaPrimeiroHotel() {
		viewElement.waitForElementIsPresent(10, page.getResultadoDosHoteis().get(1));
		List<WebElement> listaElementos = page.getResultadoDosHoteis();
		listaElementos.get(1).click();
		mudaDePagina(null);
	}

	public void mudaDePagina(WebElement elementoEsperado) {
		for (String windows : viewElement.getDriver().getWindowHandles()) {
			viewElement.getDriver().switchTo().window(windows);
		}
		if (elementoEsperado != null)
			viewElement.waitForElementIsPresent(30, elementoEsperado);
	}

	public boolean verificarStatusCincoEstrelasDoHotel() {
		return page.getIconesEstrelas().size() == 5;
	}

	public void exibirInformacoesHotel() {
		LOG.info("Hotel Cinco Estrelas: " + page.getNomeHotel().getText());
	}

	public void clicarEmAereos() {
		viewElement.click(page.getLinkAereos());
	}

	public void preencherCampoDestinoVoo(String destino) {
		viewElement.waitAndClick(page.getLinkCampoDestino(), 10);
		viewElement.sendText(page.getCampoDestinoVoo(), destino);
	}

	public void selecionaDataIdaVoo(String dataIda) {
		String[] data = dataIda.split(" ");
		viewElement.click(page.getCampoDataIda());
		while (!page.getMesSelecionadoIda().getText().contains(data[1])) {
			viewElement.click(page.getBotaoProximoMes());
		}
		boolean comecouMes = false;
		int d = 0;
		while (!comecouMes) {
			if (page.getDiasDoCalendarioEmExibicao().get(d).getText().equals("1")) {
				comecouMes = true;
			} else {
				d++;
			}
		}
		while (!page.getDiasDoCalendarioEmExibicao().get(d).getText().equals(Integer.valueOf(data[0]).toString())) {
			d++;
		}
		viewElement.click(page.getDiasDoCalendarioEmExibicao().get(d));
	}

	public void selecionarQuantidadeAdultos(int quantidadeAdultos) {
		viewElement.click(page.getCamposPassagem().get(0));
		viewElement.click(page.getQuantidadePassagensDozeMais().get(quantidadeAdultos - 1));
	}

	public void selecionarQuantidadeCriancas(int quantidadeCriancas) {
		viewElement.click(page.getCamposPassagem().get(1));
		viewElement.click(page.getQuantidadePassagensDozeMenos().get(quantidadeCriancas));
	}

	public void selecionarQuantidadeBebes(int quantidadeBebes) {
		viewElement.click(page.getCamposPassagem().get(2));
		viewElement.click(page.getQuantidadePassagensBebes().get(quantidadeBebes));
	}

	public void clicarNoBotaoPesquisarVoo() {
		viewElement.click(page.getBotaoPesquisarVoos());

	}

	public void exibirInformacoesVoo() {
		viewElement.waitForElementIsPresent(30, page.getTotalResultadosVoo());
		viewElement.scrollIntoView(page.getTotalResultadosVoo());
		String resultado = page.getTotalResultadosVoo().getText();
		LOG.info(resultado.substring(resultado.indexOf("e ") + 1));
	}

	public void preencherCampoBusca(String busca) {
		viewElement.sendText(page.getCaixaPesquisaHoteis(), busca);
	}

	public void selecionarOpcaoIngresso() {
		viewElement.waitForElementIsPresent(10, page.getLinkIngressoThermas());
		viewElement.click(page.getLinkIngressoThermas());
	}

	public void selcionarPrimeiraOpcaoResultadoIngresso() {
		viewElement.waitAndClick(page.getResultadoDosHoteis().get(0), 10);
	}

	public void acessoPaginaParque() {
		this.mudaDePagina(null);
	}

	public void selecionarQuantidadePessoasParque(String pessoas) {
		viewElement.selectByVisibleText(page.getSelectQuantidadePessoasParque(), pessoas);
	}

	public void clicarEmComprar() {
		viewElement.click(page.getBotaoComprar());
	}

	public void clicarEmPromocoes() {
		viewElement.click(page.getLinkPromocoes());
	}

	public boolean verificarPromocoes(String local) {
		for (WebElement elemento : page.getLocaisRegiaoSudestePromocao()) {
			if (elemento.getText().contains(local)) {
				return true;
			}
		}
		return false;
	}

	public void selecionarHotelPeloNome(String nomeHotel) {
		viewElement.waitForElementIsPresent(20, page.getNomesDosHoteis().get(0));
		for (int i = 0; i < page.getNomesDosHoteis().size(); i++) {
			if (page.getNomesDosHoteis().get(i).getText().contains(nomeHotel)) {
				viewElement.click(page.getResultadoDosHoteis().get(i));
				mudaDePagina(null);
			}
		}
	}

	public void selecionaDataEntrada(String dataEntrada) {
		viewElement.click(viewElement.findElements(page.getCampoDataDeEntrada()).get(2));
		selecionarDataNoDatePicker(dataEntrada, page.getMesSelecionadoEntrada(),page.getBotaoProximoMes(),
				page.getDiasDiponiveisParaReservaEntrada(),35);
	}

	public void selecionaDataSaida(String dataSaida) {
		selecionarDataNoDatePicker(dataSaida, page.getMesSelecionadoEntrada(),page.getBotaoProximoMes(),
				page.getDiasDiponiveisParaReservaEntrada(),35);
	}

	private void selecionarDataNoDatePicker(String dataCompleta, WebElement elementoContemMes,
			WebElement botaoProximoMes, List<WebElement> listaDosDias, int totalDiasDatePodeConter) {
		String[] data = dataCompleta.split(" ");
		String stringDia = data[0];
		String stringMes = data[2];
		Integer dia = Integer.valueOf(stringDia);
		boolean mesMudou = false;
		while (!elementoContemMes.getText().contains(stringMes)) {
			viewElement.click(botaoProximoMes);
			mesMudou = true;
		}
		if (!mesMudou && listaDosDias.size() != totalDiasDatePodeConter) {
			Integer primeiroDia = Integer.valueOf(listaDosDias.get(0).getText());
			if (dia >= primeiroDia && listaDosDias.get(dia - primeiroDia).getText().equals(dia.toString())) {
				viewElement.click(listaDosDias.get(dia - primeiroDia));
			} else {
				LOG.info("A escolha de dia para esse mês foi incorreta");
			}
		} else {
			int i = 0;
			boolean comecouMes = false;
			while (!comecouMes) {
				if(listaDosDias.get(i).getText().equals("1")) {
					comecouMes = true;
				}
				i++;
			}
			try {
				while(!listaDosDias.get(i).getText().equals(dia.toString())) {
					i++;
				}
				listaDosDias.get(i).click();
			} catch (ArrayIndexOutOfBoundsException e) {
				LOG.error("Erro ao selecionar um WebElement");
			}
		}
	}

	public void selecionarNumeroQuartos(int numeroQuartos) {
		viewElement.selectByVisibleText(page.getSelectNumeroDeQuartos().get(0),numeroQuartos+ (numeroQuartos == 1? " quarto" : " quartos"));
	}

	public void selecionarNumeroAdultos(int adultos) {
		viewElement.selectByVisibleText(page.getSelectNumeroAdultos().get(1), adultos+"");
	}

	public void selecionarNumeroCriancas(int criancas) {
		viewElement.selectByVisibleText(page.getSelectNumeroCriancas().get(6), criancas+"");
	}

	public void clicarEmReservar() {
		viewElement.click(page.getBotaoReservar());
	}

}
