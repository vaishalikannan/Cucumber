package org.task;





import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestJunit {

	public static WebDriver driver;

	@ BeforeClass
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinoth\\Desktop\\Vinoth\\Seleniumproject\\driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://facebook.com/");

	}


	@ AfterClass
	public static void quit()

	{
		driver.quit();

	}


	@After
	public  void end() 
	{
		Date d = new Date ();
		System.out.println(d);
	}

	@Before
	public  void start() 
	{
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void test() {


		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Lokesh");
	}

	@Test
	public void test1() {
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456789");


	}
}