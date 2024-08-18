package TestNG;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

public class Test_Annotation_Attributes {
	
	
	/*
	// description Attributes
	
	@Test(description = "This is My 1 Test Case")
	public void Test_Case_1() {
		System.out.println("Test Case 1");
	}

	@Test(description = "This is My 2 Test Case")
	public void Test_Case_2() {
		System.out.println("Test Case 2");
	}
	
	*/
	
	
	
	
	/*
	// timeout Attributes
	
	@Test (timeOut = 200)
	public void Test_Case_3() throws Exception{
		Thread.sleep(4000);
		System.out.println("Test Case 3");
	}
	
	@Test
	public void Test_Case_4() {
		System.out.println("Test Case 4");
	}
	
	/*
	
	
	
	
	// priority Attributes
	
	@Test(priority= 2)
	public void Test_Case_5() {
		System.out.println("Test Case 5");
	}
	
	@Test(priority= 1)
	public void Test_Case_6() {
		System.out.println("Test Case 6");
	}
	
	@Test
	public void Test_Case_7() {
		System.out.println("Test Case 7");
	}
	
	*/
	
	
	
	
	
	// dependsOnMethods
	
	/*
	@Test
	public void Test_Case_8() {
		System.out.println("Test Case 8 is pass");
		assertTrue(true);
	}
	
	@Test(dependsOnMethods= {"Test_Case_8"})
	public void Test_Case_9() {
		System.out.println("Test Case 9 is false");
		assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"Test_Case_9"})
	public void Test_Case_10() {
		System.out.println("Test Case 10");
	}
	
	*/
	
	

	
	// Groups Attributes 
	
	
	
	@Test(groups="Software")
	public void TCS() {
		System.out.println("TCS is Software Company");
	}
	
	@Test(groups="Software")
	public void IBM() {
		System.out.println("IBM is Software Company");
	}
	
	
	
	@Test(groups="Bank")
	public void ICICI_Bank() {
		System.out.println("ICICI is a Bank");
	}
	
	@Test(groups="Bank")
	public void HDFC_Bank() {
		System.out.println("HDFC is a Bank");
	}
	
	
	
	
	
	
	
	
	

}
