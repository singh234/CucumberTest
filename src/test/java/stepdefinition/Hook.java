package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {
	
	private BaseUtil base;
	
	
	public Hook(BaseUtil base) {
		this.base = base;
	}



	//Implementing Hooks
	//There are only two types of hooks offered by Cucumber - @Before and @After
	
	@Before
	public void launchBrowser(){
		System.out.println("Launching the Browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		base.driver = new ChromeDriver();
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	
	
	@After
	public void tearDown(Scenario scenario){
		System.out.println("Closing Browser");
		if(scenario.isFailed())
			scenario.getName();
		base.driver.quit();
		
	}

}
