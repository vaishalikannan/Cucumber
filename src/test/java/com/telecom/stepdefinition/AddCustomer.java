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

public class AddCustomer {

	public static WebDriver driver;
	
	@Given("User launches telecom applicatiom")
	public void user_launches_telecom_applicatiom() {
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();    
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
	}

	@When("user need to fill up the fields in add customer window")
	public void user_need_to_fill_up_the_fields_in_add_customer_window() {
		driver.findElement(By.xpath("(//label)[1]")).click();
		driver.findElement(By.id("fname")).sendKeys("Vaishali");
		driver.findElement(By.id("lname")).sendKeys("vinoth");
		driver.findElement(By.name("emailid")).sendKeys("vaishalithangamk@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Nil");
		driver.findElement(By.name("telephoneno")).sendKeys("1234556789");
	}

	@When("user click on submit button in add customer window")
	public void user_click_on_submit_button_in_add_customer_window() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
	}
	@When("user need to fill up the fields in add customer window by one dim list")
	public void user_need_to_fill_up_the_fields_in_add_customer_window_by_one_dim_list(DataTable dataTable) {
		
		List<String> datas = dataTable.asList(String.class);
		driver.findElement(By.xpath("(//label)[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(0));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1));
		driver.findElement(By.name("emailid")).sendKeys(datas.get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(3));
		driver.findElement(By.name("telephoneno")).sendKeys(datas.get(4));
	   
	}

	@When("user need to fill up the fields in add customer window by one dim Map")
	public void user_need_to_fill_up_the_fields_in_add_customer_window_by_one_dim_Map(DataTable dataTable) {
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("(//label)[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
		driver.findElement(By.name("emailid")).sendKeys(datas.get("email"));
		driver.findElement(By.name("addr")).sendKeys(datas.get("address"));
		driver.findElement(By.name("telephoneno")).sendKeys(datas.get("phno"));
	    
	}
	@When("user need to fill up the fields in add customer window by two dim list")
	public void user_need_to_fill_up_the_fields_in_add_customer_window_by_two_dim_list(DataTable dataTable) 
	{
		
		List<List<String>> datas = dataTable.asLists(String.class);
		driver.findElement(By.xpath("(//label)[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(2).get(0));
		driver.findElement(By.id("lname")).sendKeys(datas.get(2).get(1));
		driver.findElement(By.name("emailid")).sendKeys(datas.get(2).get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(2).get(3));
		driver.findElement(By.name("telephoneno")).sendKeys(datas.get(2).get(4));
}
	@When("user need to fill up the fields in add customer window by two dim Map")
	public void user_need_to_fill_up_the_fields_in_add_customer_window_by_two_dim_Map(DataTable dataTable) {
		List<Map<String, String>> datas = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.xpath("(//label)[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(1).get("FirstName"));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1).get("LastName"));
		driver.findElement(By.name("emailid")).sendKeys(datas.get(1).get("MailID"));
		driver.findElement(By.name("addr")).sendKeys(datas.get(1).get("Add"));
		driver.findElement(By.name("telephoneno")).sendKeys(datas.get(1).get("Phno"));
	}
}
