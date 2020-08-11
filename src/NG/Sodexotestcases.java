package NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sodexotestcases {
  WebDriver driver ;

  
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Aneesh\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://epinetuat/sodexofinal/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.findElement(By.id("Username")).sendKeys("fnbsd");
	  driver.findElement(By.id("Password")).sendKeys("NOVe@123");
	  driver.findElement(By.className("btn_submit")).click();
	}
	@Test(priority=2,groups="patientname search") 
	public void searchbypatientname() throws InterruptedException {
		
		driver.findElement(By.id("profile-tab")).click();
		Thread.sleep(3000);
		  driver.findElement(By.name("patientname")).sendKeys("Sanjay jain");;
		  driver.findElement(By.name("btnpatientname")).click();
		  Thread.sleep(3000);
	}
	
	@Test(priority=1,groups="ward search")
	public void searchward() throws InterruptedException {
		driver.findElement(By.name("wardno")).sendKeys("1B");
      		   driver.findElement(By.name("btnwardsearch")).click();   
      		 Thread.sleep(3000);
	}
	@Test(priority=3,groups="patient transfer") 
	public void patientransferdetails() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/SodexoFinal/Reports/PatientTransferUtility']")).click();
		 Thread.sleep(3000);
	} 
		 @Test(priority=4,groups="next button")
		 public void nextbutton() throws InterruptedException {
			 driver.findElement(By.xpath("//a[@href='/SodexoFinal/Reports/PatientTransferUtility']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.id("id_next")).click();
		 }
		 @Test(priority=5,groups="test")
		 public void test0() {
			 System.out.println("test0");
		 }
		 @Test(priority=6,groups="test")
		 public void test1() {
			 System.out.println("test1");
		 }
		 @Test(priority=7,groups="test")
		 public void test2() {
			 System.out.println("test2");
		 }
		 
	
	@AfterMethod
	public void tearup() {
		
			driver.quit();
		
	}
	
}
