package com.br.projeto.steps.business;

import java.util.Calendar;
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
	private WebBrowserScreenElement viewElement; 

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
//		int tamanhoListaHoteis = page.getResultadoDosHoteis().size();
//		Utilizei uma thread, pois não há diferenca entre hoteis de 3 ou 5 estrelas em relação a div em que eles ficam,
//		assim o viewElement.waitForElementIsPresent(60, page.getResultadoDosHoteis().get(tamanhoListaHoteis - 1)) não espera
//		carregar os hoteis 5 estrelas pois o elemento que mostra os hoteis de 3 estrelas e o mesmo dos hoteis dos hotéis de 5 
//		estrelas
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			Thread.interrupted();
			LOG.error(e.getMessage().toString());
		}
		//Navego para o primeiro hotel cinco estrelas
		viewElement.navigate(page.getLinkDosHoteis().get(3).getAttribute("href"));
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
		viewElement.click(page.getCampoDataIda());
		this.selecionarDataNoDatePicker(dataIda, page.getMesSelecionadoIda(),
				page.getBotaoProximoMesVoo(), page.getDiasDoCalendarioEmExibicao(), 42);
	}

	public void selecionarQuantidadeAdultos(int quantidadeAdultos) {
		viewElement.click(page.getBotaoPassagem12Mais());
		viewElement.click(viewElement.findElements(By.xpath("//a[@data-value='"+quantidadeAdultos+"']")).get(0));
	}

	public void selecionarQuantidadeCriancas(int quantidadeCriancas) {
		viewElement.click(page.getBotaoPassagemCriancas());
		if(quantidadeCriancas == 0){
			viewElement.click(viewElement.findElements(By.xpath("//a[@data-value='0']")).get(0));
		}
		else{
			viewElement.click(viewElement.findElements(By.xpath("//a[@data-value='"+quantidadeCriancas+"']")).get(1));
		}
	}

	public void selecionarQuantidadeBebes(int quantidadeBebes) {
		viewElement.click(page.getBotaoPassagemBebes());
		if(quantidadeBebes == 0){
			viewElement.click(viewElement.findElements(By.xpath("//a[@data-value='0']")).get(1));
		}
		else{
			viewElement.click(viewElement.findElements(By.xpath("//a[@data-value='"+quantidadeBebes+"']")).get(2));
		}
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

	public void verificarPromocoes(String local) {
		viewElement.scrollIntoView(page.getLocaisRegiaoSudestePromocao().get(0));
		boolean existePromocao = false;
		for (WebElement elemento : page.getLocaisRegiaoSudestePromocao()) {
			if (elemento.getText().contains(local)) {
				existePromocao = true;
				break;
			}
		}
		LOG.info((existePromocao? "Há":"Não há")+" promoções para "+local);
	}

	public void selecionarHotelPeloNome(String nomeHotel) {
//		Utilizei uma thread, pois não há diferenca entre hoteis de 3 ou 5 estrelas em relação a div em que eles ficam,
//		assim o viewElement.waitForElementIsPresent(60, page.getResultadoDosHoteis().get(tamanhoListaHoteis - 1)) não espera
//		carregar os hoteis 5 estrelas pois o elemento que mostra os hoteis de 3 estrelas e o mesmo dos hoteis dos hotéis de 5 
//		estrelas
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			LOG.error(e.getMessage().toString());
		}
		boolean achou = false;
		for (int i = 0; i < page.getNomesDosHoteis().size(); i++) {
			if (page.getNomesDosHoteis().get(i).getText().contains(nomeHotel)) {
				achou = true;
				viewElement.navigate(page.getLinkDosHoteis().get(i).getAttribute("href"));
			}
		}
		if(!achou){
			viewElement.navigate(page.getLinkDosHoteis().get(1).getAttribute("href"));
		}
	}

	public void selecionaDataEntrada() {
		viewElement.click(viewElement.findElements(page.getCampoDataDeEntrada()).get(2));
		String dataEntrada = (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + 2) + " de Fevereiro";
		selecionarDataNoDatePicker(dataEntrada, page.getMesSelecionadoEntrada(),page.getBotaoProximoMes(),
				page.getDiasDiponiveisParaReservaEntrada(),35);
	}

	public void selecionaDataSaida() {
		String dataSaida = (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + 4) + " de Fevereiro";
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
