package Demos;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShort {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		/*
		
	    driver.get("https://www.facebook.com/login/");
	    
		
		// ((((((((   full SCreenShort Capture      ))))))))))))
	    
	    
	    // Step 1: convert web driver object to take screenShort interface
		
		TakesScreenshot screenshort = ((TakesScreenshot)driver);
		
		
		// Step 2: call getScreenshort method to create image file
		// this syntax return the File
		
		File src = screenshort.getScreenshotAs(OutputType.FILE);
		
		// given the file path and file name \\ filename.png
		
		File dest = new File("C:\\Users\\91892\\eclipse-workspace\\Selenium\\ScreenShort\\fullpagescreenshort.png");
		
		// Step 3: download the MVN Repository
		
		// Step 4: created the get screen short file (src) copy to this destination (dest) 
		
		FileUtils.copyFile(src, dest);
		
		
		driver.close();
		
		// go to screen short file and right click on refresh the file. 
		

		*/
		
		
		
		
		
		
		/*
		
        //  ((((((((   particular part or section of SCreenShort Capture      ))))))))))))
	    
		driver.get("https://www.facebook.com/login/");
		
	    // Step 1: convert web driver object to take screenShort interface
		
		// TakesScreenshot screenshort = ((TakesScreenshot)driver);    (not need to this syntex)
		
		WebElement section = driver.findElement(By.xpath("//div[@class='_xku']"));
		
		// Step 2: call getScreenshort method to create image file
		// this syntax return the File
		
		File src = section.getScreenshotAs(OutputType.FILE);
		
		// given the file path and file name \\ filename.png
		
		File dest = new File("C:\\Users\\91892\\eclipse-workspace\\Selenium\\ScreenShort\\SectionOfScreenshort.png");
		
		// Step 3: download the MVN Repository
		
		// Step 4: created the get screen short file (src) copy to this destination (dest) 
		
		FileUtils.copyFile(src, dest);
		
		
		driver.close();
		
		// go to screen short file and right click on refresh the file.
		
		
		
		*/
		
		
		
		

		
        //  ((((((((   buttons of SCreenShort Capture      ))))))))))))
	    
		driver.get("https://www.facebook.com/login/");
		
	    // Step 1: convert web driver object to take screenShort interface
		
		// TakesScreenshot screenshort = ((TakesScreenshot)driver);    (not need to this syntex)
		
		Thread.sleep(4000);
		
		WebElement section = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']"));
		
		// Step 2: call getScreenshort method to create image file
		// this syntax return the File
		
		File src = section.getScreenshotAs(OutputType.FILE);
		
		// given the file path and file name \\ filename.png
		
		File dest = new File("C:\\Users\\91892\\eclipse-workspace\\Selenium\\ScreenShort\\ButtonOfScreenshort.png");
		
		// Step 3: download the MVN Repository
		
		// Step 4: created the get screen short file (src) copy to this destination (dest) 
		
		FileUtils.copyFile(src, dest);
		
		
		driver.close();
		
		// go to screen short file and right click on refresh the file.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
