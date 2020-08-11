/**
 * 
 */
package Pages.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author e040669
 *this class will store all locators and methods and web elements
 */
public class Loginpage {

	WebDriver driver;
	
	By Username = By.id("Username");
	By password = By.id("Password");
    By Loginbutton = By.className("btn_submit");
    
    public Loginpage(WebDriver driver)
    {
    	this.driver = driver;
}
    
    public void logintolilavati(String User,String pass) {
    	driver.findElement(Username).sendKeys(User);
    	driver.findElement(password).sendKeys(pass);
    	driver.findElement(Loginbutton).click();
    	
    }
    public void typeusername(String uid) {
    	
    	driver.findElement(Username).sendKeys(uid);
    	
    }
    public void typepassword(String pass) {
    	driver.findElement(password).sendKeys(pass);
    	
    }
    public void loginbutton() {
    	driver.findElement(Loginbutton).click();
    	
    }
}