package Demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //(wait 10 seconds for perform every element)
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Toys");
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		driver.findElement(By.linkText("Advanced")).click();
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
