package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(TestNG.New_Listeners.class)
public class Listeners_1 {
	
	@Test
	public void Listeners_11 (){
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String title = "OrangeHRM";
		
		assertEquals(title, driver.getTitle());
		
		System.out.println("1 Test Case is pass");
		
		driver.close();	
	}
		
		@Test
		public void Listeners_22() {

			System.out.println("2 Test Case is field");
			assertTrue(false);

		}
		
		
		@Test
		public void Listeners_23() {
			
			System.out.println("3 Test Case is skiped");
			throw new SkipException("Skip exception throws...");
		}
		
		
		// go into the New_Listeners class
		
	

}
