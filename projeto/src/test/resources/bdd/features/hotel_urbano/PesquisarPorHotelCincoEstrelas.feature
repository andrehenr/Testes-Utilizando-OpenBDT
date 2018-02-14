Feature: Pesquisar e selecionar um hotel cinco estrelas no Rio de Janeiro

@hotel_urbano
Scenario Outline: Pesquisa no Hotel Urbano por um hotel cinco estrelas
	Given acesso ao site Hotel Urbano
	When clico na opcao de Hoteis
	And preencho a pesquisa com a cidade "<cidade>"
	And pressiono o botao de pesquisa
	And filtro por hoteis cinco estrelas
	And seleciono o primeiro hotel
	And verifico as cinco estrelas
	Then exibo informacoes do hotel
	

Examples:
|cidade        |
|Rio de Janeiro|