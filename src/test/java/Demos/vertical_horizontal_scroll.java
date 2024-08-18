package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vertical_horizontal_scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	
	@Test
	public void vertical() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://www.calculator.net/");
		
		Thread.sleep(4000);
		
		
		
		// To Scroll down the web page by pixel
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)", "");
		
		
		
		
		
		// To Scroll down the web page by visibility of the element 
//		WebElement element = driver.findElement(By.linkText("BMR Calculator"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",element);
		
		
		
		
		
//		// To Scroll down the web page at the bottom of the page
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		
		// To Scroll down the web page by Horizontal of the element 
//		WebElement element = driver.findElement(By.linkText("BMR Calculator"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",element);
		
		
		
		
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public void horizontal() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://www.calculator.net/");
	}
	
	

}
