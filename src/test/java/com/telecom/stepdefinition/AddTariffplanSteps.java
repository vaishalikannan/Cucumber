package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTariffplanSteps {
	
	public static WebDriver driver;
	
	@Given("user launches telecom application")
	public void user_launches_telecom_application() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();    
	}

	@Given("user click on add tariff pan button")
	public void user_click_on_add_tariff_pan_button()
	{
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
		driver.findElement(By.id("rental1")).sendKeys("5000");
	    driver.findElement(By.name("local_minutes")).sendKeys("10");
	    driver.findElement(By.name("inter_minutes")).sendKeys("5");
	    driver.findElement(By.name("sms_pack")).sendKeys("100");
	    driver.findElement(By.name("minutes_charges")).sendKeys("1");
	    driver.findElement(By.name("inter_charges")).sendKeys("2");
	    driver.findElement(By.name("sms_charges")).sendKeys("2");
	    
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("user verify tariff plan is generated")
	public void user_verify_tariff_plan_is_generated() {
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}

}
