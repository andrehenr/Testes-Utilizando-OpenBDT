Feature: Acessar aba de vantagens do cartão Sou Barato

@sou_barato
Scenario Outline: Para acessa a aba 
	Given entro na pagina incial do Sou Barato
	When fecho popup recebimento de promocoes
	When clico no link de Limite
	And passo o mouse sobre Vantagens
	And clico em Conheca Vantagens
	Then valido aba aberta
	
Examples:
||
||