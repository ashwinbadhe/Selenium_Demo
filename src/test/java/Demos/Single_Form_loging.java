package Demos;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_Form_loging {

	
	@Test
	public void Test_Case() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		Actions act = new Actions(driver);
		Action AllSetInOne = act
				.moveToElement(driver.findElement(By.xpath("//input[@name='username']")))
				.click()
				.sendKeys("Admin", Keys.TAB)
				.sendKeys("admin123", Keys.TAB,Keys.ENTER).build();
		
		AllSetInOne.perform();	
		
		
		
		System.out.println("successfully performend");
		driver.close();
	
	}
	
}
