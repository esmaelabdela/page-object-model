package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	
	WebDriver driver;
	
	 //Login Data
    String userName = "demo@codefios.com";
    String password = "abc123";
    
	String   dashboardHeaderText =  "Dashboard";
	String   alertUserValidationText =  "Please enter your user name";
	String   alertpaswordValidationText = "Please enter your password";
	
	String   addCustomerHeaderText = "New Customer";
	String   fullName = "Sitra yeshaw";
    String   email = "demo@codefios.com";
	String 	 phoneNumber = "9363548";
	String 	 address = "3551 wilshire Elementary";
	String 	 city = "Richardson";
	String   zipCode = "75082";
	String 	 companyName = "Techfios";
	String   countryName = "United States of America";
	String 	 groupName = "Selenium";   
	
	@Test
    public void userShouldBeAbleToAddNewCustomer() {
	  
	 driver =  BrowserFactory.init(); 
	  
	 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	 loginPage.insertUserName(userName);
	 loginPage.insertPassword(password);
	 loginPage.clickOnSignInButton();
	 
	 DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	 dashboardPage.validateDashboardPage(dashboardHeaderText);
	 dashboardPage.clickOnCustomerMenue();
	 dashboardPage.clickOnaddCustomer();
	 
	 AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
	 addCustomerPage.validateAddCustomerPage(addCustomerHeaderText);
	 addCustomerPage.insertFullName(fullName);
	 addCustomerPage.insertEmail(email);
	 addCustomerPage.selectCompanyName(companyName);
	 
	 
  }
  
  
	
}
