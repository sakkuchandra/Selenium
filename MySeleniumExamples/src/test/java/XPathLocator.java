import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathLocator 
{
	public static void main(String args[])
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://login.yahoo.com/");
		 WebElement searchIcon = driver.findElement(By.xpath("//*[@id=\"login-username\"]"));//xpath for search button
	     searchIcon.sendKeys("MyMailId");
     }
	
	

}
