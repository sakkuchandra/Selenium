import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReCaptcha_click 
{

    public static void main(String[] args) 
    {

        System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome119\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rsps100.com/vote/760/");
        WebElement iframeSwitch = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div/form/div/div/div/div/iframe"));
        driver.switchTo().frame(iframeSwitch);
        driver.findElement(By.cssSelector("div[class=recaptcha-checkbox-checkmark]")).click();
    }
}