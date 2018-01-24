Feature: Pesquisar voos de São Paulo para Salvador

@usrum
Scenario Outline: Pesquisar voos de São Paulo para Salvador
	Given acesso ao site Hotel Urbano
	When clico na opcao de Aereos
	And preencho o campo de destino do voo "<destino>"
	And seleciono a data de ida "<data_ida>"
	And seleciono a quantidade de adultos "<quantidade_adultos>"
	And seleciono a quantidade de criancas "<quantidade_criancas>"
	And seleciono a quantidade de bebes "<quantidade_bebes>"
	And clico no botao para pesquisar
	Then exibo quantidade de resultados encontrados
	
Examples:
|destino |data_ida |quantidade_adultos |quantidade_criancas|quantidade_bebes|
|Salvador|20 abril |3                  |1                  |0               |