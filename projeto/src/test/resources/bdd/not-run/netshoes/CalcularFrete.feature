Feature: Adicionar um tênis ao carrinho e calcular o frete

@netshoes
Scenario Outline: Para adicionar um tênis ao carrinho e calcular o frete
	Given acesso a pagina inicial da Net Shoes
	When clico sobre o link de Calcados
	And pesquiso por tenis "<busca>"
	And seleciono cor do tenis "<cor>"
	And seleciono tamanho do tenis "<tamanho>"
	And clico em Comprar Tenis
	And preencho o cep "<cep>"
	And clico em calcular frete
	Then exibo frete para o produto
	
Examples:
|busca |cor      |tamanho|cep       |
|Oakley|Marinho  |39     |06020-000 |