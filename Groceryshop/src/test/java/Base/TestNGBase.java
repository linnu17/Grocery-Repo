package Base;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilities.ScreenshotUtility;

public class TestNGBase {
	public WebDriver driver ;
	@BeforeMethod
	public void browserInitialization() {
		// driver = new ChromeDriver(); //webdriver interface chromedriver class driver ref variable
		ChromeOptions options = new ChromeOptions();
		Map<String,Object> prefs=new HashMap<>();
		prefs.put("profile.password_manager_leak_detection", false);
		options.setExperimentalOption("prefs", prefs);
		driver=new ChromeDriver(options);
	driver.get( "https://groceryapp.uniqassosiates.com/admin/login");//to launch url use get method
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.close(); //to close the current window
		//driver.quit();// to close the complete window
	}
  @AfterMethod
	public void browserQuitClose() {
	
		//driver.close();
		//driver.quit();
	
	}
  @AfterMethod(alwaysRun = true)
	public void driverQuit(ITestResult iTestResult) throws IOException
	{
		if(iTestResult.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotUtility screenShot=new ScreenshotUtility();
			screenShot.getScreenshot(driver, iTestResult.getName());
		}
	//	driver.quit();

	}
}


