Feature: Adicionar um produto reembalado ao carinho 

@sou_barato
Scenario Outline: Para adicionar um produto reembalado ao carrinho
	Given entro na pagina incial do Sou Barato
	When fecho popup recebimento de promocoes
	When clico no link de Produtos Reembalados
	And seleciono produto que tem a palavra "<busca>"
	And clico em comprar produto
	And confirmo que quero produto
	And seleciono a quantidade "<quantidade>"
	And preencho cep "<cep>"
	And seleciono tipo de frete "<tipo_frete>"
	And clico em Comprar
	Then valido pagina de identificacao
	
Examples:
|busca    |quantidade|cep     |tipo_frete|
|Galaxy A5|1         |06020000|1         |