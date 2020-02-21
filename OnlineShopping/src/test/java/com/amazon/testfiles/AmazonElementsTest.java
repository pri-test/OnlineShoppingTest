package com.amazon.testfiles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonElementsTest {
	
	WebDriver driver;
	
	public AmazonElementsTest(WebDriver driver1)
	{
		driver=driver1;
	}

	
	By SignInText= By.xpath("//span[contains(text(),'Hello. Sign in')]");
	By SignInButton= By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]");
	By Username= By.xpath("//input[@id='ap_email']");
	By ContinueButton=By.xpath("//input[@id='continue']");
	By Password= By.xpath("//input[@id='ap_password']");
	By Login= By.xpath("//input[@id='signInSubmit']");
	By SearchBox= By.xpath("//input[@id='twotabsearchtextbox']");
	By SelectRating= By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']");
	By SelectPhone= By.xpath("//span[contains(text(),'Samsung Galaxy M30 (Metallic Blue, 3GB RAM, Super')]");
	By AddToCart= By.xpath("//input[@id='add-to-cart-button']");
	By CartSize= By.xpath("//span[@class='nav-cart-icon nav-sprite']");
	By Checkout= By.xpath("//span[@id='attach-sidesheet-checkout-button']//input[@class='a-button-input']");
	By NewAddress=By.linkText("enter a new delivery address");
	By FullName=By.xpath("//*[@id='enterAddressFullName']");
	By MobileNum=By.xpath("//*[@id='enterAddressPhoneNumber']");
	By PostalCode=By.xpath("//*[@id='enterAddressPostalCode']");
	By Address1=By.xpath("//*[@id='enterAddressAddressLine1']");
	By Address2=By.xpath("//*[@id='enterAddressAddressLine2']");
	By LandMark=By.xpath("//*[@id='enterAddressLandmark']");
	By DeliverButton=By.name("shipToThisAddress");
	By ContinueButton1=By.className("a-button-text");
	By Payment=By.xpath("//span[contains(text(),'Pay on Delivery (Cash/UPI/Card)')]");
	By PaymentButton=By.xpath("//input[@id='pp-1n4Ltl-290']");
	By ContinueButton2=By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent");
	
	
	


	public void TestSignInText()
	{
		driver.findElement(SignInText).click();		
	}	
	
	
	
    public void TestUsername()
	{
	driver.findElement(Username).sendKeys("souvickit61@gmail.com");
	}
    
  public void TestContinueButton()
	{
	driver.findElement(ContinueButton).click();
	} 
		
		
  public void TestPassword()
	{
	 driver.findElement(Password).sendKeys("123happy");
	} 	
  
  public void TestLogin()
    {
	driver.findElement(Login).click();	
	} 	
  
  public void TestSearch()
	{
		driver.findElement(SearchBox).sendKeys("SamsungM30" +Keys.ENTER);
	}
	
	public void TestSelectRating()
	{
		
		driver.findElement(SelectRating).click();
		
	}
	
public void TestSelectPhone()
	
	{
		driver.findElement(SelectPhone).click();	
	}


public void switchToNewWindow(int windowNumber) {
    Set < String > s = driver.getWindowHandles();   
    Iterator < String > ite = s.iterator();
    int i = 1;
    while (ite.hasNext() && i < 10) {
        String popupHandle = ite.next().toString();
        driver.switchTo().window(popupHandle);
        System.out.println("Window title is : "+driver.getTitle());
        if (i == windowNumber) break;
        i++;
    }
}

public void TestAddToCart()

{
	driver.findElement(AddToCart).click();	
	
}

public void VerifyAddToCart()

{
	
	
	if(driver.findElements(CartSize).size()!=0)
	    {
		System.out.println("Element is Present");
		}
	else
		{
		System.out.println("Element is Absent");
		}
	
}


public void TestCheckout()

{
	driver.findElement(Checkout).click();	
	
}

public void TestNewAddress()

{
	driver.findElement(NewAddress).click();	
	
}

public void TestFullName()

{
	driver.findElement(FullName).sendKeys("John Bloggs");
	
}

public void TestMobileNum()

{
	driver.findElement(MobileNum).sendKeys("9006789765");
	
}

public void TestPostalCode()

{
	driver.findElement(PostalCode).sendKeys("700136");
	
}

public void TestAddress1()

{
	driver.findElement(Address1).sendKeys("Siddha Pines");
	
}

public void TestAddress2()

{
	driver.findElement(Address2).sendKeys("Elgin Road");
	
}

public void TestLandMark()

{
	driver.findElement(LandMark).sendKeys("City Centre");
	
}



public void TestDeliverButton()

{
	driver.findElement(DeliverButton).click();
	
}

public void TestContinueButton1()

{
	driver.findElement(ContinueButton1).click();
	
}



public void TestPayment()

{
	JavascriptExecutor je = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(Payment);
	element.click();
	je.executeScript("arguments[0].scrollIntoView(true);",element);
	System.out.println(element.getText());
	
}

public void TestPaymentButton()

{
	driver.findElement(PaymentButton).click();
	
}

public void TestContinueButton2()

{
	driver.findElement(ContinueButton2).click();
	}


	
}
