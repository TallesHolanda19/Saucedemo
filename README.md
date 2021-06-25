Scenario 1 :Este projeto tem por objetivo simular uma compra com sucesso no site "https://www.saucedemo.com/index.html"
Scenario 2 :Este projeto tem por objetivo simular uma tentativa de compra no site "https://www.saucedemo.com/index.html"


Este projeto conta com as seguintes tecnologias:

Java
Selenium WebDriver
JUnit4
Maven
Cucumber

Jar instalados: 

cucumber-junit - version: 4.2.6
cucumber-java -  version: 4.2.6
selenium-java -  version: 3.0.1

Para execução no navegador utilizando o selenium, baixar o driver atualizado em https://chromedriver.chromium.org/downloads
O caminho do driver deve ser especificado em StepDefinitions/CompraSteps.java

StepDefinitions/CompraSteps.java: Contém as ações das etapas em selenium, conforme definido pelo cenario de teste
Teste_saucedemo/CompraTeste.java: Contém o arquivo executavel do cenario de teste
Features/Teste.feature: Contem a descrição dos cenarios de testes 


