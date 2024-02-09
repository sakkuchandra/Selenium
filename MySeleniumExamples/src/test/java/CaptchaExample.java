
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptchaExample 
{
	
  public void ShowTest()throws Exception
  {
	  WebDriverManager.chromedriver().setup();

		// Create a ChromeDriver object
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  
	  
		//WebDriver driver = new ChromeDriver();

		// Open URL
		driver.get("https://www.google.com/recaptcha/api2/demo");

		Thread.sleep(4000);
		driver.switchTo().frame(0);

		// Click on the recaptcha checkbox
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();

		driver.switchTo().defaultContent();

		// Add a maximum delay of 5 minutes
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofDays(300).toMillis());
		

		// Find the submit button and wait until the button is clickable
		WebElement btn = driver.findElement(By.id("recaptcha-demo-submit"));
		wait.until(ExpectedConditions.elementToBeClickable(btn));

		// Click on the button
		btn.click();

		Thread.sleep(4000);
		driver.quit();
  }
  public static void main(String args[])throws Exception
  {
	  CaptchaExample ce=new CaptchaExample();
	  ce.ShowTest();
  }
}
