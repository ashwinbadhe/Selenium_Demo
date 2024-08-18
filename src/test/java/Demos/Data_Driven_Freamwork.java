package Demos;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Driven_Freamwork {
	
	@Test
	public void DataDriven() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		// Create object of open a File 
		File file = new File("C:\\Users\\Ashwin\\eclipse-workspace\\Selenium\\ExcelDataDriven\\ExcelData.xlsx");
		
		// Create object of FileInputStream to read data from file 
		FileInputStream inputstream = new FileInputStream(file);
		
		// Create object of XSSFworkbook to handle xlsx file
		XSSFWorkbook  workbook = new XSSFWorkbook(inputstream);
		
		// Create object of Excel sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
		
		
		
		
		
		
		String A = sheet.getRow(0).getCell(0).getStringCellValue();
		
		
		// get total row count 
		int ttrows = sheet.getLastRowNum()+1;
		System.out.println(ttrows);
		
		// get total on of cells in row
		int lastsell = sheet.getRow(0).getLastCellNum();
		System.out.println(lastsell);
		
		for (int currentrow = 0 ; currentrow <ttrows; currentrow++)
		{
			// Enter user-name
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(sheet.getRow(currentrow).getCell(0).toString());

			// Enter password
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sheet.getRow(currentrow).getCell(1).toString());

			// Click on submit button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
						
			
		   
			
			for (int currentcell = 0; currentcell<lastsell; currentcell++) {
				System.out.println(sheet.getRow(currentrow).getCell(currentcell).toString());
			}
			System.out.println();	
		}
		
		workbook.close();
		driver.close();
	}

}
