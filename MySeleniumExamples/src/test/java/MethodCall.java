import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodCall 
{
	
	public void CreateTest()
	{
		System.setProperty("webdriver.chrome.driver", "e:\\Browsers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   //driver.manage().deleteAllCookies();
	   driver.get("https://login.yahoo.com/");
	   driver.findElement(By.cssSelector("#login-username")).sendKeys("edureka@yahoo.com");
	   driver.findElement(By.cssSelector("#login-signin")).click();
	}
	
	public static void main(String args[])
	{
		MethodCall m=new MethodCall();    //object or instance
		m.CreateTest();   //Method call
	}

}
