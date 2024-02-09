import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWaits 
{
    public static void main(String[] args) 
    {
        
    	System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
   	    WebDriver driver = new ChromeDriver();
        driver.get("https://automationtestings.com/");
        driver.manage().window().maximize();
        //This waits up to 10 seconds before throwing a TimeoutException or if it finds the element will return it in 0 - 10 seconds
        WebDriverWait wait = new WebDriverWait (driver,30);
        //Title of the webpage is "Learn Automation | Automation Skills"
        wait.until(ExpectedConditions.titleIs("Learn Automation | Automation Skills"));
        //If the above condition met then the browser will be closed
        //To close the browser
        driver.close();
        //Change the title " Learn Automation | Automation Skills " as "xyz" in the script and try
        //You will face an execption - Exception in thread "main" org.openqa.selenium.TimeoutException: Timed out after 15 seconds waiting for title to be "Software Testing Material - A site for Software Tes". Current title: "xyz"
    }
}