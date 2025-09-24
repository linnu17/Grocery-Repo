package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
public WebDriver driver;
public AdminPage(WebDriver driver) {
	this.driver=driver;
	
}
public void clickAdminMoreInfo() {
	WebElement adminmoreInfo = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer'] "));
	adminmoreInfo.click();
	
}
public void newClick() {
	WebElement newclick=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	newclick.click();
}

	

}
