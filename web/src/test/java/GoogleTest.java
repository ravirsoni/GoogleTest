
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test; 

public class GoogleTest { 
	WebDriver driver; 
	
	@BeforeTest 
	public void StartBrowser_NavURL() 
	{ 
		System.setProperty("webdriver.ie.driver", "C:/Users/c001216/Desktop/IEDriverServer_x64_3.4.0/IEDriverServer.exe");
		driver = new InternetExplorerDriver(); 
		driver.manage().window().maximize(); 
	}
	
	
	@Test 
	public void testToCompareDoubles() 
	{ 
		driver.get("http://www.google.com"); 
	}
	
//	@AfterMethod
//	public void closeBrowser(){
//	driver.close();
//	}
	
	
	@AfterTest 
	public void CloseBrowser() 
	{
		System.out.println("close browser");
		driver.close();
	} 
	
}