package com.flipkart.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageTestCases extends TestBase {
	WebDriver driver;
//	HomePage homepage;
//	
//	public HomepageTestCases() {
//		super();
//	}
//	
	@Test
    @Given("^user is able to enter the username and password$")
    public void user_is_able_to_enter_the_username_and_passwprd() {

	    	LoginPage loginpage=new LoginPage(driver);
	        
	    	loginpage.username("709021434");
	        System.out.println("user is able to enter the username");
	    	loginpage=new LoginPage(driver);
	    	loginpage.password("Shubh@m28");
	        System.out.println("user is able to enter the password");
	    }
	    
	
	
    
    @Test
    @When("user click on login page")
    public void user_click_on_login_page()
    {
    	LoginPage loginpage=new LoginPage(driver);
    	loginpage.loginclick();
        System.out.println("user is click on login page");
    }



   @Test
    @And("user is on home page and verify the title")
    public void user_is_on_home_page() {
        System.out.println("user is on home page");
        
    }



   @Test
    @When("user click on To offers")
    public void user_click_on_to_offers() {
        
        HomePage homepage=new HomePage(driver);
        homepage.topoffers();
    }
    
    @Test
    @Then("user is on offeers page")
    public void user_is_in_to_offeers_page() {
        System.out.println("user is on offeers page");
    }
}
