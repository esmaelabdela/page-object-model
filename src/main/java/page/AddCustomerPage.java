package page;

import org.openqa.selenium.By;
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
	@FindBy(how = How.XPATH,using = "//input[@id='phone']") WebElement phoneElement;
	@FindBy(how = How.XPATH,using = "//input[@name='address']") WebElement addressElement;
	@FindBy(how = How.XPATH,using = "//input[@name='city']") WebElement cityElement;
	@FindBy(how = How.XPATH,using = "//input[@id='port']") WebElement zipCodeElement;
	@FindBy(how = How.XPATH,using = "//select[@name='country']") WebElement countryNameElement;
	@FindBy(how = How.XPATH,using = "//select[@id='customer_group']") WebElement groupNameNameElement;
	@FindBy(how = How.XPATH,using = "//button[@id='save_btn']") WebElement saveButtonElement;
	
	
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
	public void insertPhone(String phone) {
		phoneElement.sendKeys(generateRandomNum(999)+ phone);
	}
	public void insertAddress(String address) {
		addressElement.sendKeys(address);
	}
	public void insertCity(String city) {
		cityElement.sendKeys(city);
	}
	public void insertZipCode(String zipCode) {
		zipCodeElement.sendKeys(zipCode);
	}
	public void insertCountryName(String countryName) {
		countryNameElement.sendKeys(countryName);
	}
	public void insertGroupName(String groupName) {
		groupNameNameElement.sendKeys(groupName);
	}
	public void clickSaveButton() {
		saveButtonElement.click();
	}
	
	
	
	
	
}
