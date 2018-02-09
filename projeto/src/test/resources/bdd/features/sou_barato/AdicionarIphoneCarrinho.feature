Feature: Adicionar um Iphone ao Carrinho

@sou_barato
Scenario Outline: Para adicionar um Iphone ao carrinho 
	Given entro na pagina incial do Sou Barato
	When fecho popup recebimento de promocoes
	When pesquiso por "Iphone"
	And seleciono a primeira ocorrencia
	And clico em comprar produto
	And seleciono a quantidade "<quantidade>"
	And preencho cep "<cep>"
	And seleciono tipo de frete "<tipo_frete>"
	And clico em Comprar
	Then valido pagina de identificacao
	
Examples:
|quantidade|cep       |tipo_frete |
|1         |06020-000 |3          | 