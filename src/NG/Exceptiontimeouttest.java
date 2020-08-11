package NG;

import org.testng.annotations.Test;

public class Exceptiontimeouttest {

	/*
	 * @Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	 * public void infinitelooptest() { int i = 1; while(i==1) { //
	 * System.out.println(i);
	 */	
@Test(expectedExceptions=NumberFormatException.class)
public void test1() {
	String x = "100A";
	Integer.parseInt(x);
	
}
}