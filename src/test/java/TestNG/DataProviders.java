package TestNG;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataProviders {
	
	
	
	// 1. India Ram Mandir
	// 2. Junnar Shivaneri forte
	// 3. Pune Dagdushet Ganpati
	
	
	@DataProvider(name = "SearchDataSet")
	public Object[][] SearchData()      // created data provider function
	{                
		
		//First Row [] & Second Collome []

		Object[] [] searchkayword = new Object [3] [2];
		
		searchkayword[0] [0] = "UserId_1";
		searchkayword[0] [1] = "password_1";
		
		searchkayword[1] [0] = "UserId_2";
		searchkayword[1] [1] = "password_2";
		
		searchkayword[2] [0] = "UserId_3";
		searchkayword[2] [1] = "password_3";
		
		
		return searchkayword;
		
	}
	
	@Test (dataProvider = "SearchDataSet")
	public void TestCaseGoogleSearche(String UserID, String Password) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		
		email.sendKeys(UserID);
		pass.sendKeys(Password);
		
		
		driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		driver.close();
		
		
		
		
	}
	

}
