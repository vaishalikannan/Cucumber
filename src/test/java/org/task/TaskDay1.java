package org.task;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TaskDay1{

	public static void main(String[] args) throws InterruptedException, IOException,Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinoth\\Desktop\\Vinoth\\Seleniumproject\\driver\\chromedriver.exe");
		WebDriver driver  =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input)")).sendKeys("redmi phones");
		driver.findElement(By.className("_34RNph")).click();
		Thread.sleep(2000);

		driver.close();

		File f = new File("C:\\Users\\Vinoth\\Desktop\\Vinoth\\TestID\\target\\Redmi.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Phones");

		String[][] completedata ={{"1","Redmi 9 Prime (Space Blue, 64 GB)"},{"2","Redmi 9 Prime (Mint Green, 64 GB)(4 GB RAM)"},{"3","Redmi 9 Prime (Matte Black, 64 GB)  (4 GB RAM)"},{"4","Redmi 9 Prime (Sunrise Flare, 64 GB)  (4 GB RAM)"},{"5","Redmi 8A Dual (Midnight Grey, 32 GB)  (2 GB RAM)"},{"6","Redmi 8A Dual (Sky White, 32 GB)  (2 GB RAM)"},{"7","Redmi 9 (Carbon Black, 64 GB)  (4 GB RAM)"},{"8","Redmi Note 9 (Aqua Green, 64 GB)  (4 GB RAM)"},{"9","REDMI Note 9 Pro Max (Champagne Gold, 64 GB)  (6 GB RAM)"},{"10","REDMI 9 (CarbonBlack, 128 GB)  (4 GB RAM)"},{"11","REDMI Note 9 Pro Max (Interstellar Black, 64 GB)  (6 GB RAM)"},{"12","REDMI 9i (Sea Blue, 64 GB)  (4 GB RAM)"},{"13","REDMI 9i (Nature Green, 64 GB)  (4 GB RAM)"},{"14","Redmi Note 9 (Arctic White, 128 GB)  (4 GB RAM)"},{"15","Redmi 9 (Sky Blue, 64 GB)  (4 GB RAM)"},{"16","Redmi Note 9 (Shadow Black, 128 GB)  (4 GB RAM)"},{"17","Redmi 9A (Nature Green, 32 GB)  (3 GB RAM)"},{"18","Redmi 9A (Midnight Black, 32 GB)  (2 GB RAM)"},{"19","Redmi 9A (Nature Green, 32 GB)  (2 GB RAM)"},{"20","Redmi 9A (SeaBlue, 32 GB)  (2 GB RAM)"},{"21","REDMI 9i (Midnight Black, 64 GB)  (4 GB RAM)"},{"22","REDMI 9 Power (Blazing Blue, 64 GB)  (4 GB RAM)"},{"23","REDMI 9 Power (Electric Green, 64 GB)  (4 GB RAM)"},};
		int rowcount =0;
		for (String[] onenyonearray : completedata) //[array[0],array[1],array[2]]
		{
			Row row = s.createRow(rowcount++);

			int columncount=0;
			for (String string : onenyonearray) {
				System.out.println(string);
				Cell cell = row.createCell(columncount++);

				cell.setCellValue(string);
			}
			FileOutputStream o = new FileOutputStream(f);
			w.write(o);
			o.close();
			
		}		
	}
}


