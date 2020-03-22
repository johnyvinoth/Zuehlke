package ExtentReports;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager 
{
	static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
	static String repName="Test-Report-"+timeStamp+".html";
	
	static ExtentReports extent;
    //final static String filePath = "Extent.html";
    
    public synchronized static ExtentReports getReporter() 
    {
        if (extent == null) {
            extent = new ExtentReports(System.getProperty("user.dir")+ "/test-output/"+repName, true);
        }
        
        return extent;
    }
    
	 public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException
	 {
	  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  
	  // after execution, you could see a folder "FailedTestsScreenshots" under src folder
	  String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".jpg";
	  File finalDestination = new File(destination);
	  FileUtils.copyFile(source, finalDestination);
	  return destination;
	 }
}
