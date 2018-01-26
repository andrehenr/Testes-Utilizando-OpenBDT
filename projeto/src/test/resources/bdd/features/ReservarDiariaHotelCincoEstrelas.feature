Feature: Reservar uma diaria um hotel cinco estrelas em São Paulo

@usrum
Scenario Outline: Pesquisa no Hotel Urbano por um hotel cinco estrelas e fazer uma diaria
	Given acesso ao site Hotel Urbano
	When clico na opcao de Hoteis
	And preencho a pesquisa com a cidade "<cidade>"
	And pressiono o botao de pesquisa
	And filtro por hoteis cinco estrelas
	And seleciono hotel "<hotel>"
	And verifico as cinco estrelas
	And seleciono numero de adultos "<adultos>"
	And seleciono data de Entrada "<entrada>"
	And seleciono data Saida "<saida>"
	And seleciono numero de quartos "<quartos>"
	And clico em Reservar
	

Examples:
|cidade    |hotel 					|entrada 		  |saida          |quartos   |adultos|criancas|
|São Paulo |Radisson Vila Olímpia   |3 de Fevereiro   |15 de Fevereiro|2         |1      |0       |