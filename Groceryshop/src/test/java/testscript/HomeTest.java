package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestNGBase;
import Utilities.ExcelUtility;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends TestNGBase{
	@Test (description="verify logout")
	public void verifylogout() throws IOException {
			String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
			String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
			// click window+v
			LoginPage login=new LoginPage(driver);
			login.enterusername(usernameValue);
			login.enterpassword(passwordValue);
			login.clicksignin();
			
			HomePage page=new HomePage(driver);
			page.loginclick();
			page.logoutclick();
			
			
			String expected="https://groceryapp.uniqassosiates.com/admin";
		    String actual=driver.getCurrentUrl();
		    Assert.assertEquals(actual,expected, "Login is not successful with valid credential");
		}
	}


