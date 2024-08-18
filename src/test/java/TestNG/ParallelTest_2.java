package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest_2 {
	
	
	@Test
public void Parallel_02() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	driver.findElement(By.xpath("//a[.='Admin']")).click();
	
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)","");
	
	WebElement Employee_Name = driver.findElement(By.xpath("(//div[contains(text(),'Admin')])[1]"));
	
	System.out.println("2 Test Case "+Employee_Name.getText());
	
	
	driver.findElement(By.xpath("//a[contains(.,'PIM')]")).click();
	
	driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("abc");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	js.executeScript("window.scrollBy(0,500)","");
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[9]/div/button[2]")).click();
	
	WebElement fullName = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']"));
	
	System.out.println("2 Test Case "+fullName.getText());
	
	
	
	driver.close();
	
	
	
	
	
  }
}
