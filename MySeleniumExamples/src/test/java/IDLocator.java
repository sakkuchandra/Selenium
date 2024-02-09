import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IDLocator 
{
   public static void main(String args[])
   {
	  //ChromeOptions options=new ChromeOptions();
	  //options.addArguments("start-maximized");
	  //options.addArguments("disable-infobars");
	  System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
	  //WebDriver driver = new ChromeDriver(options);
	  WebDriver driver = new ChromeDriver();
	 
	  driver.get("https://login.yahoo.com/");  //this is URL OR PATH  for the site which we want open in the browser
	  WebElement element=driver.findElement(By.id("login-username"));//gets the reference(address) of the the textfield(Element)
	  element.sendKeys("edureka@yahoo.com"); 
	  WebElement searchIcon = driver.findElement(By.id("login-signin"));//id locator for next button
	  searchIcon.click();
	  //WebDriverWait wait=new WebDriverWait(driver,10);
	  //WebElement captchabutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='rc-anchor-center-item rc-anchor-checkbox-holder']")));
	//WebElement captchabutton=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
	 //captchabutton.click();
	 //WebElement continue1=driver.findElement(By.xpath("//button[@id='recaptcha-submit']"));
	 //continue1.click();
	
   }
}
