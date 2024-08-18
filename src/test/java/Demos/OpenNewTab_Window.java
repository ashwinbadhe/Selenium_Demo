package Demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTab_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open URL
		
		driver.get("https://www.google.com/");
		System.out.println("1st Tab "+ driver.getTitle());
		
		// Open new tab
	
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		driver.get("https://www.facebook.com/login/");
		System.out.println("2st Tab "+ driver.getTitle());
		
		
		// get window handles of open windows
		
		Set <String> windowshendles = driver.getWindowHandles();		
		
		// save in array list
		
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowshendles);
		
		driver.close();
		
		// switch to window 
		
		driver.switchTo().window(handles.get(0));
		System.out.println("switch to first page");
		
		
		driver.quit();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
