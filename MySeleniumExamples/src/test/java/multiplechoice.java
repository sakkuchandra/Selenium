import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.Select; 

public class multiplechoice 
{ 
 public static void main(String[] args) 
 { 
	 System.setProperty("webdriver.chrome.driver", "e:\\BrowserNatives\\chrome90\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize(); 
     String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html"; 
     driver.get(URL); 

// Wait for some time to load the whole web page. 
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

// Locate dropdown element on web page by By.xpath. 
    WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']")); 

// Create an object of Select class and pass the dropdown of type WebElement as an argument. 
    Select multiplechoicelist = new Select(dropdown); 

// Verify that dropdown allows the multiple-choice list or not. 
  if(multiplechoicelist.isMultiple())
  { 
     System.out.println( "Dropdown allows multiple-choice list"); 
  } 
 else 
 { 
    System.out.println("Dropdown does not allow multiple-choice"); 
 } 
// Now select the different choice by using visible text. 
    multiplechoicelist.selectByVisibleText("July"); 
    multiplechoicelist.selectByVisibleText("May"); 
    multiplechoicelist.selectByVisibleText("March"); 

// Verify that the number of choices in the list selected. 
  if(multiplechoicelist.getAllSelectedOptions().size() == 3) 
  { 
     System.out.println("3 options have been chosen"); 
  } 
 else 
 { 
    System.out.println("Code not worked"); 
  } 
  //driver.close(); 
  } 
}