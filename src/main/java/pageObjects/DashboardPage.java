package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browserConfiguration.Browser;
import browserConfiguration.Utility;

public class DashboardPage {
		public WebDriver driver;
		Utility utilityobj;
		Browser browserobj;
		
		public DashboardPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a/span")
		public WebElement leave;

}
