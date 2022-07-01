@test1
Feature: gestion de calculadora

  Scenario: sumar dos numero y validar resultado
    Given ingreso a la pagina calculator
    When ingreso firstnumer "2" y secondnumer "3"
    And Selecciono suma
    Then obtengo el resultado de la operacion


  Scenario: resto dos numero y validar resultado
    Given ingreso a la pagina calculator
    When ingreso firstnumer "10" y secondnumer "6"
    And selecciono resta
    Then obtengo el resultado de la operacion


  Scenario: multiplico dos numero y validar resultado
    Given ingreso a la pagina calculator
    When ingreso firstnumer "10" y secondnumer "6"
    And selecciono multiplicacion
    Then obtengo el resultado de la operacion



  Scenario: divido dos numero y validar resultado
    Given ingreso a la pagina calculator
    When ingreso firstnumer "10" y secondnumer "6"
    And selecciono division
    Then obtengo el resultado de la operacion


  Scenario: concateno dos numero y validar resultado
    Given ingreso a la pagina calculator
    When ingreso firstnumer "10" y secondnumer "6"
    And selecciono concateno
    Then obtengo el resultado de la operacion



  Scenario: ingreso caracteres alfanumericos
    Given ingreso a la pagina calculator
    When ingreso firstnumer "hola" y secondnumer "qa"
    And Selecciono suma
    Then obtengo el resultado de la operacion fallida


  Scenario: Limpio los campos
    Given ingreso a la pagina calculator
    When ingreso firstnumer "10" y secondnumer "6"
    And limpio los campos


  Scenario: marco el check Integers only
    Given ingreso a la pagina calculator
    When doy click en check Integers only
