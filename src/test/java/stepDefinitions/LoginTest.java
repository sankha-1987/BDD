package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	WebDriver driver;
	
	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("Load the URL")
	public void load_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	 driver.get("https://www.saucedemo.com/");
	}
	
	@When("Login Page is displayed enter username and password")
	public void login_page_is_displayed_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	@When("Click on Login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.id("login-button")).click();
	}
	
	@Then("Check if Home Page is displayed")
	public void check_if_home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  String pageURL = driver.getCurrentUrl();
	  Assert.assertTrue(pageURL.contains("inventory"));
	  System.out.println("Execution successful");	
	}
	
	
	
}