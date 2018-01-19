Feature: Selecionar Precos e Prazos um CEP A a CEP B

@usrum
Scenario Outline: Teste para Selecionar Precos e Prazos um CEP A a CEP B
	Given acesso ao site dos Correios
	When clico em Calculador de Precos e Prazos Nacionais no menu suspenso
	And insiro o cep de origem "<origem>"
	And insiro o cep de destino "<destino>"
	And seleciono o tipo de servico "<servico>"
	And seleciona formato "<formato>"
	And seleciona origem de embalagem "<embalagem>"
	And seleciona tipo de embalagem "<tipo_embalagem>"
	
Examples:
|origem 	|destino  |servico     |formato |embalagem             |tipo_embalagem |
|06321310   |06020000 |PAC         |caixa	|Embalagem dos Correios|2	           |

