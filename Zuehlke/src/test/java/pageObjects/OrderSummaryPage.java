package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
WebDriver ldriver;
	
	public OrderSummaryPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//*[@id='cart_navigation']/button/span")
	@CacheLookup
	WebElement BtnConfrOrder;
	
	@FindBy(xpath ="//*[@id='cart_navigation']/a")
	@CacheLookup
	WebElement BtnBckOtrPayments;
	
	
	public void ClkConfirmOrder()
	{
		BtnConfrOrder.click();
	}
	public void ClkBckOtrPayments()
	{
		BtnBckOtrPayments.click();
	}
}
