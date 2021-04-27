package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
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
	@When("user need to fill up the fields  by one dim list")
	public void user_need_to_fill_up_the_fields_by_one_dim_list(DataTable dataTable) {
		
		List<String> datas = dataTable.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(datas.get(0));
	    driver.findElement(By.name("local_minutes")).sendKeys(datas.get(1));
	    driver.findElement(By.name("inter_minutes")).sendKeys(datas.get(2));
	    driver.findElement(By.name("sms_pack")).sendKeys(datas.get(3));
	    driver.findElement(By.name("minutes_charges")).sendKeys(datas.get(4));
	    driver.findElement(By.name("inter_charges")).sendKeys(datas.get(5));
	    driver.findElement(By.name("sms_charges")).sendKeys(datas.get(6));
	   
	}

	@When("user need to fill up the fields  by one dim Map")
	public void user_need_to_fill_up_the_fields_by_one_dim_Map(DataTable dataTable) {
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(datas.get("R"));
	    driver.findElement(By.name("local_minutes")).sendKeys(datas.get("LM"));
	    driver.findElement(By.name("inter_minutes")).sendKeys(datas.get("IM"));
	    driver.findElement(By.name("sms_pack")).sendKeys(datas.get("SP"));
	    driver.findElement(By.name("minutes_charges")).sendKeys(datas.get("LC"));
	    driver.findElement(By.name("inter_charges")).sendKeys(datas.get("IC"));
	    driver.findElement(By.name("sms_charges")).sendKeys(datas.get("SC"));
	    
	}
	@When("user need to fill up the fields by two dim list")
	public void user_need_to_fill_up_the_fields_by_two_dim_list(DataTable dataTable) 
	{
		
		List<List<String>> datas = dataTable.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(datas.get(2).get(0));
	    driver.findElement(By.name("local_minutes")).sendKeys(datas.get(2).get(1));
	    driver.findElement(By.name("inter_minutes")).sendKeys(datas.get(2).get(2));
	    driver.findElement(By.name("sms_pack")).sendKeys(datas.get(2).get(3));
	    driver.findElement(By.name("minutes_charges")).sendKeys(datas.get(2).get(4));
	    driver.findElement(By.name("inter_charges")).sendKeys(datas.get(2).get(5));
	    driver.findElement(By.name("sms_charges")).sendKeys(datas.get(2).get(6));
}
	@When("user need to fill up the fields  by two dim Map")
	public void user_need_to_fill_up_the_fields_by_two_dim_Map(DataTable dataTable) {
		List<Map<String, String>> datas = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(datas.get(1).get("R"));
	    driver.findElement(By.name("local_minutes")).sendKeys(datas.get(1).get("LM"));
	    driver.findElement(By.name("inter_minutes")).sendKeys(datas.get(1).get("IM"));
	    driver.findElement(By.name("sms_pack")).sendKeys(datas.get(1).get("SP"));
	    driver.findElement(By.name("minutes_charges")).sendKeys(datas.get(1).get("LC"));
	    driver.findElement(By.name("inter_charges")).sendKeys(datas.get(1).get("IC"));
	    driver.findElement(By.name("sms_charges")).sendKeys(datas.get(1).get("SC"));
	}

}
