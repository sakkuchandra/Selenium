import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameLocator1 
{
	public static void main(String args[])
	{
			 System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
			 driver.get("https://login.yahoo.com/");
	         WebElement element=driver.findElement(By.name("username"));
	         element.sendKeys("edureka@yahoo.com"); //name locator for text box
	         WebElement searchIcon = driver.findElement(By.name("signin"));//name locator for next button
	         searchIcon.click();
	}

}
