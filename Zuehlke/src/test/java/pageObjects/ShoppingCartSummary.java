package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartSummary {
WebDriver ldriver;
	
	public ShoppingCartSummary(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath ="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	@CacheLookup
	WebElement BtnPageProceedChkout;
	
	
	public void ClkPageProceedChkout()
	{
		BtnPageProceedChkout.click();
	}


}

