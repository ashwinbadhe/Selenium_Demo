package Demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void Date_picker() throws Exception {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
		
	driver.get("https://demos.telerik.com/aspnet-ajax/calendar/overview/defaultcs.aspx");
	
	Thread.sleep(2000);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)", "");
	
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[@class='rcTitle']")).click();
	
	Thread.sleep(4000);
	
	String date = "6";                       //  create variable for date 
	String moanth_year = "August 2024";       //  create variable for month and year
	
	
	while(true) {    //  create while loop
		
		String system_month_Year = driver.findElement(By.xpath("//span[@class='rcTitle']")).getText(); // under the while loop get the year and month get text
		System.out.println(system_month_Year);
		
		if(moanth_year.equals(system_month_Year))  // create the if under while loop and condition and compare variable of year and month and get text month and year
		{
			List <WebElement> dayList = driver.findElements(By.xpath("//table/tbody/tr/td")); // filed the 30 days element and create the list
			for(WebElement e:dayList)   // create the for loop under while loop and transfer the new variable this variable create under for condition
			{
				String system_day = e.getText(); // get text for new new variable 
				System.out.println(system_day);  
				if(system_day.equals(date))  // create if condition under for loop and check the set variable day equal to list of day new variable
				{
					e.click();  //condition is true click on list of day element and break for loop and break while loop
					break;  
				}
			}
			break;
		}                       // if while loop condition is not true then else click on Next button.
		else 
		{
			driver.findElement(By.xpath("//a[@class='t-button rcNext']")).click();		
			}
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	driver.close();
	}

}
