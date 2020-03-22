package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import pageObjects.AddressConfPage;
import pageObjects.ChoosePaymentPage;
import pageObjects.MainPage;
import pageObjects.OrderSummaryPage;
import pageObjects.ShippingPage;
import pageObjects.ShoppingCartSummary;
import pageObjects.SingInPage;
import testCases.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.org.jline.utils.Log;

public class Steps extends BaseClass {

	
	
@Given("user Launch Chrome browser")
public void user_Launch_Chrome_browser() {
	
   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   
   mp = new MainPage(driver);
}

@When("User opens URL")
public void user_opens_URL() {
	driver.get(BaseURL);
  
}

@When("user clicks SignIn link")
public void user_clicks_SignIn_link() {
    mp.clkSignIn();
}

@When("User enters Email as {string} and Password as {string}")
public void user_enters_Email_as_and_Password_as(String Email, String pwd) {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   sp =new SingInPage(driver);
   sp.setEmail(Email);
   sp.setPassword(pwd);
}

@When("Click on Login")
public void click_on_Login() {
    sp.clkLoginIn();
}

@Then("Page Title should be {string}")
public void page_Title_should_be(String PageTitle) {
	
	//if(driver.getPageSource().contains("Welcome to your account. Here you can manage all of your personal information and orders.") & driver.getTitle()==PageTitle)
/*	if(driver.getTitle().trim()==PageTitle.trim())
	{
		Assert.assertTrue(true);
		logger.info("Expected message displayed");
	}
	else
	{
		Assert.assertTrue(false);
		logger.info("Expected message not displayed");
	}*/
 Assert.assertEquals(driver.getTitle(), PageTitle);

}

@Then("Success message should display {string}")
public void success_message_should_display(String SucsMsg) {
	
	String pageSource = driver.getPageSource();
	Assert.assertTrue(driver.getPageSource().contains(SucsMsg));

}


@When("User click on Sign out link")
public void user_click_on_Sign_out_link() {
  sp.clkSignOut();
}

@Then("Error message should display {string}")
public void error_message_should_display(String ErrMessage) {
	//if(sp.ErrMsg().getText().contains(Message))
	if(driver.getPageSource().contains(ErrMessage))
	{
		Assert.assertTrue(true);
		//logger.info("Expected Error message displayed");
	}
	else
	{
		Assert.assertTrue(false);
		//logger.info("Expected Error not message displayed");
	}
}


@Given("User click on Home button")
public void user_click_on_Home_button() {
  sp.clkHome();
}

@Given("Add a product to the cart")
public void add_a_product_to_the_cart() {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//WebDriverWait wait=new WebDriverWait(driver, 20);
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[1]/span")));  
mp.clkAddTshirt1();
}

@Given("Click Proceed to Checkout button from Popup")
public void click_Proceed_to_Checkout_button_from_Popup() {
	
 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 mp.clkProceedChkout();
}

@Then("Message should display {string}")
public void message_should_display(String Message) {
	if(driver.getPageSource().contains(Message))
	{
		Assert.assertTrue(true);
		//logger.info("Expected Error message displayed");
	}
	else
	{
		Assert.assertTrue(false);
		//logger.info("Expected Error not message displayed");
	}
}

@Then("Click Proceed to Checkout button from Shopping Cart Summary page")
public void click_Proceed_to_Checkout_button_from_Shopping_Cart_Summary_page() {
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 ShpSumP = new ShoppingCartSummary(driver);
	 ShpSumP.ClkPageProceedChkout();
	 
}

@Then("Click Proceed to Checkout button from Addresses page")
public void click_Proceed_to_Checkout_button_from_Addresses_page() {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	AddCnfPg= new AddressConfPage(driver);
	AddCnfPg.ClkConfProceedChkout();
}

@Then("Click Agree Terms and conditions checkbox")
public void click_Agree_Terms_and_conditions_checkbox() {
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  ShpPg =new ShippingPage(driver);
  ShpPg.ChckTearmsCndn();
 
  
}

@Then("Click Proceed to Checkout button from Shipping page")
public void click_Proceed_to_Checkout_button_from_Shipping_page() {
	 ShpPg.ClkShpProceedChkout();
}

@Then("Click Payby wire from Payment page")
public void click_Payby_wire_from_Payment_page() {
  ChosPayPg = new ChoosePaymentPage(driver);
  ChosPayPg.ClkPayByWire();
}

@Then("Click confirm order button from Order Summary page")
public void click_confirm_order_button_from_Order_Summary_page() {
	OrdSumPg = new OrderSummaryPage(driver);
	OrdSumPg.ClkConfirmOrder();
	
}

@Then ("close browser")
public void close_browser()
{
driver.quit();    
}
	
}
