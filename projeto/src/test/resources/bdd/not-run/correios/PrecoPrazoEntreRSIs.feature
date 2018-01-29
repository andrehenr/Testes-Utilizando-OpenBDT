Feature: Selecionar Precos e Prazos da RSI Osasco a RSI Alphaville

@correios
Scenario Outline: Teste para Selecionar Precos e Prazos da RSI Osasco e RSI Alphaville
	Given acesso ao site dos Correios
	When clico em Calculador de Precos e Prazos Nacionais no menu suspenso
	And insiro o cep da RSI OSASCO "<osasco>"
	And insiro o cep da RSI ALPHAVILLE "<alphaville>"
	And seleciono o tipo de servico "<servico>"
	And seleciono formato "<formato>"
	And seleciono origem de embalagem "<embalagem>"
	And seleciono tipo de embalagem "<tipo_embalagem>"
	And seleciono peso do envio "<peso>"
	And seleciono opcao Mao Propria "<mao_propria>"
	And seleciono opcao Aviso de recebimento "<aviso_recebimento>"
	And seleciono opcao Declaracao de Valor "<declaracao_valor>""<valor>"
	And clico em Enviar
	Then exibo preco e prazo
	
Examples:
|osasco	    |alphaville  |servico     |formato  |embalagem             |tipo_embalagem |peso |mao_propria |aviso_recebimento |declaracao_valor |valor|
|06020000   |06454080    |PAC         |caixa	|Embalagem dos Correios|4	           |10   |true       |false              |true             |40000|

