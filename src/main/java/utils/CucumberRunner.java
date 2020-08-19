package utils;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.junit.Cucumber;

import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, monochrome = true, features = "src/test/resources/features", glue = "stepdefinition", format = {"pretty", "json:target/cucumber.json"}, tags = {"@Regression"})
public class CucumberRunner {

  @Before
  public void setUp() {
    WebDriverFactory.createInstance("Chrome");
  }

  @After
  public void tearDown(ITestResult result) {
    if (!result.isSuccess()) {
      try {
        takeScreenshot();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    WebDriverFactory.getDriver().quit();
  }

  public void takeScreenshot() throws IOException {
    File scrFile = ((TakesScreenshot) WebDriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
    File trgtFile = new File(System.getProperty("user.dir") + "//screenshots/screenshot.png");
    System.out.println("SAVING Screenshot to " + trgtFile.getAbsolutePath());
    trgtFile.getParentFile().mkdir();
    trgtFile.createNewFile();
    Files.copy(scrFile, trgtFile);
  }
}