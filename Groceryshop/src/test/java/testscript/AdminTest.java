package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.TestNGBase;
import Utilities.ExcelUtility;
import Utilities.FakerUtility;
import pages.AdminPage;
import pages.LoginPage;

public class AdminTest extends TestNGBase{
	@Test
	public void verifyadduser() throws IOException {
		String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
		
		LoginPage login=new LoginPage(driver);
		login.enterusername(usernameValue);
		login.enterpassword(passwordValue);
		login.clicksignin();
		
		
		
		FakerUtility fakerUtility = new FakerUtility();
		
		String randomname=fakerUtility.createRandomUserName();
		String randompassword=fakerUtility.createRandomPassword();
		//String usertype=ExcelUtility.getStringData(1, 2, "Home page");
		
		AdminPage admin=new AdminPage(driver);
		
		admin.clickAdminMoreInfo();
		admin.newClick();
		admin.newUsername();
		admin.newUsertype();
		admin.userSave();
	}
	@Test

	public void verifysearch() throws IOException {
		String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
		
		LoginPage login=new LoginPage(driver);
		login.enterusername(usernameValue);
		login.enterpassword(passwordValue);
		login.clicksignin();
		
	FakerUtility fakerUtility = new FakerUtility();
		
		String randomname=fakerUtility.createRandomUserName();
		
		AdminPage admin=new AdminPage(driver);
		admin.userSearch();
		admin.searchUsername();
		admin.searchUserType();
		admin.searchUser();
		
}
	@Test
	public void verifyreset() throws IOException{
		
		String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
		
		LoginPage login=new LoginPage(driver);
		login.enterusername(usernameValue);
		login.enterpassword(passwordValue);
		login.clicksignin();
		AdminPage admin=new AdminPage(driver);
		
		//username,password,test is there?
		
		admin.reSet();
		
		
		
	}
		
	}
	
	


