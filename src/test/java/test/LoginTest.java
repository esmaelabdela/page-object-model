package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

  WebDriver driver;	
	
 //Login Data
    String userName = "demo@codefios.com";
    String password = "abc123";
    
	String dashboardHeaderValidationText =  "Dashboard";
	String alertUserValidationText =  "Please enter your user name";
	String alertpaswordValidationText = "Please enter your password";
	 
 
	@Test
    public void validUserShoudBeAbleToLogin()	{
	 
	 driver = BrowserFactory.init();
	 
	// LoginPage loginPage1 = new LoginPage(driver); // we don't use this code for POM design.
	 
	 LoginPage loginPage2 = PageFactory.initElements(driver, LoginPage.class);
	 loginPage2.insertUserName(userName);
	 loginPage2.insertPassword(password);
	 loginPage2.clickOnSignInButton();
	 
	 DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	 dashboardPage.validateDashboardPage(dashboardHeaderValidationText);
//	 BrowserFactory.tearDown();
   }
 
	
	
}
