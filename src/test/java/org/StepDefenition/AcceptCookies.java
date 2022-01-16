package org.StepDefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AcceptCookies {
	WebDriver driver;
	
	
	@When("User is on the Login Page")
	public void user_is_on_the_Login_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.asos.com/");
		driver.manage().timeouts().implicitlyWait(06, TimeUnit.SECONDS);
	
	}

	@When("User Should Accept or Decline all the Cookies")
	public void user_Should_Accept_or_Decline_all_the_Cookies() {
	
	}

	@Then("User is Ready to Use the Functionalites.")
	public void user_is_Ready_to_Use_the_Functionalites() {
	
	
	
	}
}
