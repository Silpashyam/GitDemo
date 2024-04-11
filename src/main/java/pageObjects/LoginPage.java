package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browserConfiguration.Browser;
import browserConfiguration.Utility;

public class LoginPage {
	public WebDriver driver;
	Utility utilityobj;
	Browser browserobj;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtUsername")
	public WebElement username;
	
	@FindBy(id = "txtPassword")
	public WebElement password;
	
	@FindBy(id = "btnLogin")
	public WebElement login;
	
	public void logintoapplication()
	{
		utilityobj = new Utility(driver);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		utilityobj.click(login);
	}

}
