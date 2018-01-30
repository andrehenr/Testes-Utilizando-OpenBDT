Feature: Adicionar um tênis ao carrinho

@netshoes
Scenario Outline: Para adicionar um tenis ao carrinho
	Given acesso a pagina inicial da Net Shoes
	When clico sobre o link de Calcados
	And pesquiso por tenis "<busca>"
	And seleciono cor do tenis "<cor>"
	And seleciono tamanho do tenis "<tamanho>"
	And clico em Comprar Tenis
	Then valido escolha correta "<busca>""<cor>""<tamanho>"
	
Examples:
|busca |cor   |tamanho|
|Adidas|Preto |42     |