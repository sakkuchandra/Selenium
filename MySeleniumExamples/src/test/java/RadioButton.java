import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton 
{ 
 public static void main(String[] args) 
 { 
// Declare WebDriver reference and assign an object of FirefoxDriver class. 
	 System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome109\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();

// Maximize window. 
     driver.manage().window().maximize(); 
   
    String URL = "https://selenium08.blogspot.com/2019/08/radio-buttons.html"; 
    driver.get(URL); 
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

// Locate radio button "Yellow". 
     WebElement yellow = driver.findElement(By.xpath("//input[@name='yellow']")); 

// Click on Radio button yellow to select. 
      yellow.click(); 
     System.out.println("Radio button Yellow is successfully selected."); 

// The above two lines of code can be written also in just one step like this: 
// driver.findElement(By.xpath("//input[@name='yellow']")).click(); 

// Locate radio button "Red". 
     WebElement red = driver.findElement(By.xpath("//input[@name='red']")); 

// Radio Button Yellow is de-selected and Radio Button Red is selected. 
     red.click(); 
     System.out.println("Radio Button Red is successfully Selected"); 

// Locate radio button "Dhanbad". 
     WebElement dhanbad = driver.findElement(By.xpath("//input[@name='dhanbad']")); 
     dhanbad.click(); 
   
     System.out.println("Radio button Dhanbad is successfully selected."); 
      //driver.close(); 
  } 
}
