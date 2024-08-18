package Demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test
public class Properties_File {

	public void properties() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

		ReadConfigFile ref = new ReadConfigFile();
		driver.get(ref.GetURL());

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ref.Getusernm());

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ref.Getpasswd());

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(10000);
		driver.close();
		
		
		// see the cofig.properties file and go to ReadConfigFile
		
		// create object for the readconfigFile 
		
	}

}
