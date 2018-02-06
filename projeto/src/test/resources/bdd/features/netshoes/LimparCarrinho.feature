Feature: Adicionar um tênis ao carrinho, limpar o carinho e voltar a loja

@netshoes
Scenario Outline: Para começar o teste de limpar o carrinho
	Given acesso a pagina inicial da Net Shoes
	When clico sobre o link de Calcados
	And pesquiso por tenis "<busca>"
	And seleciono cor do tenis "<cor>"
	And seleciono tamanho do tenis "<tamanho>"
	And clico em Comprar Tenis
	And clico em Limpar Carrinho
	And clico em Volta Para a Loja
	Then valido a volta para a pagina inicial
	
Examples:
|busca |cor   |tamanho|
|Nike  |Cinza |42     |