package Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_pup_handel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

	}
	
	@Test(invocationCount=5)             // invocation count is proved the how many times test case are execute
	public void Authentication_pup_handel() throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
		
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	
	Thread.sleep(4000);
	driver.close();
	
	
	}

}
