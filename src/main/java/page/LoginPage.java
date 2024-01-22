package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElements/Attributes
	@FindBy(how = How.XPATH, using = "//input[@id='user_name']" )   WebElement  UserNameElement;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")     WebElement  passwordElement;
	@FindBy(how = How.XPATH, using= "//button[@id='login_submit']") WebElement  signinButtonElement;
	
	
	//InteractableMethodes
	public void insertUserName(String userName) {
	    UserNameElement.sendKeys(userName);
	}
	public void insertPassword(String password) {
		passwordElement.sendKeys(password);
	}
	public void clickOnSignInButton() {
		signinButtonElement.click();
	}
	
    //combining Method
	public void performLogin(String userName,String password) {
	    UserNameElement.sendKeys(userName);
	    passwordElement.sendKeys(password);
	    signinButtonElement.click();
	} 
	    
	    
	    
	    
}
