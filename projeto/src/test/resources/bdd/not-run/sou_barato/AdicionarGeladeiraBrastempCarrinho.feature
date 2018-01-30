Feature: Adicionar Geladeira Brastemp ao Carrinho

@sou_barato
Scenario Outline: Para Adicionar uma geladeira ao carrinho
	Given entro na pagina incial do Sou Barato
	And clico no menu 
	And seleciono Eletrodomesticos
	And clico na opcao de Geladeiras e Freezeres
	And seleciono geladeira por marca "<marca>"
	And clico em comprar produto
	And confirmo que quero produto
	And seleciono a quantidade "<quantidade>"
	And preencho cep "<cep>"
	And seleciono tipo de frete "<tipo_frete>"
	And clico em Comprar
	Then valido pagina de identificacao
	
Examples:
|marca   |quantidade|cep       |tipo_frete |
|Brastemp|1         |06020-000 |2          |