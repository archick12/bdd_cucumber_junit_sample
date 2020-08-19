package utils;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(strict = true, monochrome = true, features = "src/test/resources/features", glue = "stepdefinition", format = {"pretty", "json:target/cucumber.json"}, tags = {"@Regression,@JunitScenario,@TestngScenario"})

public class CucumberRunner extends AbstractTestNGCucumberTests {

  @BeforeSuite(alwaysRun = true)
  public void setUp() {
    WebDriverFactory.createInstance("Chrome");
  }

  @AfterMethod(alwaysRun = true)
  public void tearDownr(ITestResult result) {
    WebDriverFactory.getDriver().quit();
  }
}