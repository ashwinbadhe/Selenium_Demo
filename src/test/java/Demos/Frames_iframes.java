package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_iframes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://www.rediff.com/");
		
		
		
		// switch to iframe 
		
		// frame string Name or Id 
		
		driver.switchTo().frame("moneyiframe");
		
		//find web element & print value
		String as = driver.findElement(By.id("nseindex")).getText();
		
		System.out.println(as);
		
		
		// switch to main page
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Enterprise Email")).click();
		
		
		
		Thread.sleep(5000);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void nested_iframe() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");

		Thread.sleep(5000);
		// switch to iframe 1

		driver.switchTo().frame("iframe1");

		driver.findElement(By.xpath("//button[@id='u_5_6']")).click();

		String as = driver.findElement(By.xpath("//p[@id='processing']")).getText();
		Thread.sleep(5000);
		System.out.println("Frame1: " + as);

		// switch to main iframe

		driver.switchTo().frame("parent_iframe");

		driver.findElement(By.xpath("//button[@id='u_5_5']")).click();

		String ss = driver.findElement(By.xpath("//p[@id='processing']")).getText();
		Thread.sleep(5000);
		System.out.println("main Frame: " + ss);
	
		
		
		
		
		
	}

}
