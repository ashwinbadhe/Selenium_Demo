package TestNG;

import org.testng.annotations.Test;

public class Enable_Disable_XML {
	
	
	
	@Test (enabled=true)
	public void Test_Case_1() {
	
		System.out.println("First Test Case");
		
	}
	
	@Test
	public void Test_Case_2() {

		System.out.println("Seconde Test Case");

	}

	@Test
	public void Test_Case_3() {

		System.out.println("Theade Test Case");

	}
	
	
	@Test
	public void Test_Case_4() {

		System.out.println("Four Test Case");

	}
	
	
	@Test
	public void Test1_22222() {

		System.out.println("Reguler expresion");

	}
	
	
	
	
	
	
	

}
