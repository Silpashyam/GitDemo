package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browserConfiguration.Browser;
import browserConfiguration.Utility;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
public class Dashboard extends Browser{
	public WebDriver driver;
	DashboardPage dashboardpageobj;
	LoginPage loginpageobj;
	Utility utilityobj;
	Browser browserobj;
	
	@BeforeTest
	public void DashboardTest()
	{
		driver = LaunchBrowser("chrome", "https://opensource-demo.orangehrmlive.com/");
	}
	@Test(priority=1, enabled=true)
	public void titleVerification() {
		String title = "OrangeHRM";
		String titlefromapp = utilityobj.getTitle(driver);
		System.out.println(title);
		System.out.println(titlefromapp);
		Assert.assertEquals(title, titlefromapp);
	}
  
}
