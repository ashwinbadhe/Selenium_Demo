package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions_Demo {
	
	@Test
	public void TestMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		SoftAssert S_Ass = new SoftAssert();
		
		System.out.println("Verifying Title");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Log in to Facebook*";
		S_Ass.assertEquals(ActualTitle, ExpectedTitle, "The Title is not correct: ");
		
		System.out.println("Verifying imege");
		WebElement icon = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		S_Ass.assertTrue(icon.isDisplayed());
		
		System.out.println("Verifying button");
		WebElement Button = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		S_Ass.assertTrue(Button.isDisplayed());
		
		
		driver.close();
		
		
		// report all failure messages
		S_Ass.assertAll();
	}
	
	

}
