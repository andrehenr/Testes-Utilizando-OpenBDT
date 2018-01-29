Feature: Buscar Agencia dos Correios de Acordo com um endereco

@correios
Scenario Outline: A busca comeca
	Given acesso ao site dos Correios
	When clico na opcao Rede de Atendimento
	And seleciono o tipo de busca por localidade
	And seleciono estado da agencia "<estado_agencia>"
	And seleciono municipio da agencia "<municipio_agencia>"
	And seleciono bairro da agencia "<bairro_agencia>"
	Then exibo agencias encontradas
	
	
Examples:
|estado_agencia |municipio_agencia |bairro_agencia|  
|RIO DE JANEIRO |TRES RIOS         |CENTRO        |
