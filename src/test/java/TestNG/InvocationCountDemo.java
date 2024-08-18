package TestNG;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	@Test(priority=2, invocationCount=5)
	public void TestMethod_1() {
		System.out.println("Test case 1");
	}
	
	@Test(priority=1)
	public void TestMethod_2() {
		System.out.println("Test case 2");
	}

}
