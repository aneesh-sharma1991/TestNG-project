package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory {
	
	static WebDriver driver;
	
	public static WebDriver startbrowser(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("chrome")) {
			
			
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
}
