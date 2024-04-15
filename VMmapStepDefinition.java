package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VMmapStepDefinition {
	WebDriver driver;
	
	@Given("user Launch the VMmaps web application")
	public void userLaunchTheVMmapsWebApplication() {
		driver.get("https://accounts.vmmaps.com/");
	    driver.manage().window().maximize();
	}

	@When("user enter valid EmailId and password")
	public void userEnterValidEmailIdAndPassword() {
		driver.findElement(By.id("login-email")).sendKeys("akaravinthkrish07@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Aravinth@123");
	   	}
	
	@When("click on login button")
	public void clickOnLoginButton1() {
		 driver.findElement(By.id("loginSubmit")).click();
	}

	@Then("verify user able to view the VMmaps Home page")
	public void verifyUserAbleToViewTheVMmapsHomePage() {
	    System.out.println("Home page should be displayed");
	}

	@When("user enter valid {string} and valid {string}")
	public void userEnterValidAndValid(String string, String string2) {
		driver.findElement(By.id("login-email")).sendKeys(string);
		driver.findElement(By.id("login-password")).sendKeys(string2);
	   	}

	@When("click on login button")
	public void clickOnLoginButton() {
	    driver.findElement(By.id("loginSubmit")).click();
	}

	@Then("user able to view the error message")
	public void userAbleToViewTheErrorMessage() {
	    System.out.println("Error Message should be displayed");
	}






}
