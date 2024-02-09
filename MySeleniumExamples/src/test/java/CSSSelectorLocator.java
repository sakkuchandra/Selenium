import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSSSelectorLocator 
{
	public static void main(String args[])
	{
		//System.setProperty("webdriver.chrome.driver", "e:\\Browsers\\Updated2\\chromedriver.exe");
		 //WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "D:\\BrowserNatives\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		 System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
	  // driver.manage().window().maximize();
	   //driver.manage().deleteAllCookies();
	   driver.get("https://login.yahoo.com/");
	   //driver.findElement(By.cssSelector("#login-username")).sendKeys("edureka@yahoo.com");
	   driver.findElement(By.cssSelector("#login-username")).sendKeys("chandra.myhome@gmail.com");
	   //WebDriverWait explicitwait=new WebDriverWait(driver,30);
	   //explicitwait.until(ExpectedConditions.)
	   driver.findElement(By.cssSelector("#login-signin")).click();
	}

}
