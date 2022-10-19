package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage
{
    
    private static final WebDriver driver = null;



   public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    
    
    @FindBy(name = "q")
    WebElement SearchTextBox;



   @FindBy(xpath="//button[@type='submit']")
    WebElement Clickonsearch;
    
    @FindBy(xpath="//div[text()='Top Offers']")
    WebElement Topoffers;
    
    @FindBy(xpath="(//div[@class='xtXmba'])[2]")
    WebElement Grocery;
    
    @FindBy(xpath="(//div[@class='xtXmba'])[3]")
    WebElement Mobiles;
    
    @FindBy(xpath="(//div[@class='xtXmba'])[4]")
    WebElement FashionTab;
    
    @FindBy(xpath="(//div[@class='xtXmba'])[5]")
    WebElement ElectronicsTab;
    
    @FindBy(xpath="(//div[@class='xtXmba'])[6]")
    WebElement Home;
    
    @FindBy(xpath="(//div[@class='xtXmba'])[7]")
    WebElement Appliances;
    
    @FindBy(xpath="(//div[@class='xtXmba'])[8]")
    WebElement TravelTab;
    
    @FindBy(xpath="(//div[@class='xtXmba'])[9]")
    WebElement Beauty_Toys;
    
    @FindBy(xpath="(//div[@class='xtXmba'])[10]")
    WebElement Two_wheelers;
    
    
    
    public void searchbar(String searchelement) {
        SearchTextBox.sendKeys(searchelement);
    }
    
    public void clickonsearch(){
    Clickonsearch.click();
    }
    
    public void topoffers(){
        Topoffers.click();
    }
    
    public void grocery(){
        Grocery.click();
    }
    
    public void mobiles(){
        Mobiles.click();
    }
    
    public void fashionTab(){
        Actions A=new Actions(driver);
        A.moveToElement(FashionTab).perform();
    }
    
    public void electronics(){
        Actions A=new Actions(driver);
        A.moveToElement(ElectronicsTab).perform();
    }
    
    public void home(){
        Actions A=new Actions(driver);
        A.moveToElement(Home).perform();
    }
    
    public void appliances(){
        Appliances.click();
    }
    
    public void travelTab(){
        TravelTab.click();
    }
    
    public void beauty_Toys(){
        Actions A=new Actions(driver);
        A.moveToElement(Beauty_Toys).perform();
    }
    
    public void two_wheelers(){
        Two_wheelers.click();
    }
    
    
}