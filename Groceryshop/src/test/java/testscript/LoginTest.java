package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestNGBase;
import Utilities.ExcelUtility;
import pages.LoginPage;

public class LoginTest extends TestNGBase{
	@Test(priority = 1,description = "verify login with valid credentials",retryAnalyzer = retry.Retry.class )
	//retry mechnaisn run avan helpcheyunu
	public void verifyvalidusernamevalidpassword() throws IOException {
		String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
	//	
		LoginPage login=new LoginPage(driver);
		login.enterusername(usernameValue);
		login.enterpassword(passwordValue);
		login.clicksignin();
		
		String expected="https://groceryapp.uniqassosiates.com/admin";
	    String actual=driver.getCurrentUrl();
	    Assert.assertEquals(actual,expected, "Login is not successful with valid credential");
	}
	@Test(priority = 2, description = "verify login with validusername and invalidpw")
	public void verifyvalidusernameinvalidpassword() throws IOException{
		String usernameValue =ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(2, 1, "LoginPage");
		
		LoginPage login=new LoginPage(driver);
		login.enterusername(usernameValue);
		login.enterpassword(passwordValue);
		login.clicksignin();
		
		
		String expected="https://groceryapp.uniqassosiates.com/admin/login";
	    String actual=driver.getCurrentUrl();
	    Assert.assertEquals(actual,expected, "Login is successful with valid username and invalid password");
	}
	@Test(priority = 3, description = "verify login with invalid usename and invalid pw")
	public void verifyinvalidusernamevalidpassword() throws IOException{
		String usernameValue =ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(3, 1, "LoginPage");
		
		LoginPage login=new LoginPage(driver);
		login.enterusername(usernameValue);
		login.enterpassword(passwordValue);
		login.clicksignin();
		
		
		String expected="https://groceryapp.uniqassosiates.com/admin/login";
	    String actual=driver.getCurrentUrl();
	    Assert.assertEquals(actual,expected, "Login is successful with invalidusername and valid passwrd");
		
	}
	@Test(priority = 4,description = "verify login with invalid credentials",dataProvider = "loginProvider")
	public void verifyinvalidusernameinvalidpassword(String usernameValue,String passwordValue ) throws IOException{
//		String usernameValue =ExcelUtility.getStringData(4, 0, "LoginPage");
//		String passwordValue =ExcelUtility.getStringData(4, 1, "LoginPage");
		
		LoginPage login=new LoginPage(driver);
		login.enterusername(usernameValue);
		login.enterpassword(passwordValue);
		login.clicksignin();
		
		
		String expected="https://groceryapp.uniqassosiates.com/admin/login";
	    String actual=driver.getCurrentUrl();
	    Assert.assertEquals(actual,expected, "Login is successful with invalidusername and Invalid passwrd");
	}
	
	@Test
	
	@DataProvider(name="loginProvider")//to test 3 set of data, set ana name for dataprovided
	public Object[][] getDataFromDataProvider() throws IOException
	{
		return new Object[][] {//2 dimentional adday anu return cheyune
			new Object[] {"user","password"},//2 dimentional adday anu return cheyune
			new Object[] {"username","pass"},
			new Object[] {"user1","password1"}
		};
	}
	}