package TestNG;

import org.testng.annotations.*;

public class Enable_Disable_Test_Case_TestNG {
	
	
	
	@Test (enabled=true)
	public void Test_Case_1() {
	
		System.out.println("First Test Case");
		
	}
	
	@Test(enabled=false)
	public void Test_Case_2() {

		System.out.println("Seconde Test Case");

	}

	@Test(enabled=true)
	public void Test_Case_3() {

		System.out.println("Theade Test Case");

	}
	
	
	
	// 2st way to Disable the Test case with the help of test case suite with use of <Method> Tag  (Kindly check the class for  Enable_Disable_XML )
	
	
	
	
	

}
