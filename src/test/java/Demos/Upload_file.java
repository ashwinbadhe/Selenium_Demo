package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://formstone.it/components/upload/demo/");
		
		
		WebElement select_file = driver.findElement(By.linkText("Drag and drop files or click to select"));
		
		select_file.sendKeys("C:\\Users\\91892\\Desktop\\Old_Resume");
		
		driver.findElement(By.xpath(""));
		
		
		Runtime.getRuntime();
		
		
		
		
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
	}

}
