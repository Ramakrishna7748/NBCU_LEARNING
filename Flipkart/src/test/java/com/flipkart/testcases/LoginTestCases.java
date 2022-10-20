package com.flipkart.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;
//import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTestCases extends TestBase {


    WebDriver driver;
   // LoginPage loginpage;
   // LoginPage loginpage=new LoginPage(driver);
//    public LoginTestCases() {
//    	super();
//    }
    
    
    @Before
    @Given("^Open the browser & Launch the Flipkart Application$")
	public void beforeTest()
    {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.flipkart.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
          initialization();
    }
    
    @Test
	@When("^user is able to enter the username$")
    public void user_is_able_to_enter_the_username()
    {
    	LoginPage loginpage=new LoginPage(driver);
        
    	loginpage.username("7090214343");
        System.out.println("user is able to enter the username");
    }
    
    @Test
	@And ("^user is able to enter the password$")
    public void user_is_able_to_enter_the_password()
    {
    	LoginPage loginpage=new LoginPage(driver);
    	loginpage.password("Shubh@m28");
        System.out.println("user is able to enter the password");
    }
    
    @Test
	@Then ("^user is click on login page$")
    public void user_is_click_on_login_page()
    {
    	LoginPage loginpage=new LoginPage(driver);
    	loginpage.loginclick();
        System.out.println("user is click on login page");
    }
    @Test
    
    public void user_test()
    {
    	System.out.println("Test works");
    }
    @After
	public void after() throws IOException
    {
    	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);        
        String homeDir = System.getProperty("user.dir");        
        FileUtils.copyFile(scrFile, new File(homeDir + "/screenshots/" +System.currentTimeMillis() + ".png"));
           
        
    }
    
    
    }

