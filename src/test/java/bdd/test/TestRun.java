package bdd.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = {"src/test/java/feature/udemylogin.feature"},
		format = {"json:target/cucumber.json","html:target/cucumber-html-report" },
		glue = {"stepdefinition"}
				)
public class TestRun  extends AbstractTestNGCucumberTests{

}
