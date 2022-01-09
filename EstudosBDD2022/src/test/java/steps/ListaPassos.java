package steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.pt.Dada;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ListaPassos {
	
	private WebDriver driver;

	@Dada("^que estou na tela de Listar$")
	public void queEstouNaTelaDeListar() throws Throwable {

		driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		
	}

	@Quando("^aciono o botao 'edicao' da tela$")
	public void acionoOBotaoEdicaoDaTela() throws Throwable {
		
		driver.findElement(By.xpath("//button[@id='edit_btn']")).click();

	}

	@Entao("^o sistem abilita o campo para edicao$")
	public void oSistemAbilitaOCampoParaEdicao() throws Throwable {
		

	}

	@Entao("^eu edito o campo e aciono o botao 'Save'$")
	public void euEditoOCampoEAcionoOBotaoSave() throws Throwable {

		driver.findElement(By.xpath("//div[@id='rows']//input")).sendKeys("PizzaAlterada");
		                             
		
		driver.findElement(By.xpath("//button[@name='Save']")).click();
	}

	@Entao("^o sistema me apresenta mensagem de sucesso$")
	public void oSistemaMeApresentaMensagemDeSucesso() throws Throwable {

		String texto = driver.findElement(By.xpath("//div[@id='confirmation']")).getText();
		assertEquals("Row 1 was saved", texto);
		driver.quit();
		
	}

	@Quando("^aciono o botao 'Add' da tela$")
	public void acionoOBotaoAddDaTela() throws Throwable {

		driver.findElement(By.xpath("//button[@id='add_btn']")).click();
		
	}

	@Entao("^o sistem abilita o campo para adcioana novo Row$")
	public void oSistemAbilitaOCampoParaAdcioanaNovoRow() throws Throwable {


		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String texto = driver.findElement(By.xpath("//div[@id='row2']//label")).getText();
		assertEquals("Row 2", texto);
		//driver.quit();
		
		
	}

	@Entao("^eu aciono o botao 'Edit'$")
	public void euAcionoOBotaoEdit() throws Throwable {

		
	}

	@Entao("^preencho o campo e aciono o botao 'Save'$")
	public void preenchoOCampoEAcionoOBotaoSave() throws Throwable {
		
		
        //estudar esse path
		driver.findElement(By.xpath("//div[@id='rows']/div[3]/div[1]/input[1]")).sendKeys("Lazanha");
		
	}

	@Entao("^o sistema apresenta mensagem de sucesso$")
	public void oSistemaApresentaMensagemDeSucesso() throws Throwable {

		String texto = driver.findElement(By.xpath("//div[@id='confirmation']")).getText();
		assertEquals("Row 2 was added", texto);
		
		
	}

	@Entao("^aciono o botao de 'Remove'$")
	public void acionoOBotaoDeRemove() throws Throwable {

		driver.findElement(By.xpath("//button[@id='remove_btn']")).click();
	}

	@Entao("^sistema mostra mensagem de sucesso$")
	public void sistemaMostraMensagemDeSucesso() throws Throwable {

		String texto = driver.findElement(By.xpath("//div[@id='confirmation']")).getText();
		assertEquals("Row 2 was removed", texto);
		driver.quit();
		
	}
	
}
