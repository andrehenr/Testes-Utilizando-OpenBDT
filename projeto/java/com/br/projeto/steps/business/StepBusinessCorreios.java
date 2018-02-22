package com.br.projeto.steps.business;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.br.projeto.pages.PageObjectClassCorreio;

import io.openbdt.element.WebBrowserScreenElement;
import jxl.common.Logger;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessCorreios {

	private PageObjectClassCorreio page;
	private String stringBusca;

	@Autowired
	private WebBrowserScreenElement viewElement;

	private static Logger LOG = Logger.getLogger(StepBusinessCorreios.class);

	public boolean clicarEmProximo() {
		if (viewElement.getDriver().getPageSource().contains("javascript:document.Proxima.submit('Proxima')")) {
			viewElement.click(viewElement.findElement(page.getLinkProximosResultados()));
			return true;
		}
		return false;
	}

	public void mudaDePagina(WebElement elementoEsperado) {
		viewElement.getDriver().getWindowHandles()
				.forEach(windows -> viewElement.getDriver().switchTo().window(windows));
		if (elementoEsperado != null)
			viewElement.waitForElementIsPresent(30, elementoEsperado);
	}

	public void abreSiteCorreios() {
		viewElement.navigate("http://www.correios.com.br/para-voce");
		viewElement.getDriver().manage().window().maximize();
	}

	public void preencheCampoBuscaPaginaInicial(String busca) {
		stringBusca = busca;
		viewElement.sendText(page.getCampoBuscaCEPEnderecoPaginaIncial(), stringBusca);
	}

	public void clicaEmPesquisa() {
		viewElement.click(page.getBotaoBuscaCEPEnderecoPaginaInicial());
	}

	public void analisaResultadosPesquisaEndereco() {
		mudaDePagina(page.getMensagemDeBusca());
		do {
			List<WebElement> listaElementos = viewElement.findElements(page.getLinhaDeResultadoDaBusca());
			if (listaElementos.isEmpty()) {
				LOG.info("\nNenhum resultado encontrado");
			} else {
				for (int c = 1; c < listaElementos.size(); c++) {
					List<WebElement> colunas = listaElementos.get(c).findElements(By.tagName("td"));
					if (colunas.get(0).getText().contains(stringBusca)) {
						LOG.info("\n" + colunas.get(0).getText() + " CEP: " + colunas.get(3).getText());
					}
				}

			}
		} while (clicarEmProximo());
	}

	public boolean analisaResultadosPesquisaCep(String enderecoCorreto) {
		mudaDePagina(page.getMensagemDeBusca());
		do {
			List<WebElement> listaElementos = viewElement.findElements(page.getLinhaDeResultadoDaBusca());
			if (listaElementos.isEmpty()) {
				LOG.info("\nNenhum resultado encontrado");
				return false;
			} else {
				for (int c = 1; c < listaElementos.size(); c++) {
					List<WebElement> colunas = listaElementos.get(c).findElements(By.tagName("td"));
					if (colunas.get(0).getText().contains(enderecoCorreto)) {
						return true;
					}
				}
			}
		} while (clicarEmProximo());
		return false;
	}

	public void clicaEmCalculadorPrecosPrazos() {
		viewElement.mouseOver(page.getCampoAbreMenuSuspenso());
		viewElement.click(page.getLinkPrecosPrazos());
	}

	public void preencheCepOrigem(String cepOrigem) {
		viewElement.sendText(page.getCampoCepOrigem(), cepOrigem);
	}

	public void preencheCepDestino(String cepDestino) {
		viewElement.sendText(page.getCampoCepDestino(), cepDestino);
	}

	public void preencheTipoServico(String servico) {
		viewElement.selectByVisibleText(page.getSelectServico(), servico);
	}

	public void selecionaFormato(String formato) {
		switch (formato) {
		case "caixa":
			viewElement.click(page.getFiguraCaixa());
			break;
		case "rolo":
			viewElement.click(page.getFiguraRolo());
			break;
		}
	}

	public void selecionaEmbalagem(String embalagem) {
		viewElement.selectByVisibleText(page.getTipoEmbalagem(), embalagem);
	}

	public void selecionaTipoEmbalagem(String tipoEmbalagem) {
		for (int i = 0; i < Integer.valueOf(tipoEmbalagem) - 1; i++) {
			viewElement.click(page.getProximaEmbalagem());
		}
		viewElement.waitAndClick(viewElement.findElements(By.xpath("//button[@class='toggle-check']"))
				.get(Integer.valueOf(tipoEmbalagem) - 1), 20);
	}

	public void selecionarPesoEnvio(String peso) {
		viewElement.selectByVisibleText(page.getSelectPeso(), peso);
	}

	public void selecionarMaoPropria(String maoPropria) {
		this.selecionarCheckBox(page.getCheckMaoPropria(), maoPropria);
	}

	private boolean selecionarCheckBox(WebElement checkBox, String stringBooleana) {
		if (stringBooleana.equals("true")) {
			viewElement.click(checkBox);
			return true;
		}
		return false;
	}

	public void selecionarAvisoRecebimento(String avisoRecebimento) {
		this.selecionarCheckBox(page.getCheckAvisoRecebimento(), avisoRecebimento);
	}

	public void selecionarDeclaracaoValor(String stringBooleana, String valor) {
		if (this.selecionarCheckBox(page.getCheckDeclaracaoValor(), stringBooleana)) {
			viewElement.sendText(page.getCampoValorDeclarado(), valor);
		}
	}

	public void clicarEmEnviar() {
		viewElement.click(page.getBotaoCalcular());
		this.mudaDePagina(null);
	}

	public void exibirPrecoPrazo() {
		LOG.info("Prazo: " + viewElement.getText(page.getCampoResultadoPrazo()) + "\nPreço: "
				+ viewElement.getText(page.getCampoResultadoPreco()));
	}

	public void clicarEmRedeDeAtendimento() {
		viewElement.click(page.getLinkRedeAtendimento());
	}

	public void selecionarTipoBusca() {
		if (!page.getRadioTipoBusca().get(1).isSelected()) {
			viewElement.click(page.getRadioTipoBusca().get(1));
		}
	}

	public void selecionarEstadoAgencia(String estado) {
		viewElement.selectByVisibleText(page.getSelectEstadoAgencia(), estado);
	}

	public void selecionarMunicipioAgencia(String municipio) {
		viewElement.selectByVisibleText(page.getSelectMunicipioAgencia(), municipio);
	}

	public void selecionarBairroAgencia(String bairro) {
		viewElement.click(page.getSelectBairroAgencia());
		viewElement.selectByVisibleText(page.getSelectBairroAgencia(), bairro);
	}

	public void exibirAgencias() {
		int agencia = 1;
		for (WebElement w : page.getNomesDasAgencias()) {
			LOG.info("\nAgência: " + w.getText());
			w.findElement(By.tagName("a")).click();
			List<WebElement> dadosAgencia = viewElement
					.findElements(By.xpath("//*[@id='detalheAgencia" + agencia + "']/tbody/tr"));
			LOG.info("Dados Agência:");
			int i = 0;
			while (!dadosAgencia.get(i).getText().contains("Dados") && i < dadosAgencia.size()) {
				LOG.info(dadosAgencia.get(i).getText());
				i++;
			}
			agencia++;
		}
	}
}
