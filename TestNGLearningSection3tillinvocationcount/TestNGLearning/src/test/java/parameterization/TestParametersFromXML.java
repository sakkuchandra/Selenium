package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersFromXML 
{

	@Parameters({"browser","env"})
	@Test
	public void getBrowser(String browser,String env) 
	{
		
		
		if(browser.compareTo("chrome")==0)
		{
			
		}
		else if(browser.compareTo("firefox")==0)
		{
			
		}
		System.out.println(browser+"--"+env);
		
	}
	
}
