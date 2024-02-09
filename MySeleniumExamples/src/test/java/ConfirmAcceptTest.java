import org.openqa.selenium.Alert; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class ConfirmAcceptTest 
{ 
 public static void main(String[] args) 
 { 
	 System.setProperty("webdriver.chrome.driver", "D:\\BrowserNatives\\chrome90\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
     String URL = "https://selenium08.blogspot.com/2019/07/alert-test.html"; 
     driver.get(URL); 
     driver.manage().window().maximize(); 
     WebElement element = driver.findElement(By.xpath("//button[@id='confirm']")); 
     element.click(); 

// Switching to alert from web page. 
    Alert alert = driver.switchTo().alert(); 
    String getText = driver.switchTo().alert().getText(); 
    System.out.println(getText); 
 
 if(getText.equalsIgnoreCase("This is a confirm alert. Do you want to accept or cancel?")) 
 { 
   //alert.accept(); 
   System.out.println("You accepted alert"); 
  } 
 else 
 { 
    alert.dismiss(); 
    System.out.println("You dismissed alert"); 
  } 
 //driver.close(); 
  } 
 }