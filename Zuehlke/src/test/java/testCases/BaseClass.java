package testCases;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pageObjects.AddressConfPage;
import pageObjects.ChoosePaymentPage;
import pageObjects.MainPage;
import pageObjects.OrderConfPage;
import pageObjects.OrderSummaryPage;
import pageObjects.ShippingPage;
import pageObjects.ShoppingCartSummary;
import pageObjects.SingInPage;
import testdata.ReadConfig;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	public String BaseURL = readconfig.getApplicationURL();
	public WebDriver driver;
	public static Logger logger;
	
	public MainPage mp;
	public SingInPage sp;
	public ShoppingCartSummary ShpSumP;
	public ShippingPage ShpPg;
	public OrderSummaryPage OrdSumPg;
	public OrderConfPage OrdCnfPg;
	public ChoosePaymentPage ChosPayPg;
	public AddressConfPage AddCnfPg;
	

	

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws Exception {
		try {

			logger = Logger.getLogger("Zuehlke");
			PropertyConfigurator.configure("Log4j.properties");

			if (br.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
				driver = new ChromeDriver();

			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(BaseURL);
			driver.manage().window().maximize();

		} catch (Exception ex) {
			// log.info("Exception occured", ex);
			throw (ex);

		}

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");

		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");

	}

}