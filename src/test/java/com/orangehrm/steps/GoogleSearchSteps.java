package com.orangehrm.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangehrm.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchSteps extends CommonMethods {
	
	static WebDriver driver;
	
	@Given("I navigated to the Google")
	public void i_navigated_to_the_Google() {
		System.setProperty("webdriver.chrome.driver", "/Users/farrah/eclipse-workspace/OrangeHrmFramework/src/test/resources/drivers/chromedriver");
	    driver = new ChromeDriver();
		driver.get("https://google.com");    
	}

	@When("I type search item")
	public void i_type_search_item() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPhone");    
	}

	@When("I click on Google Search button")
	public void i_click_on_Google_Search_button() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);    
	}

	@Then("I see search results are displayed")
	public void i_see_search_results_are_displayed() {
    WebElement searchResult= driver.findElement(By.cssSelector("div#resultStats"));  
    boolean result = searchResult.isDisplayed();
    Assert.assertEquals(true, result);
    driver.close();
   

	}}