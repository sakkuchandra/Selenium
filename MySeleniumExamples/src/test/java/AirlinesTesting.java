import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirlinesTesting 
{
	 public static void main(String[] args) 
	    {  
	          
		 try
		 {
	        // System Property for Chrome Driver   
	    	 System.setProperty("webdriver.chrome.driver", "D:\\BrowserNatives\\chromedriver_win32\\chromedriver.exe");
	  
	       // Instantiate a ChromeDriver class.      
	    WebDriver driver=new ChromeDriver();  
	        // Launch Website  
	    driver.get("https://www.cleartrip.com/do/search/flights?title=Search%20Airline%20Tickets&coupon=FLIGHT&utm_source=bing&utm_medium=cpc&utm_campaign=Gen:High-Conv_BMM-Desktop%7CAirline_BMM%7C+airline%7Cbb&msclkid=7db418d82fbf1de8d41047487eb292d5");
	    WebElement from=driver.findElement(By.name("from"));
	    from.sendKeys("delhi");
	    WebElement to=driver.findElement(By.name("to"));
	    to.sendKeys("Mumbai");
	    WebElement depdate=driver.findElement(By.name("depart_date"));
	    depdate.sendKeys("10222020");
	    //String fromlocation=from.getText();
	    //String tolocation=to.getText();
	    //String depdate1=depdate.getText();
	   // SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
	   // Date date = formatter.parse(depdate1);
	    WebElement submit=driver.findElement(By.id("submit_search_form"));
	    submit.click();
	    //System.out.println(date);
		 }
		 catch(Exception ex)
		 {
			 
		 }
	    }

}
