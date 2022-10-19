package pizzahutCouponTest;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
public class CouponTest {

	WebDriver driver;
	public String verificationError = "";

			@BeforeMethod (alwaysRun = true)
			public void beforeTest() {
				//System.setProperty("webdriver.chrome.driver","/Users/pooja/Desktop/NBCU Sessions/chromedriver");
				driver = new ChromeDriver();
				driver.get("https://www.pizzahut.co.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

				//It will select the loaction 
				driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/img")).click();
			}


			@Test (priority=4,groups = "positive",alwaysRun = true)
			public void Validate_Coupon_equals_500(){
				try {

					//local variable
					String actual = "Voucher applied! Rs. 125 Off on bill value above Rs.500.";

					//It will click on pizzas tab
					driver.findElement(By.xpath("(//span[text()='Pizzas'])[2]")).click();

					//It will select the pizza of Rs.529 and add it to the cart
					driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div[1]/a[2]/div[3]/div/button/span[1]/span")).click();

					//It will click on apply coupon link
					driver.findElement(By.xpath("//span[text()='Apply Voucher code or Gift Card']")).click();

					//Applying the coupon code
					driver.findElement(By.cssSelector("input[name='voucherId']")).sendKeys("HUT125");

					//click on Reedem button
					driver.findElement(By.xpath("//span[text()='Redeem']")).click();

					//Additional box of discount activated message
					driver.findElement(By.xpath("//span[text()='OK']")).click();

					//Final validation coupon code 500

					if (driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/div/div/div[1]")).getText().equals(actual)) {
						System.out.println("User is successfully able to apply the voucher for purchasing the pizza equals to Rs.500");
					} else {
						System.out.println("User is not able to apply the coupon");
						verificationError = "Not able to apply";
					}  

				}catch (Exception e) {
					verificationError = e.getMessage();
				}




			}

			@Test (priority=3,groups = "positive",alwaysRun = true)
			public void Validate_Coupon_More_Than_500(){
				try {
					//local variable
					String actual = "Voucher applied! Rs. 125 Off on bill value above Rs.500.";


					//It will click on pizzas tab
					driver.findElement(By.xpath("(//span[text()='Pizzas'])[2]")).click();

					//Clicked on product which is more than 500
					driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div[1]/a[8]/div[3]/div/button/span[1]")).click();

					//It will click on apply coupon link
					driver.findElement(By.xpath("//span[text()='Apply Voucher code or Gift Card']")).click();

					//Applying the coupon code
					driver.findElement(By.cssSelector("input[name='voucherId']")).sendKeys("HUT125");

					//click on Reedem button
					driver.findElement(By.xpath("//span[text()='Redeem']")).click();

					//Additional box of discount activated message
					driver.findElement(By.xpath("//span[text()='OK']")).click();


					//Final validation coupon code greater than Rs.500

					if (driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/div/div/div[1]")).getText().equals(actual)) {
						System.out.println("User is successfully able to apply the voucher for purchasing the pizza greater than Rs.500");
					} else {
						System.out.println("User is not able to apply the coupon");
						verificationError = "Not able to apply";
					}  

				}catch (Exception e) {
					verificationError = e.getMessage();
				}




			}

			@Test (priority=2,groups = "negative",alwaysRun = true)
			public void Validate_Coupon_Less_Than_500(){
				try {
					//local variable
					String actual = "Voucher applied! Rs. 125 Off on bill value above Rs.500. Spend ₹421 more to qualify.";


					//It will click on pizzas tab
					driver.findElement(By.xpath("(//span[text()='Pizzas'])[2]")).click();

					//Clicked on product which is less than 500
					driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div[2]/a[1]/div[3]/div/button/span[1]")).click();

					//It will click on apply coupon link
					driver.findElement(By.xpath("//span[text()='Apply Voucher code or Gift Card']")).click();

					//Applying the coupon code
					driver.findElement(By.cssSelector("input[name='voucherId']")).sendKeys("HUT125");

					//click on Reedem button
					driver.findElement(By.xpath("//span[text()='Redeem']")).click();

					//Additional box of discount activated message
					driver.findElement(By.xpath("//span[text()='OK']")).click();


					//Final validation coupon code less than Rs.500



					if (driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/div/div/div[1]")).getText().equals(actual)) {
						System.out.println("User is not able to apply the coupon for less than Rs.500");
					} else {
						System.out.println("User is able to apply the coupon");
						verificationError = "Able to apply";
					}  

				}catch (Exception e) {
					verificationError = e.getMessage();
				}




			}

			@Test (priority=1,groups = "negative",alwaysRun = true)
			public void Validate_Coupon_For_Existing_Deals(){
				try {
					//driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/img")).click();
					//local variable
					String actual = "Spend ₹500 to qualify.";


					//It will click on Deals tab
					driver.findElement(By.xpath("//div[@class='sc-fznXWL bXIxer']//a[1]//div")).click();

					//Clicked on customize the deal of Rs.279
					//driver.findElement(By.xpath("//div[@class='sc-fznXWL bXIxer']//a[1]")).click();

					//Clicked on choose your pizza tab
					driver.findElement(By.xpath("//*[@id=\"DealWizardScrollContainer\"]/div[3]/div/div[1]/div/div/div[2]")).click();

					//Add margherita pizza
					driver.findElement(By.xpath("//*[@id=\"DealWizardScrollContainer\"]/div[3]/div/div[1]/div[2]/div/span/div[1]/a[1]/div[3]/div/button")).click();

					//Clicked on second choose your pizza tab
					driver.findElement(By.xpath("//*[@id=\"DealWizardScrollContainer\"]/div[3]/div/div[2]/div/div/div[2]")).click();

					//Add Corn and Cheeze pizza
					driver.findElement(By.xpath("//*[@id=\"DealWizardScrollContainer\"]/div[3]/div/div[2]/div[2]/div/span/div[2]/a[1]/div[3]/div/button/span[1]")).click();

					//Click on Add to basket 
					driver.findElement(By.xpath("//span[text()='Add deal to basket']")).click();

					//It will click on apply coupon link
					driver.findElement(By.xpath("//span[text()='Apply Voucher code or Gift Card']")).click();

					//Applying the coupon code
					driver.findElement(By.cssSelector("input[name='voucherId']")).sendKeys("HUT125");

					//click on Reedem button
					driver.findElement(By.xpath("//span[text()='Redeem']")).click();

					//Additional box of discount activated message
					driver.findElement(By.xpath("//span[text()='OK']")).click();


					//Final validation coupon code with existing deals


					if (driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/div/div/div[1]/div[3]/span")).getText().equals(actual)) {
						System.out.println("User is not able to apply coupon code on existing deals");
					} else {
						System.out.println("User is able to apply the coupon");
						verificationError = "Able to apply";
					}  

				}catch (Exception e) {
					verificationError = e.getMessage();
				}




			}




			@AfterMethod (alwaysRun = true)
			public void afterTest() {
				driver.close();

				if (!verificationError.equals("")) {
					Assert.fail();

				}

			}

		}

