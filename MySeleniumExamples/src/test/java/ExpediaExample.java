import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaExample 
{
	public void FlightReservations()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    //WebDriverWait wait=new WebDriverWait(driver,40);
	    WebElement element=driver.findElement(By.xpath("//li[2]/a/span[1]"));
	    //WebElement element1=wait.until(ExpectedConditions.elementToBeClickable(element));
	    element.click();
	    WebElement element1=driver.findElement(By.xpath("//div[1][@class='uitk-field has-floatedLabel-label has-icon']"));
	    element1.click();
	    WebElement element2=driver.findElement(By.xpath("//div/input[1]['@id=origin_select']"));
	    element2.sendKeys("vijaywada");
	    element2.sendKeys(Keys.ENTER);
	    
	    WebElement element3=driver.findElement(By.xpath("//div[1][@class='uitk-field has-floatedLabel-label has-icon']"));
	    element3.click();
	    WebElement element4=driver.findElement(By.xpath("//input[@class='uitk-field-input uitk-typeahead-input uitk-typeahead-input-v2']"));
	    element4.sendKeys("Hyderabad");
	    //element4.click();
	    element4.sendKeys(Keys.ENTER);
	    
	    WebElement element5=driver.findElement(By.xpath("//div[@class='uitk-layout-flex-item uitk-layout-flex-item-max-width-full_width uitk-layout-flex-item-flex-grow-1']/div[@class='uitk-field has-floatedLabel-label has-icon has-placeholder']/button[@name='EGDSDateRange-date-selector-trigger']"));
	    element5.click();
	    
	    WebElement element6=driver.findElement(By.xpath("//tbody[@class='uitk-day-wrap']/tr[3]/td[7]"));
	    element6.click();
	    String date=element6.getText();
	    System.out.println("Selected Date is :"+date);
	    
	    //WebElement element7=driver.findElement(By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-align-items-center uitk-layout-flex-flex-direction-row uitk-date-selector-playback']/button[@class='uitk-date-display selection-filled']"));
	    //element7.sendKeys(date);
	    
	    //WebElement element8=driver.findElement(By.xpath("//div[@class='uitk-month uitk-month-single']/table/tbody[@class='uitk-day-wrap']/tr/td[2][@class='uitk-day uitk-day-past']"));
	    //String date1=element8.getText();
	    //System.out.println("Selected Date is :"+date1);
	    //element8.click();
	    
	    
	  WebElement travellers=driver.findElement(By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-justify-content-flex-end uitk-layout-flex-gap-three']/button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item']"));
	  travellers.click();
	    
	  WebElement done=driver.findElement(By.xpath("//div[@class='uitk-menu uitk-menu-mounted']//div[1][@class='uitk-field has-floatedLabel-label has-icon has-placeholder']/button[@class='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']"));
	  done.click();  
	  
      WebElement done1=driver.findElement(By.xpath("//button[@id='travelers_selector_done_button']"));
      done1.click();
      
    WebElement search=driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-has-text uitk-button-primary']"));
    search.click();

	}
	public static void main(String args[])
	{
		ExpediaExample ex=new ExpediaExample();
		ex.FlightReservations();
	}

}
