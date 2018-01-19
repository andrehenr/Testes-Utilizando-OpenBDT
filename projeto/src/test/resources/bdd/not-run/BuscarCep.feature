Feature: Buscar CEP nos Correios utilizando Endereco

@correios
Scenario Outline: Teste de Buscar CEP nos Correios utilizando Endereco
	Given acesso ao site dos Correios
	When preencho o campo de Busca dos Correios "<endereco>"
	And inicio busca nos Correios
	Then verifico resultados da pesquisa por endereco
	
Examples:
|endereco	   		 	 |
|Street B  			 	 |
|Avenida dos Autonomistas|
	