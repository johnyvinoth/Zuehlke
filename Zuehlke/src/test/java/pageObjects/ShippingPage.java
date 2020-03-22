package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
WebDriver ldriver;
	
	public ShippingPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath ="//*[@id='form']/p/button/span")
	@CacheLookup
	WebElement BtnShpProceedChkout;
	
	@FindBy(xpath ="//*[@id='cgv']")
	@CacheLookup
	WebElement ChkTermsCndn;
	
	public void ClkShpProceedChkout()
	{
		BtnShpProceedChkout.click();
	}
		public void ChckTearmsCndn()
	{
			ChkTermsCndn.click();
	}
}
