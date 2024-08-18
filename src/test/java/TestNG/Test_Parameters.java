package TestNG;

import org.testng.annotations.*;

import com.beust.jcommander.Parameter;

public class Test_Parameters {

	
	
	@Test
	@Parameters({"x","y"})
	public void add(int a, int b) {

		System.out.println("Add: " + a + b);
	}
	
	
	

	@Test
	@Parameters({"x","y"})
	public void multi(int a, int b) {

		System.out.println("multiflication: " + a + b);
	}
	
	
	
	
	
	

	
	
}
