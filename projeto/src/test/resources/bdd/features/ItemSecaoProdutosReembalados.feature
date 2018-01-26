Feature: Adicionar ao carrinho um item da seção Produtos Reembalados

@usrum
Scenario Outline: Para adicionar um item ao carrinho
	Given entro na pagina incial do Sou Barato
	When clico no link de Produtos Reembalados
	And seleciono produto que tem a palavra "<busca>"
	And clico em comprar produto
	And confirmo que quero produto
	And seleciono a quantidade "<quantidade>"
	And preencho cep "<cep>"
	And seleciono tipo de frete "<tipo_frete>"
	
Examples:
|busca	 |quantidade|cep       |tipo_frete |
|Smart TV|2         |06321310  |           |