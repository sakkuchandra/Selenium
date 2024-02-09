import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; 

public class DragAndDropByDemo 
{ 
public static void main(String[] args) 
{ 
	 System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize(); 
     String URL = "https://selenium08.blogspot.com/2020/01/drag-me.html"; 
     driver.get(URL); 
     WebElement src = driver.findElement(By.id("draggable")); 
     Actions actions = new Actions(driver); 
     actions.dragAndDropBy(src, 200, 300); 
     actions.build().perform(); 
  } 
}