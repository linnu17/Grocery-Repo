package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
		public void enterusername(String usernamevalue) {
		WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
		username.sendKeys(usernamevalue);
	}

		public void enterpassword(String passwordValue) {
			WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
			password.sendKeys(passwordValue);
		
		}
		public void clicksignin() {
			WebElement signin = driver.findElement(By.xpath("//button[text() ='Sign In']"));
			signin.click();
		}
	
		
}
