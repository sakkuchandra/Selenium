import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


public class MyXpath 
{
	
	    static WebElement slider;
	
		public static void main(String args[])
		{
			 System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome90\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 driver.get("https://www.kroger.com");
			 driver.manage().window().maximize();
			 WebDriverWait wait = new WebDriverWait (driver, 40);
			 WebElement element=driver.findElement(By.xpath("//button[@class='kds-Button interactive kds-Button--compact kds-Button--hasIconOnly palette-accent kind-subtle variant-fill kds-Carousel-button--next kds-Carousel-button rounded-large px-8 bg-neutral-most-subtle text-primary']"));
			 wait.until(ExpectedConditions.visibilityOf(element));
			 //js.executeScript("arguments[0].scrollIntoView();",element);
			 element.click();	
			 
			 WebElement element1=driver.findElement(By.xpath("//div[@class='espot-block bg-primary flex flex-col p-32 w-full']//div[@class='text-content flex flex-col items-start text-left']"));
			 //js.executeScript("arguments[0].scrollIntoView();",element1);
			 System.out.println(element1.getText());
			 
			 
			 WebElement element2=driver.findElement(By.xpath("//div[@class='cta-logo-content cta-marginTop flex justify-between']//div[@class='cta-content flex flex-row items-center']"));
			 System.out.println(element2.getText());
			 
			 
			 
			 
			/*
			 WebDriverWait wait = new WebDriverWait (driver, 30);
			 WebElement element=driver.findElement(By.xpath("//div[@class='key-message-content flex']//a[@title='Everything for a hoppy Easter. Shop everything you need for delivery or free* pickup.']"));
			 wait.until(ExpectedConditions.visibilityOf(element));
			 System.out.println("Hi:"+element.getText());
			 */
			 
			 
			 
			 /*
			 WebElement button=driver.findElement(By.xpath("//div[@class='nav-rightarrow']//button[@name='next']"));
			 button.click();
			 //System.out.println("clicked on button");
			 WebElement element1=driver.findElement(By.xpath("//div[@class='ImageNav-itemWrapper col-mobile-1 col-desktop-1 espot rounded-large overflow-hidden bg-primary relative shadow-4']//a[@title='check out online and pay with your SNAP EBT card.']")); 
			 
			 //WebDriverWait wait1 = new WebDriverWait (driver, 20);
			 //wait1.until(ExpectedConditions.visibilityOf(element1));
			 System.out.println("Hi1:"+element1.getText());
			 WebElement button2=driver.findElement(By.xpath("//div[@class='nav-rightarrow']//button[@name='next']"));
			 button2.click();
			 //System.out.println("Button2 Clicked");
			 WebElement element2=driver.findElement(By.xpath("//div[@class='ImageNav-itemWrapper col-mobile-1 col-desktop-1 espot rounded-large overflow-hidden bg-primary relative shadow-4']//a[@title='Advertisement. Powerade, Smartwater, Vitamin Water. Choose hydration. Add to your wellness routine. Shop now.']")); 
			 //WebDriverWait wait2 = new WebDriverWait (driver, 20);
			 //wait2.until(ExpectedConditions.visibilityOf(element2));
			 System.out.println("Hi2:"+element2.getText());
			 */
			 
	     }
		
		

	


}
