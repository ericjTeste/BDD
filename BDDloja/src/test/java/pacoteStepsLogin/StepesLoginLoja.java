package pacoteStepsLogin;



import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.pt.Dada;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepesLoginLoja {
	
	private WebDriver driver;

	@Dada("^que estou na tela de login da Loja Selenium$")
	public void que_estou_na_tela_de_login_da_Loja_Selenium() throws Throwable {

		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=addresses");
	}

	@Dada("^preencho os campos email \"([^\"]*)\" e senha\"([^\"]*)\"$")
	public void preencho_os_campos_email_e_senha(String arg1, String arg2) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("passwd")).sendKeys(arg2);

	}

	@Quando("^aciono o botao Sign in$")
	public void aciono_o_botao_Sign_in() throws Throwable {

		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
	}

	@Entao("^o sistem apresenta tela inicial com usuario Ramon Logado$")
	public void o_sistem_apresenta_tela_inicial_com_usuario_Ramon_Logado() throws Throwable {

		String texto = driver.findElement(By.xpath("//span[contains(text(),'Ramon Saraiva')]")).getText();
		assertEquals("Ramon Saraiva", texto);
		driver.quit();
	}
	

}
