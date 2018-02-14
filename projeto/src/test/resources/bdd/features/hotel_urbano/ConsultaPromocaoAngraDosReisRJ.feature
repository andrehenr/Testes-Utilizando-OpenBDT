Feature: Consultar se ha promocao no trajeto Angra dos Reis

@hotel_urbano
Scenario Outline: Consulta Promocoes em Angra dos Reis
	Given acesso ao site Hotel Urbano
	When clico em Promocoes
	Then verifico promocoes para "<local>"
	
Examples:
|local                          |
|ANGRA DOS REIS/RIO DE JANEIRO  | 