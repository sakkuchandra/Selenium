import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSliders 
{

	public static void main(String[] args) 
	{


		System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome90\\chromedriver.exe");
	   	 WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");  //UniformResourceLocator 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement mainSlider = driver.findElement(By.id("slider"));
		int width = mainSlider.getSize().width/2;
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Actions(driver).dragAndDropBy(slider, width, 0).perform();
		
		

	}

}
