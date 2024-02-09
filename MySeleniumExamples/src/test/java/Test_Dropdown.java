import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;  
  
public class Test_Dropdown  
{  
  
    public static void main(String[] args) 
    {  
          
          
    	 System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome90\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();  
         driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
         driver.findElement(By.id("text1")).sendKeys("My First Name");

    //Selecting value from drop down using visible text
        Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
       WebDriverWait wait = new WebDriverWait(driver, 25);
       mydrpdwn.selectByVisibleText("Audi");
       WebElement option = mydrpdwn. getFirstSelectedOption();
       String defaultItem = option.getText();
       System.out.println(defaultItem);
    
    //wait.until(ExpectedConditions.elementToBeClickable(By.id("text2")));
  
  
    }  
}