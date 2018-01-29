Feature: Comprar Ingresso Thermas dos Laranjais

@hotel_urbano
Scenario Outline: Comprar Ingresso Thermas dos Laranjais
	Given acesso ao site Hotel Urbano
	When preencho o campo de pesquisa com "<busca>"
	And seleciono a opcao de ingresso
	And pressiono o botao de pesquisa
	And seleciono a primeira opcao
	And acesso a pagina do Parque
	And selecionar numero pessoas "<numero_pessoas>"
	And clicar em Comprar
	
Examples:
|busca                |numero_pessoas |
|Thermas dos Laranjais|3              |