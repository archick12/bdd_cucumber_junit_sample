package utils;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/test/resources/features", glue = "stepdefinition", plugin = {"pretty", "json:target/cucumber.json"}, tags = ("@Regression"))
public class CucumberRunner {

}