package stepdefinition;

import java.util.ArrayList;
import java.util.List;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps_Bmrcalculator extends BaseUtil {
	
	private BaseUtil base;
	
	
	public TestSteps_Bmrcalculator(BaseUtil base) {
		this.base = base;
	}

	@Given("^I am on home page of Calculator\\.net$")
	public void i_am_on_home_page_of_Calculator_net()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I navigate to Weight Loss Page$")
	public void i_navigate_to_Weight_Loss_Page()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I click on BMR Calculator$")
	public void i_click_on_BMR_Calculator()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I provide following details$")
	public void i_provide_following_details(DataTable table)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		/*List<List<String>> data = table.raw();
		
		System.out.println(data.get(1).get(0).toString());
		System.out.println(data.get(1).get(1).toString());
		System.out.println(data.get(1).get(2).toString());
		System.out.println(data.get(1).get(3).toString())*/;
		
		//Create an Array List
		List<User> users = new ArrayList<User>();
		
		users = table.asList(User.class);
		
		for(User user: users){
			System.out.println(user.age);
			System.out.println(user.feet);
			System.out.println(user.inches);
			System.out.println(user.weight);
		}
		
	    
	}
	
	@When("^I provide \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" details$")
	public void i_provide_and_and_and_details(String age, String feet, String inches, String weight) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(age);
		System.out.println(feet);
		System.out.println(inches);
		System.out.println(weight);
	    
	}

	@When("^I Select Female$")
	public void i_Select_Female()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I click on Calculate Button$")
	public void i_click_on_Calculate_Button()  {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^I should see the BMR Index$")
	public void i_should_see_the_BMR_Index()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	



 public class User {
	 
	 public String age;
	 public String feet;
	 public String inches;
	 public String weight;
	 
	 public User(String Age,String Feet,String Inches,String Weight){
		 
		age = Age;
		feet = Feet;
		inches = Inches;
		weight = Weight;
		 
	 }
	 
	 
 }
 
}
