import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTest 
{
	WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
	 
   
	public void initialization()
    {
	    
    	System.setProperty("webdriver.chrome.driver", "e:\\BrowserNatives\\chrome120\\chromedriver.exe");
   	    driver = new ChromeDriver();
	    driver.get("http://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
		  
	
	public void fbLoginLogout() throws IOException
	{
		File src=new File("e:\\Test.xlsx");		  
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis);
		sheet= workbook.getSheetAt(0);
			for(int i=0; i<=sheet.getLastRowNum(); i++)
			{
				
				cell = sheet.getRow(i).getCell(0);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				
				driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(cell.getStringCellValue());
								 
				
				cell = sheet.getRow(i).getCell(1);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				
				
				driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(cell.getStringCellValue());
						}
	}
			public static void main(String args[])throws Exception
			{
				DataDrivenTest ddt=new DataDrivenTest();
				ddt.initialization();
				ddt.fbLoginLogout();
			}
	}
	 
