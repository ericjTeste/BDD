package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.pt.Dada;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginPassos {
    
	private WebDriver driver;

	
	@Dada("^que estou na tela de login da Loja Selenium$")
	public void queEstouNaTelaDeLoginDaLojaSelenium() throws Throwable {
		
		driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@Dada("^preencho os campo Username \"([^\"]*)\" e Password \"([^\"]*)\"$")
	public void preenchoOsCampoUsernameEPassword(String arg1, String arg2) throws Throwable {

		driver.findElement(By.xpath("//div[@id='form']//input[@id='username']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg2);
		
	}

	@Quando("^aciono o botao Submit$")
	public void acionoOBotaoSubmit() throws Throwable {

		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Entao("^o sistem apresenta tela inicial$")
	public void oSistemApresentaTelaInicial() throws Throwable {

	}

	@Entao("^deve ser apresentado mensagem de sucesso$")
	public void deveSerApresentadoMensagemDeSucesso() throws Throwable {

		String texto = driver.findElement(By.xpath("//p[@class='has-text-align-center']")).getText();
		assertEquals("Congratulations student. You successfully logged in!", texto);
		driver.quit();
	}

	@Entao("^usuario aciona botao 'Log Out' e usuario e direcionado para tela de Login$")
	public void usuarioAcionaBotaoLogOutEUsuarioEDirecionadoParaTelaDeLogin() throws Throwable {

		driver.findElement(By.xpath("//div[@class='wp-block-button aligncenter is-style-fill']")).click();
		
		String texto = driver.findElement(By.xpath("//h2[text()='Test login']")).getText();
		assertEquals("Test login", texto);
		driver.quit();

	}
}
