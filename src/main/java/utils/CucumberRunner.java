package utils;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = true, monochrome = true, features = "src/test/resources/features", glue = "stepdefinition", format = {"pretty","json:target/cucumber.json"}, tags = { "@Regression,@JunitScenario,@TestngScenario" })

public class CucumberRunner extends AbstractTestNGCucumberTests {

}