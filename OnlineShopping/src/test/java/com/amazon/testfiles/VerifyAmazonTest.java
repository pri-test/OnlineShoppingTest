package com.amazon.testfiles;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class VerifyAmazonTest {
	
	WebDriver driver=null;
	
	@BeforeTest
	@Parameters("browser")
	public void LaunchBrowser(String browser) throws Exception
	{
		//Check if parameter passed from TestNG is 'chrome'
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "D:\\work\\selenium\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver", "D:\\work\\selenium\\firefoxdriver\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
		
		else{
			//If no browser passed through exception
			throw new Exception("Browser is not correct");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
		
		
	
	
  @Test
  
  public void AmazonRun() throws InterruptedException 
  {
	  AmazonElementsTest L1= new AmazonElementsTest(driver); 
	  L1.TestSignInText();
	  //Thread.sleep(20000);
	  //L1.TestSignInButton();
	  Thread.sleep(10000);
	  L1.TestUsername();
	  Thread.sleep(5000);
	  L1.TestContinueButton();
	  Thread.sleep(5000);
	  L1.TestPassword();
	  Thread.sleep(5000);
	  L1.TestLogin();
	  Thread.sleep(10000);
	  L1.TestSearch();
	  Thread.sleep(20000);
	  L1.TestSelectRating();
	  Thread.sleep(20000);
	  L1.TestSelectPhone();
	  Thread.sleep(10000);
	  L1.switchToNewWindow(2);
	  Thread.sleep(10000);
	  L1.TestAddToCart();
	  Thread.sleep(5000);
	  L1.VerifyAddToCart();
	  Thread.sleep(5000);
	  L1.TestCheckout();
	  Thread.sleep(5000);
	  L1.TestNewAddress();
	  Thread.sleep(5000);
	  L1.TestFullName();
	  Thread.sleep(5000);
	  L1.TestMobileNum();
	  Thread.sleep(5000);
	  L1.TestPostalCode();
	  Thread.sleep(5000);
	  L1.TestAddress1();
	  Thread.sleep(5000);
	  L1.TestAddress2();
	  Thread.sleep(5000);
	  L1.TestLandMark();
	  Thread.sleep(5000);
	  L1.TestDeliverButton();
	  Thread.sleep(5000);
	  L1.TestContinueButton1();
	  Thread.sleep(5000);
	  L1.TestPayment();
	  Thread.sleep(5000);
	  //L1.TestPaymentButton();
	  //Thread.sleep(5000);
	  //L1.TestContinueButton2();
	  
  }
	  @AfterTest
	  
	  public void terminateBrowser()
	  {
		  driver.close();
	  
	  
	  }
	  
	  
	  
  }
  
  

