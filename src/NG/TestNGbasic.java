package NG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasic {
	//pre conditions starting with before annotation
	
	@BeforeSuite 
	public void setup() {
		System.out.println("set up system");
		}
	@BeforeTest
	public void launchbrowser() {
		System.out.println("launch browser");
}
	@BeforeClass
	public void login() {
		System.out.println("login to sodexo app");	
}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL of sodexo");	
	}
	
	
//test case starting with @Test
@Test
public void selectward() {
	System.out.println("select ward");
}
@Test
public void selectbed() {
	System.out.println("select bed");
}
@Test
public void clickonsearch() {
	System.out.println("click on search");
}
//post conditions starting with After annotation
@AfterMethod
public void logout()
{
	System.out.println("logout of app");
}

@AfterClass
public void closebrowser() {
	System.out.println("close browser");
}
	@AfterTest
	public void deletecookies() {
		System.out.println("delete cookies");

	}

@AfterSuite
public void generatetestreport() {
	System.out.println("generate test report");
}
}