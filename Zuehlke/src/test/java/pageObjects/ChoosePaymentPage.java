package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChoosePaymentPage {
WebDriver ldriver;
	
	public ChoosePaymentPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
	@CacheLookup
	WebElement BtnPayByWire;
		
	@FindBy(xpath ="//*[@id='HOOK_PAYMENT']/div[2]/div/p/a/span")
	@CacheLookup
	WebElement BtnPayByCheck;
	
	public void ClkPayByWire()
	{
		BtnPayByWire.click();
	}
	public void ClkPayByCheck()
	{
		BtnPayByCheck.click();
	}
	
}
