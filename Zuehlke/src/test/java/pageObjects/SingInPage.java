package pageObjects;

import java.sql.Driver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases.BaseClass;

public class SingInPage {
WebDriver ldriver;

//WebDriverWait wait=new WebDriverWait(ldriver, 20);

	public SingInPage(WebDriver rdriver)
	{	
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	//*[@id="email"]
	//@FindBy(xpath = "//input[@type='text' OR @name='email' OR @id='email']")
//	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
	 
	@FindBy(xpath = "//h3[contains(text(),'Already registered?')]//ancestor::form//label[contains(text(),'Email address')]//following-sibling::input")
	//@FindBy(xpath = "//*[@id=\"email\"]")
	@CacheLookup
	WebElement txtEmail;

	//WebElement txtEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Already registered?')]//ancestor::form//label[contains(text(),'Email address')]//following-sibling::input")));
	//WebElement txtEmail=ldriver.findElement(By.xpath("//h3[contains(text(),'Already registered?')]//ancestor::form//label[contains(text(),'Email address')]//following-sibling::input"));
	//@FindBy(how =How.NAME, using = "passwd" )
	
	@FindBy(xpath = "//h3[contains(text(),'Already registered?')]//ancestor::form//label[contains(text(),'Password')]//following-sibling::span//input")
	@CacheLookup
	WebElement txtPassword;
	
	//@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
	@FindBy(xpath = "//button[@name='SubmitLogin']")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
	@CacheLookup
	WebElement lnkSignOut;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")
	@CacheLookup
	WebElement MsgError;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/a/span")
	@CacheLookup
	WebElement btnHome;
	
	public void setEmail(String Email)
	{
		txtEmail.sendKeys(Email);
	}
	public void setPassword(String Email)
	{
		txtPassword.sendKeys(Email);
	}
	public void clkLoginIn()
	{
		btnSubmit.click();
	}
	public void clkSignOut()
	{
		lnkSignOut.click();
	}
	public WebElement ErrMsg()
	{
		return MsgError;
	}
	
	public void clkHome()
	{
		btnHome.click();
	}
	
}
