package Demos;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class JavaScriptExec {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
//		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Login']")));
//		
//		element.click();

		Thread.sleep(4000);
		
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Admin';", element);
		
		
		Thread.sleep(4000);
		// Enter the value
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.getElemenByXpath('//input[@name='username']').value= 'Admin';");
		
//		document.getElementById('[ID]')
//		document.getElementsByClassName('[CLASS]') 
//		document.getElementsByName('[NAME]') 
//		document.getElementsByTagName('[ELEMENT-TYPE]') 
//
//		document.querySelector('[CSS-SELECTOR]') 
//		document.querySelectorAll('[CSS-SELECTOR]')
		
		Thread.sleep(4000);
		
		
		
		// click on button
//		WebElement element= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
//		js.executeScript("arguments[0].click();",element);
		

		
//		// Refresh the browser window Or Page
//		js.executeScript("history.go(0)");
		
		
//		// get domain Name
//		String as = js.executeScript("return document.domain").toString();
//		System.out.println("domain: "+ as);
		
		
//		// get the title 
//		String tl = js.executeScript("return document.title").toString();
//		System.out.println("Title: "+tl);
		
		
//		// get the title 
//		String ur = js.executeScript("return document.URL").toString();
//		System.out.println("URL: "+ur);
		
		
//		// draw border web element 
//		js.executeScript("arguments[0].style.border = '3px solid red';", element);
		
		
//		// zoom the page
//		js.executeScript("document.body.style.zoom= '200%'");
		
		
		
//		// Return height and width of web page
//		System.out.println(js.executeScript("Height: "+ "return window.innerHeight;").toString());
//		System.out.println(js.executeScript("Width: "+ "return window.innerWidth;").toString());
		
//		Thread.sleep(6000);
		
//		// full scroll down vertically 
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		// set scroll down vertically
//		js.executeScript("window.scrollBy(0,250)", "");
		
//		Thread.sleep(6000);
		
		// full scroll up vertically 
//		js.executeScript("window.scrollBy(-0,document.body.scrollHeight)");
		// set scroll down vertically
//		js.executeScript("window.scrollBy(0,-250)", "");
		
		
//		// alter message create 
//		js.executeScript("alert ('this ia alter message Ashwin');");
		
		
		// To navigate to different page
//		js.executeScript("window.location = 'https://www.facebook.com/login/'");		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();

		
		
		
		
		
		
		
		
	}

}
