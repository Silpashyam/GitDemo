package testCases;

import org.testng.annotations.Test;
import browserConfiguration.Browser;
import browserConfiguration.Utility;
import pageObjects.LoginPage;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Login extends Browser {
	public WebDriver driver;
	LoginPage loginpageobj;
	Browser browserobj;
	Utility utilityobj;
	
	@BeforeClass
	public void Login()
	{
		this.driver=driver;
		driver = LaunchBrowser("chrome", "https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void login() {
		loginpageobj = new LoginPage(driver);
		loginpageobj.logintoapplication();
	}
	@Test(priority=2, enabled=true)
	public void titleVerification() {
		String title = "OrangeHRM";
		String titlefromapp = utilityobj.getTitle(driver);
		System.out.println(title);
		System.out.println(titlefromapp);
		Assert.assertEquals(title, titlefromapp);
	}

}


