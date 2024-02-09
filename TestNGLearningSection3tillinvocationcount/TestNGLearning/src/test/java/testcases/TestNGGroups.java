package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGGroups 
{
	
	WebDriver driver;
	
	@BeforeSuite 
	   public void setUp() 
	   { 
		System.out.println("Before Suite");
	// Create an object of FirefoxDriver class. 
	     //driver = new ChromeDriver(); 
	   } 
	@BeforeClass
	 public void beforeClass()
	 { 
	   System.out.println("Before class"); 
	 } 
	@Test(groups = { "group1", "group2" })
	  public void test_method1()
	  {
	    //Test implementation
		System.out.println("This method is for group1 and group2");
	  }
	 
	  @Test(groups = {"group2"} )
	  public void test_method2()
	  {
	    //Test implementation
		  System.out.println("This method is for group2");
	  }
	 
	  @Test(groups = {"group1"})
	  public void test_method3()
	  {
	    //Test implementation
		  System.out.println("This method is for group3");
	  }
	  
	  @AfterClass
	  public void afterClass()
	  { 
	     System.out.println("After class"); 
	   } 
	  @AfterSuite 
	  public void closeDriver() 
	  { 
	    driver.close(); 
	   } 

}
