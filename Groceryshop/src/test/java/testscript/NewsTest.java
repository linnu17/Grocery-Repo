package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.TestNG;
import org.testng.annotations.Test;

import Base.TestNGBase;
import Utilities.ExcelUtility;

public class NewsTest extends TestNGBase {

	
	private static final boolean isalertdisplayed = false;
	@Test
	public void verifyaddnews() throws IOException{
		String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
		WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
		username.sendKeys(usernameValue);
		WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
		password.sendKeys(passwordValue);
		WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
		signin.click();
		
		WebElement newsmoreinfo = driver.findElement(By.xpath("//a[@class='small-box-footer'and @href ='https://groceryapp.uniqassosiates.com/admin/list-news']"));
		newsmoreinfo.click();
		WebElement newmanageinfo = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		newmanageinfo.click();
		WebElement textarea = driver.findElement(By.xpath("//textarea[@id='news']"));
		textarea.sendKeys("This is a sample news");
		WebElement savemanage = driver.findElement(By.xpath("//button[@name='create']"));
		savemanage.click();
		
		//News alert - isdisplayed method
		
		WebElement newsalert=driver.findElement(By.xpath("//div[@classalert alert-success alert-dismissible]"));
		boolean isalert=newsalert.isDisplayed();
		Assert.assertTrue(isalertdisplayed,"The news is not added");
		}
	@Test(description= "click to homebutton and back to home page")
	public void verifyreturntohome() throws IOException {
		String usernameValue =ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue =ExcelUtility.getStringData(1, 1, "LoginPage");
		WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
		username.sendKeys(usernameValue);
		WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
		password.sendKeys(passwordValue);
		WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
		signin.click();
		
		WebElement newsmoreinfo = driver.findElement(By.xpath("//a[@class='small-box-footer'and @href ='https://groceryapp.uniqassosiates.com/admin/list-news']"));
		newsmoreinfo.click();
		WebElement newmanageinfo = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		newmanageinfo.click();
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
	    home.click();
	    
	    String expected="https://groceryapp.uniqassosiates.com/admin/home";
	    String actual=driver.getCurrentUrl();
	    Assert.assertEquals(actual,expected, "The page is not redirecting to home page");
	    
	   
	}
	
	

}
