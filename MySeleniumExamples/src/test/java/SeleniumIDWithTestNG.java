import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumIDWithTestNG 
{
    @Test 	
	public void FindSite()
	{
		System.setProperty("webdriver.chrome.driver", "e:\\Browsers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		   //driver.manage().deleteAllCookies();
		   //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get("https://login.yahoo.com/");  //this is URL OR PATH  for the site which we want open in the browser
		   WebElement element=driver.findElement(By.id("login-username"));//gets the reference(address) of the the textfield(Element)
		   element.sendKeys("edureka@yahoo.com"); 
		   
		  // WebElement element1=driver.findElement(By.id("abc"));
		   
		   WebElement searchIcon = driver.findElement(By.id("login-signin"));//id locator for next button
		   searchIcon.click();

	}

}
