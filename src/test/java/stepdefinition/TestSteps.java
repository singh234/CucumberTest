package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	static WebDriver driver;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()  {
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		String baseURL = "http://www.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password()  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		signupLink.click();
		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		WebElement useridInput = driver.findElement(By.xpath(".//div[@id='memberLoginDialogemail']//input"));
		useridInput.sendKeys("test@email.com");
		WebElement useridPassword = driver.findElement(By.xpath(".//div[@id='memberLoginDialogpassword']//input"));
		useridPassword.sendKeys("abcabc");
	}

	@When("^Clicks on Go Button$")
	public void clicks_on_Go_Button() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loginButton = driver.findElement(By.id("memberLoginDialogoklink"));
		loginButton.click();
		
		Thread.sleep(3000);
	}

	@Then("^He can visit the Practice Page$")
	public void he_can_visit_the_Practice_Page()  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement practiceLink = driver.findElement(By.id("DrpDwnMn06bg"));
		practiceLink.click();
	}

	@Then("^Message is displayed$")
	public void message_is_displayed()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successful");
	}

}
