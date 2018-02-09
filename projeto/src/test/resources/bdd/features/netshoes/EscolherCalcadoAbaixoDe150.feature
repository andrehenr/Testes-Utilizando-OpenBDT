Feature: Escolher calçado da outlet com o preço abaixo de 150 reais

@netshoes
Scenario Outline: Para comecar a busca pelo calçado
	Given acesso a pagina inicial da Net Shoes
	When busco por outlet na caixa de busca
	And clico no link de Tenis na secao Outlet
	And pesquiso por tenis com "<preco>"
	And seleciono cor do tenis "<cor>"
	And seleciono tamanho "<tamanho>"
	And clico em Comprar Tenis
	
Examples:
|preco |cor        |tamanho|
|150   |Cinza+Pink |37     |