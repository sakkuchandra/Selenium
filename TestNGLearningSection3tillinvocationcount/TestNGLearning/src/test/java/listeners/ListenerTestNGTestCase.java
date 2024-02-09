package listeners;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;		
@Listeners(listeners.ListenerTestNG.class)

public class ListenerTestNGTestCase 
{

	//WebDriver driver= new FirefoxDriver();					

	 
	
	// Test to pass as to verify listeners .		
	@Test(priority=1)	
	public void TestToPass()				
	{	
	    System.out.println("This method to pass test");	
	    System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.softwaretestingmaterial.com/100-software-testing-interview-questions/");	
	    driver.getTitle();
	    driver.quit();
	}		
	//Used skip exception to skip the test
	@Test(priority=2)
	public void TestToSkip ()
	{
            System.out.println("This method to skip test");
	    throw new SkipException("Skipping - This is not ready for testing ");
	}
	// In the above method, we have already closed the browser. So we couldnot get the title here. It is to forcefully fail the test			
	@Test(priority=3)		
	public void TestToFail()				
	{		
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserNatives\\chrome120\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	    driver.getTitle();
	    System.out.println("This method to test fail");				
	}
}