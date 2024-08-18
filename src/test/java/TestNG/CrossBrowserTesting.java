package TestNG;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void Lounchbrowser(String browser) {

		switch (browser.toLowerCase()) {

		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;

		case "msedge":

			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			driver = null;
			break;

		}
		

	}
	
	
	
	
	@Test
	public void Test_Case() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("successfully performend");
		
	}
	
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
		
	}
	
	
	

}
