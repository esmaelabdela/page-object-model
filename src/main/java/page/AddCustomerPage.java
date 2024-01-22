package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {

	
   WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElements/Attributes
	
	@FindBy(how = How.XPATH,using = "//strong[contains(text(),'New Customer')]" ) WebElement addCustomerHeaderElement;
	@FindBy(how = How.XPATH,using = "//input[@name='name']") WebElement fullNameElement;
	@FindBy(how = How.XPATH,using = "//select[@name='company_name']") WebElement companyNameElement;
	@FindBy(how = How.XPATH,using = "//input[@name='email']") WebElement emailElement;
	
	
    public void validateAddCustomerPage( String addCustomerHeaderText) {
     validateElement(addCustomerHeaderElement, addCustomerHeaderText ,"Add customer is not available");
     }
	
	public void insertFullName(String fullName) {
		fullNameElement.sendKeys(fullName + generateRandomNum(999));
	}
	public void selectCompanyName(String companyName) {
		selectFromdropDown(companyNameElement, companyName);
	}
	public void insertEmail(String email) {
		emailElement.sendKeys(generateRandomNum(999)+ email);
	}
	
	
	
	
	
}
