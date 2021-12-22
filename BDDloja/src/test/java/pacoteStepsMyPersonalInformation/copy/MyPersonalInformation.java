package pacoteStepsMyPersonalInformation.copy;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.pt.Dada;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class MyPersonalInformation {

	private WebDriver driver;

	@Dada("^que estou na tela de login da Loja Selenium$")
	public void queEstouNaTelaDeLoginDaLojaSelenium() throws Throwable {

		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=addresses");
	}

	@Dada("^preencho os campos email \"([^\"]*)\" e senha\"([^\"]*)\"$")
	public void preenchoOsCamposEmailESenha(String arg1, String arg2) throws Throwable {

		WebDriverWait email = new WebDriverWait(driver, 5);
		email.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(arg1);

		WebDriverWait senha = new WebDriverWait(driver, 5);
		senha.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd"))).sendKeys(arg2);
	}

	@Quando("^aciono o botao Sign in$")
	public void acionoOBotaoSignIn() throws Throwable {

		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();

	}

	@Entao("^o sistem apresenta tela inicial com usuario Ramon Logado$")
	public void oSistemApresentaTelaInicialComUsuarioRamonLogado() throws Throwable {

		String texto = driver.findElement(By.xpath("//span[contains(text(),'Ramon Saraiva')]")).getText();
		assertEquals("Ramon Saraiva", texto);
	}

	@Dada("^que ja estou na tela de 'My Personal Information'$")
	public void queJaEstouNaTelaDeMyPersonalInformation() throws Throwable {

		driver.get("http://automationpractice.com/index.php?controller=identity");

	}

	@Dada("^altero todos os campos obrigatorios$")
	public void alteroTodosOsCamposObrigatorios() throws Throwable {

		WebDriverWait genero = new WebDriverWait(driver, 5);
		genero.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-id_gender2"))).click();
		
		WebDriverWait LimpaNome = new WebDriverWait(driver, 5);
		LimpaNome.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname"))).clear();

		WebDriverWait nome = new WebDriverWait(driver, 5);
		nome.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname"))).sendKeys("Ramon");

		WebDriverWait LimpaSobrenome = new WebDriverWait(driver, 5);
		LimpaSobrenome.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastname"))).clear();

		WebDriverWait sobrenome = new WebDriverWait(driver, 5);
		sobrenome.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastname"))).sendKeys("Saraiva");

		WebDriverWait Limparemail = new WebDriverWait(driver, 5);
		Limparemail.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).clear();

		WebDriverWait email = new WebDriverWait(driver, 5);
		email.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("curso_teste_2@gmail.com");

		
		WebElement element = driver.findElement(By.id("days"));
		Select combo = new Select(element);
		combo.selectByVisibleText("16  ");
		
		WebElement elementMes = driver.findElement(By.id("months"));
		Select comboMes = new Select(elementMes);
		comboMes.selectByVisibleText("December ");
		
		WebElement elementAno = driver.findElement(By.id("years"));
		Select comboAno = new Select(elementAno);
		comboAno.selectByVisibleText("1985  ");

		WebDriverWait senha = new WebDriverWait(driver, 5);
		senha.until(ExpectedConditions.visibilityOfElementLocated(By.id("old_passwd"))).sendKeys("abc.123");

		WebDriverWait Novasenha = new WebDriverWait(driver, 5);
		Novasenha.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd"))).sendKeys("abc.123");

		WebDriverWait ConfNovasenha = new WebDriverWait(driver, 5);
		ConfNovasenha.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmation"))).sendKeys("abc.123");

		WebDriverWait Radio1 = new WebDriverWait(driver, 5);
		Radio1.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-newsletter"))).click();

		WebDriverWait Radio2 = new WebDriverWait(driver, 5);
		Radio2.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-optin"))).click();
	}

	@Quando("^aciono o botao Save$")
	public void acionoOBotaoSave() throws Throwable {

		WebDriverWait salvar = new WebDriverWait(driver, 5);
		salvar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Save')]"))).click();

	}

	@Entao("^o sistema salva todos os dados alterado e apreenta mensagem de sucesso$")
	public void oSistemaSalvaTodosOsDadosAlteradoEApreentaMensagemDeSucesso() throws Throwable {

		String texto = driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		assertEquals("Your personal information has been successfully updated.", texto);
		driver.quit();

	}

}
