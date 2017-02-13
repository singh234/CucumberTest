package stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.Login;


public class TestSteps_Udemylogin {
	
	private BaseUtil base;

	
	public TestSteps_Udemylogin(BaseUtil base) {
		this.base = base;
	}
	

	@Given("^I am on Udemy hompage$")
	public void i_am_on_Udemy_hompage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String base_URL = "https://www.udemy.com/";
		base.driver.get(base_URL);
		
	}

	@Given("^I click on login$")
	public void i_click_on_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // base.driver.findElement(By.linkText("Login")).click();
		Login loginPageClass = new Login(base.driver);
		loginPageClass.clickLogin();
	}

	@When("^I enter following details$")
	public void i_enter_following_details(DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		Login loginPageClass = new Login(base.driver);
		List<user> Users = new ArrayList<user>();
		Users = table.asList(user.class);
		
		for(user user : Users){
			
			//base.driver.findElement(By.id("id_email")).sendKeys(user.userName);
			//base.driver.findElement(By.id("id_password")).sendKeys(user.passWord);
			loginPageClass.LoginModule(user.userName, user.passWord);
			
		}
		
		
	   
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//base.driver.findElement(By.name("submit")).submit();
		Login loginPageClass = new Login(base.driver);
		loginPageClass.clickSubmit();
	    
	}

	@Then("^I should find My Courses Link$")
	public void i_should_find_My_Courses_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("My Courses", base.driver.findElement(By.linkText("My Courses")).getText());
	    
	}
	
	@Then("^I should find My Courses Link not appearing$")
	public void i_should_find_My_Courses_Link_not_appearing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Abcdhefg", base.driver.findElement(By.linkText("My Courses")).getText());
	}

	
	public class user{
		public String userName;
		public String passWord;
		public user(String UserName, String PassWord) {
			
			userName = UserName;
			passWord = PassWord;
		}
		
		
	}


}
