package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	private WebDriver driver;
	
	@FindBy(id="username")	
	private WebElement Username;
	
	@FindBy(xpath="//div[@id='form']//input[@id='username']")	
	private WebElement UsernamePath;
	
	@FindBy( name="password")
	private WebElement Password;
	
	@FindBy( id="submit")
	private WebElement botao;

	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getBotao() {
		return botao;
	}

	public void setBotao(WebElement botao) {
		this.botao = botao;
	}


	public WebElement getUsernamePath() {
		return UsernamePath;
	}


	public void setUsernamePath(WebElement usernamePath) {
		UsernamePath = usernamePath;
	}

	

}
