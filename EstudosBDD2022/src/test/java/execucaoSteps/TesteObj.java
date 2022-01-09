package execucaoSteps;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import steps.PageObject;

public class TesteObj {

	static WebDriver driver;

	@Test
	public void testeObjeto() {

		driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		PageObject obj = new PageObject(driver);
		// obj.getUsername().sendKeys("student");
		obj.getUsernamePath().sendKeys("student1");
		obj.getPassword().sendKeys("Password123");
		obj.getBotao().click();

	}

	@After
	public void depois() {
		// driver.quit();

	}

}
