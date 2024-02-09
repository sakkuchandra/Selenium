import org.openqa.selenium.Alert; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class PromptAlertTest 
{ 
public static void main(String[] args) 
{ 
	System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome114\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver(); 
     String URL = "https://selenium08.blogspot.com/2019/07/alert-test.html"; 
     driver.get(URL); 
     driver.manage().window().maximize(); 

// Click on confirm button to show prompt alert box. 
     WebElement element = driver.findElement(By.xpath("//button[@id='prompt']")); 
     element.click(); 

// Switching to alert from web page. 
    //
     Alert alert = driver.switchTo().alert(); 

// Enter some text on prompt alert box. 
     //alert.sendKeys("Deep"); 
     //alert.accept(); 

// Check webpage displays message with text entered in prompt box. 
     WebElement displayMessage = driver.findElement(By.id("prompt"));
    
     String getText = displayMessage.getText(); 
     //String getText = alert.getText();
     System.out.println(getText); 
 
  if(getText.equalsIgnoreCase("Hello Deep! How are you today?"))
  { 
      System.out.println("Exact matched"); 
  }
  else { 
     System.out.println("Something went wrong"); 
   } 
    //driver.close(); 
  } 
}