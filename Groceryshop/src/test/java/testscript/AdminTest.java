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
		WebElement newusername=driver.findElement(By.xpath("//input[@id='username']"));
		newusername.sendKeys(randomname);
		WebElement newpassword = driver.findElement(By.xpath("//input[@id='password']"));
		newpassword.sendKeys(randompassword);
		WebElement newusertype =driver.findElement(By.xpath("//select[@id='user_type']"));
		Select select = new Select(newusertype);
		select.selectByVisibleText("Admin");
		WebElement usersave = driver.findElement(By.xpath("//button[@name='Create']"));
		usersave.click();
	}
	@Test

	public void verifysearch() throws IOException {
		String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
		WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
		username.sendKeys(usernameValue);
		WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
		password.sendKeys(passwordValue);
		WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
		signin.click();
		
		FakerUtility fakerUtility = new FakerUtility();
		
		String randomname=fakerUtility.createRandomUserName();
		WebElement adminmoreInfo = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer'] "));
		adminmoreInfo.click();
		WebElement usersearch = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		usersearch.click();
		
		WebElement searchusername = driver.findElement(By.xpath("//input[@id='un']"));
		searchusername.sendKeys(randomname);
		WebElement searchusertype = driver.findElement(By.xpath("//select[@name='ut']"));
		Select select = new Select(searchusertype);
		select.selectByVisibleText("Admin");
		WebElement searchuser = driver.findElement(By.xpath("//button[@name='Search']"));
		searchuser.click();
	}
	@Test
	public void verifyreset() throws IOException{
		
		String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
		WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
		username.sendKeys(usernameValue);
		WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
		password.sendKeys(passwordValue);
		WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
		signin.click();
		
		WebElement adminmoreInfo = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer'] "));
		adminmoreInfo.click();
		WebElement usersearch = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		usersearch.click();
		WebElement reset=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-warning']"));
		reset.click();
		
		
		
	}
		
	}
	
	


