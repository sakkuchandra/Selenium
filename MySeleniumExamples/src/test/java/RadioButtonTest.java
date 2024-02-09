import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest 
{ 
 public static void main(String[] args) 
 { 
 
     System.setProperty("webdriver.chrome.driver", "e:\\BrowserNatives\\chrome120\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize(); 
     String URL = "https://selenium08.blogspot.com/2019/08/radio-buttons.html"; 
     driver.get(URL);
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
     WebElement green = driver.findElement(By.xpath("//input[@name='green']")); 
     if(green.isEnabled() && green.isDisplayed()) 
     { 
        System.out.println("Radio button is enabled and visible"); 
     } 
     else
     { 
          System.out.println("Radio button is disabled and invisible"); 
     } 
     if(!green.isSelected()) 
     { 
        green.click(); 
        if(green.isSelected()) 
        { 
//  
           System.out.println("'Green' option is selected"); 
        } 
        else
        { 
            System.out.println("Something is wrong, 'Green' option is not selected"); 
        } 
     } 
  
 } 
}