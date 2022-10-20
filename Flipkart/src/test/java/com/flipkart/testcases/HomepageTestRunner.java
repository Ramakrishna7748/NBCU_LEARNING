package com.flipkart.testcases;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/resources/Feature/Homepage.feature",
glue= {"com.flipkart.testcases"},
monochrome = true)
public class HomepageTestRunner extends AbstractTestNGCucumberTests
{
    
}
