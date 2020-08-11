package NG;

import org.testng.annotations.Test;

public class TestNGfeatures {

	@Test(dependsOnMethods="loginTest")
	public void HomePagetest() {
		System.out.println("homepage test");
	
	}
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		//int i = 9/0;
	}
	

	@Test(dependsOnMethods="loginTest")
	public void SearchPagetest() {
		System.out.println("searchpage test");
		
}

	@Test(dependsOnMethods="loginTest")
	public void RegisterPagetest() {
		System.out.println("registerpage test");
}
}