package TestRunner;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

//import org.junit.runner.RunWith;

import org.testng.annotations.Test;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions
(
features =".//Features//",	
glue="stepDefinitions",
tags= {"@AllTests"},
/*format= {
		"pretty",
		"html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt"
},*/
dryRun=false,
monochrome=true,
plugin= {"pretty","html:test-output"}
)
@Test
public class TestRun extends AbstractTestNGCucumberTests{
//public class TestRun  {
/*	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass
	public void setUpClass() throws Exception {
		testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());
	}
	@Test(groups="cucumber",description="Runs Cucumber Feature",dataProvider="features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		}
	
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideFeatures();
		}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
		
	}*/
	
	
}
