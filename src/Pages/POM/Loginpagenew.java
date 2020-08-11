package Pages.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpagenew {
	
	
	WebDriver driver;
	public Loginpagenew(WebDriver ldriver) {
		
		this.driver = ldriver;
	}
	
	@FindBy(id="Username")
	WebElement username;
	
	@FindBy(how=How.ID,using="Password")
	WebElement password;

	@FindBy(how=How.CLASS_NAME,using="btn_submit")
	WebElement submitbutton;
	
	
	public void loginlilavati(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		submitbutton.click();
	}
	
}
