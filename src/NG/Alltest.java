package NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Alltest {


public void test1()
{
	int a = 0, b = 1, c, i, count = 10;
	 // To print 0 and 1
	 System.out.print(a + " " + b);
	 // loop starts from 2. We have already printed 0 and 1 in the previous step
	for (i = 2; i < count; i++) {
	 c = a + b;
	 System.out.print(" " + c);
	 a = b;
	 b = c;
	 
	 }}
@Test
public void test2() {
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Aneesh\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	  driver.get("https://touch2orderqa.sodexonet.com");
	  driver.manage().window().maximize();
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  driver.close();
	
}

}}
