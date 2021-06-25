package Teste_saucedemo;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/Teste.feature"},
glue={"StepDefinitions"})


public class CompraTeste {
	
}