Feature: Adicionar uma camiseta da seleção Brasileira ao carrinho

@netshoes
Scenario Outline: Para adicionar uma camiseta da seleção ao carrinho
	Given acesso a pagina inicial da Net Shoes
	When pesquiso por Camiseta da Selecao
	And seleciono por palavra "<palavra>"
	And seleciono tamanho da Camiseta "<camiseta>"
	And clico em Comprar Camiseta
	Then valido informacoes do produto na cesta "<palavra>" "<camiseta>"
	
	
Examples:
|palavra|camiseta |
|Neymar |GG       |