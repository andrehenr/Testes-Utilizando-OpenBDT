Feature: Calcular Frete de qualquer produto até a RSI Osasco

@sou_barato
Scenario Outline: Para calcular o frete
	Given entro na pagina incial do Sou Barato
	When fecho popup recebimento de promocoes
	When clico no link de Produtos Usados
	And seleciono produto que tem a palavra "<busca>"
	And clico em comprar produto
	And seleciono a quantidade "<quantidade>"
	And preencho cep "<cep>"
	Then exibo frete
	
Examples:
|busca	 |quantidade|cep       |
|TV      |1         |06020000  |