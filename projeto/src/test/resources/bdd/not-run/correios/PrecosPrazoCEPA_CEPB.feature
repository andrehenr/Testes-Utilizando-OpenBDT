Feature: Selecionar Precos e Prazos do CEP A a CEP B

@correios
Scenario Outline: Teste para Selecionar Precos e Prazos um CEP A a CEP B
	Given acesso ao site dos Correios
	When clico em Calculador de Precos e Prazos Nacionais no menu suspenso
	And insiro o cep de origem "<origem>"
	And insiro o cep de destino "<destino>"
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
|origem 	|destino  |servico     |formato |embalagem             |tipo_embalagem |peso |mao_propria |aviso_recebimento |declaracao_valor |valor|
|06321310   |06020000 |PAC         |caixa	|Embalagem dos Correios|2	           |2    |true        |false             |true             |12000|

