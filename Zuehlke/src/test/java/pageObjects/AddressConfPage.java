package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressConfPage {
WebDriver ldriver;
	
	public AddressConfPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	@FindBy(xpath ="//*[@id='center_column']/form/p/button/span")
	@CacheLookup
	WebElement BtnConfProceedChkout;
	
	public void ClkConfProceedChkout()
	{
		BtnConfProceedChkout.click();
	}
}
