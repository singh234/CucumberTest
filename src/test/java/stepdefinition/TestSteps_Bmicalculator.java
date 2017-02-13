package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TestSteps_Bmicalculator {
	
	private WebDriver driver;
	
	@Given("^I am on Home Page of Calculator\\.net$")
	public void i_am_on_Home_Page_of_Calculator_net()  {
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		String base_URL = "http://www.calculator.net";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(base_URL);
	}

	@Given("^I click on BMI Calculator under Weight Loss Calculators$")
	public void i_click_on_BMI_Calculator_under_Weight_Loss_Calculators()  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement bmiLink = driver.findElement(By.cssSelector("a[href='/bmi-calculator.html']"));
		bmiLink.click();
	}

	@When("^I enter Age as \"([^\"]*)\"$")
	public void i_enter_Age_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		arg1 = "24";
		WebElement agePerson = driver.findElement(By.id("cage"));
		agePerson.clear();
		agePerson.sendKeys(arg1);
	}

	@When("^I select Gender as female$")
	public void i_select_Gender_as_female()  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement femalePerson = driver.findElement(By.id("csex2"));
		femalePerson.click();
	}

	@When("^I enter Height as Feet as \"([^\"]*)\" and Inches as \"([^\"]*)\"$")
	public void i_enter_Height_as_Feet_as_and_Inches_as(String arg1, String arg2)  {
	    // Write code here that turns the phrase above into concrete actions
		//arg1 = "5";
		//arg2 = "10";
		WebElement hgtFeet = driver.findElement(By.id("cheightfeet"));
		hgtFeet.clear();
		hgtFeet.sendKeys(arg1);
		
		WebElement hgtInch = driver.findElement(By.id("cheightinch"));
		hgtInch.clear();
		hgtInch.sendKeys(arg2);
	}

	@When("^I enter Wieght as \"([^\"]*)\"$")
	public void i_enter_Wieght_as(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		//arg1 = "150";
		WebElement weightPerson = driver.findElement(By.id("cpound"));
		weightPerson.clear();
		weightPerson.sendKeys(arg1);
	}

	@When("^I click on Calculate button$")
	public void i_click_on_Calculate_button()  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement calculateButton = driver.findElement(By.xpath(".//input[@value='Calculate']"));
		calculateButton.click();
	}

	@Then("^Result should be Normal$")
	public void result_should_be_Normal()  {
	    // Write code here that turns the phrase above into concrete actions
		String result = driver.findElement(By.xpath("(.//*[@id='content']//b)[2]")).getText();
		System.out.println("Result: "+result);
		if(result.equals("Normal")){
			System.out.println("First Validation is Passed");
		}
		
		else
		{
			System.out.println("First Validation is failed");
		}
	}

	@Then("^The color of the result should be Green$")
	public void the_color_of_the_result_should_be_Green()  {
	    // Write code here that turns the phrase above into concrete actions
		String color = driver.findElement(By.xpath("(.//*[@id='content']//b)[2]")).getCssValue("color");
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");
		 
		int hexValue1=Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2=Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3=Integer.parseInt(hexValue[2]);
		 
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println(actualColor);
		Assert.assertEquals("#008000", actualColor);
	}
	

}
