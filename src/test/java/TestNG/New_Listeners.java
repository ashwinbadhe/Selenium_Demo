package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class New_Listeners implements ITestListener{
	
	
	
	public void onStart (ITestContext Result) {
		System.out.println("on Strat method invoked.");
	}
	
	public void onFinish (ITestContext Result) {
		System.out.println("on Strat method invoked Finish.");
	}
	
	
	
	
	public void onTestFailure (ITestResult Result) {
		System.out.println("name of test case failed: " + Result.getName());
	}
	
	
	public void onTestSkipped (ITestResult Result) {
		System.out.println("Name of Test case skip: "+ Result.getName());
	}
	
	
	public void onTestStart (ITestResult Result) {
		System.out.println("Name of Test case started: "+ Result.getName());
	}
	
	
	public void onTestSuccess (ITestResult Result) {
		System.out.println("Name of Test case Successfully executed: "+ Result.getName());
	}
	
	
	

}
