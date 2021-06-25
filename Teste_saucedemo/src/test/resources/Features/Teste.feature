Feature: Teste de compra Saucedemo
 
    
    Scenario: realizar uma compra com sucesso
    
    Given acessei o site da saucedemo
    And realizei o login do sistema
    When ordenei os produtos em  NAME Z TO A
    And selecionei o produto
    And adicionei no carrinho
    Then Finalizo o checkout
    And finalizo a compra
    
     
    Scenario: tentar realizar uma compra
    Given acessei o site da saucedemo
    And realizei o login 
    When adicionei um produto
    And adicionei no carrinho
    Then Finalizo o checkout
    And finalizo a compra
    
    
 
 
