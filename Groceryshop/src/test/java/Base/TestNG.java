package Base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNG {
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
		//driver.close(); //to close the current window
		//driver.quit();// to close the complete window
	}
  @AfterMethod
	public void browserQuitClose() {
	
		//driver.close();
		//driver.quit();
	
	}
	
}


