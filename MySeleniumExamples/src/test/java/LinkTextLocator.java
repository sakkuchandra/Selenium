import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator 
{
	public static void main(String args[])
	{
		//System.setProperty("webdriver.chrome.driver", "e:\\Browsers\\chromedriver.exe");
		 //WebDriver driver = new ChromeDriver();
	
		 //System.setProperty("webdriver.gecko.driver", "D:\\BrowserNatives\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();   
			
			 //System.setProperty("webdriver.chrome.driver", "D:\\BrowserNatives\\chrome90\\chromedriver.exe");
			 //WebDriver driver = new ChromeDriver();
			 
			 System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("http://demo.guru99.com/test/link.html");
             driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
             driver.findElement(By.linkText("click here")).click();
	}

}
