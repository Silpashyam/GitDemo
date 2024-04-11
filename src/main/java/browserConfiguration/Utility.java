package browserConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	public WebDriver driver;
	
	public Utility(WebDriver driver) {
        this.driver = driver;
    }

	public void click(WebElement element)
	
	{
		element.click();
	}
	
	public String getTitle(WebDriver driver)
	{
		String title= driver.getTitle();
		return title;
	}

}
