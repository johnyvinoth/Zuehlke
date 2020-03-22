package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
WebDriver ldriver;
	
	public MainPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
	@CacheLookup
	WebElement lnkSignIn;
	
	@FindBy(xpath ="//*[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[1]/span")
	@CacheLookup
	WebElement BtnAddTshirt;
	
	
	//WebElement BtnAddTshirt = ldriver.findElement(By.xpath("//*[@id=\\'homefeatured\\']/li[1]/div/div[2]/div[2]/a[1]"));
	/*{((JavascriptExecutor)ldriver).executeScript("arguments[0].click();", element);
	
	}*/
	
	
	@FindBy(xpath ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	@CacheLookup
	WebElement BtnProceedChkout;
	
	public void clkSignIn()
	{
		lnkSignIn.click();
	}
	
	public void clkAddTshirt1()
	{
		((JavascriptExecutor)ldriver).executeScript("arguments[0].click();", BtnAddTshirt);
		//BtnAddTshirt.click();
	}
	public void clkProceedChkout()
	{
		BtnProceedChkout.click();
	}
	
}
