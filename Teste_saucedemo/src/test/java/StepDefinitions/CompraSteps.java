package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CompraSteps {
	 static  ChromeDriver driver;
	 WebElement element;
	 
    @Given("acessei o site da saucedemo")
    public void AcessarSite() throws Throwable{
    	
    	    System.setProperty("webdriver.chrome.driver","C:\\Drivers\\novo\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.saucedemo.com/");
	 }
    
    
    @And("realizei o login do sistema")
     public void EfetuarLogin1() {
    	driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
    	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    	driver.findElement(By.id("login-button")).click();
    	
    }
    
    
    @When("ordenei os produtos em  NAME Z TO A")
     public void OrdenarProdutos() {
    	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/select[1]")).sendKeys("Name (Z to A)");
    }
    
    @And("selecionei o produto")
   public void SelecionarProduto() {
	   driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
   }
    
    @And("adicionei no carrinho")
    public void AdicionarCarrinho() {
    	driver.findElement(By.id("shopping_cart_container")).click();
    }
    
    @Then("Finalizo o checkout")
    public void FinalizarCheckout() {
    	driver.findElement(By.id("checkout")).click();
    	driver.findElement(By.id("first-name")).sendKeys("Talles");
    	driver.findElement(By.id("last-name")).sendKeys("Holanda");
    	driver.findElement(By.id("postal-code")).sendKeys("05567-050");
    	driver.findElement(By.id("continue")).click();
    	
    }
    
    @And("finalizo a compra")
      public void FinalizarCompra()  {
    	
    	driver.findElement(By.id("finish")).click();
    	driver.close();
    }
    
   
    
    @Given("realizei o login")
    public void EfetuarLogin2() {
    	driver.findElement(By.id("user-name")).sendKeys("problem_user");
    	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    	driver.findElement(By.id("login-button")).click();
    	
    }
    
    
    
    

    @When("adicionei um produto")
    public void adicionei_um_produto() {
    	 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

   

}
