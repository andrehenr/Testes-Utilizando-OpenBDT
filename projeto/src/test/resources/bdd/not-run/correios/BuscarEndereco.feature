Feature: Buscar Endereco nos Correios passando CEP

@correios
Scenario Outline: Teste de Buscar Endereco nos Correios passando CEP
	Given acesso ao site dos Correios
	When preencho o campo de busca dos correios com CEP "<CEP>"
	And inicio busca nos Correios
	Then verifico resultados da pesquisa por cep "<endereco_correto>"
	
Examples:
|CEP	  |endereco_correto  							  |
|06020-0  |Avenida dos Autonomistas - até 825 - lado ímpar|	

