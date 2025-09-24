package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginclick() {
		WebElement loginclick= driver.findElement(By.xpath("//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']"));
		loginclick.click();
	}
	public void logoutclick() {
		WebElement logoutclick = driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
		logoutclick.click();
	}

}
