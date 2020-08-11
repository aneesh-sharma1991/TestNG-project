package SodexoPOMcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.POM.Loginpage;

public class verifylilavatilogin1 {
	@Test
	
	public void verifyvalidlogin() {
		System.setProperty("webdriver.chrome.driver","D:\\Aneesh\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
driver.manage().window().maximize();
driver.get("http://epinetuat/sodexofinal/");

	
	Loginpage login = new Loginpage(driver);
	login.typeusername("admin");
	login.typepassword("demo11");
	login.loginbutton();
//	driver.quit();
}
	
	
	
}