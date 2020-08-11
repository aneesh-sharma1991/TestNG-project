package SodexoPOMcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.Browserfactory;
import Pages.POM.Loginpagenew;

public class verifyvalidlogins {
	@Test
	
	public void chckvaliduser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aneesh\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=Browserfactory.startbrowser("chrome", "http://epinetuat/sodexofinal");//start browser and launch URL
	Loginpagenew login =PageFactory.initElements(driver,Loginpagenew.class);
	login.loginlilavati("fnbsd", "NOVe@123");
	}	
	
	

	

}
