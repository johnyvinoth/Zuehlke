package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfPage {
WebDriver ldriver;
	
	public OrderConfPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//*[@id='center_column']/p/a")
	@CacheLookup
	WebElement BtnBckToOrders;
	
	public void ClkBckToOrders()
	{
		BtnBckToOrders.click();
	}
}
