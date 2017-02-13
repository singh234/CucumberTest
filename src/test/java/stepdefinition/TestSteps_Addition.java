package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps_Addition {
	private int a;
	private int b;
	private int Sum;

	@Given("^User provides number a and number b$")
	public void user_provides_number_a_and_number_b()  {
	    // Write code here that turns the phrase above into concrete actions
		a = 5;
		b = 6;
	}

	@When("^Sum of a and b should be performed$")
	public void sum_of_a_and_b_should_be_performed()  {
	    // Write code here that turns the phrase above into concrete actions
	   Sum = a+b;
	}

	@Then("^User should see the result$")
	public void user_should_see_the_result()  {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(Sum);
	}

}
