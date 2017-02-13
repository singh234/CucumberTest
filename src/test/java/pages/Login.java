package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	
	
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = ".//a[contains(text(),'Login')]")
	public WebElement loginLink;
	
	public void clickLogin(){
		loginLink.click();
	}
	
	@FindBy(how = How.ID,using = "id_email")
	public WebElement userId;
	
	@FindBy(how = How.ID,using ="id_password")
	public WebElement userName;
	
	public void LoginModule(String UserName,String UserId){
		
		userId.sendKeys(UserName);
		userName.sendKeys(UserId);
		
	}
	
	@FindBy(how = How.NAME, using = "submit")
	public WebElement submitButton;
	
	public void clickSubmit(){
		submitButton.submit();
	}

}
