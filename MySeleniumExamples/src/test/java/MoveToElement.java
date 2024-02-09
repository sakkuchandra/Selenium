import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; 

public class MoveToElement 
{ 
public static void main(String[] args) 
{ 
	 System.setProperty("webdriver.chrome.driver", "e:\\BrowserNatives\\chrome100\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize(); 
     String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html"; 
     driver.get(url); 

// Locate the element A by By.xpath. 
  WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']")); 
  WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']")); 

// Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
   Actions actions = new Actions(driver); 

// Call moveToElement() method of actions class to move mouse cursor to a WebElement A. 
   actions.moveToElement(titleA); 
   actions.clickAndHold(); 
   
   actions.moveToElement(titleC); 
   actions.release().perform(); 
  } 
}