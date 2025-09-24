package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
public WebDriver driver;
public AdminPage(WebDriver driver) {
	this.driver=driver;
	
} 
//page factory cheyan paranjal @findby xpath edukanm, notfindelement(it is reusable code)
@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminmoreInfo;
public void clickAdminMoreInfo() {
	//WebElement adminmoreInfo = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer'] "));
	adminmoreInfo.click();
	
}
public void newClick() {
	WebElement newclick=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	newclick.click();
}
public void newUsername() {
	WebElement newusername=driver.findElement(By.xpath("//input[@id='username']"));
	newusername.click();
}
public void newpassword() {
	WebElement newPassword = driver.findElement(By.xpath("//input[@id='password']"));
	newPassword.click();
}
public void newUsertype() {
	WebElement newusertype =driver.findElement(By.xpath("//select[@id='user_type']"));
	newusertype.click();
}
public void userSave() {
	WebElement usersave = driver.findElement(By.xpath("//button[@name='Create']"));
	usersave.click();	
}
public void userName() {
	WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
	username.click();	
}
public void userSearch() {
	WebElement usersearch = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
	usersearch.click();
}
public void searchUsername() {
	WebElement searchusername = driver.findElement(By.xpath("//input[@id='un']"));
	searchusername.click();	
}
public void searchUserType() {
	WebElement searchusertype = driver.findElement(By.xpath("//select[@name='ut']"));
	searchusertype.click();
}
public void searchUser() {
	WebElement searchuser = driver.findElement(By.xpath("//button[@name='Search']"));
	searchuser.click();	
}
public void reSet() {
	WebElement reset=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-warning']"));
	reset.click();
}








}
