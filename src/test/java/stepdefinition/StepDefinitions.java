package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.CucumberRunner;
import utils.WebDriverFactory;

public class StepDefinitions extends CucumberRunner {

  @Then("^I navigate to Jira Login Page$")
  public void navigateToLoginPage() {
    LoginPage loginPage = new LoginPage(WebDriverFactory.getDriver());
    loginPage.navigateTo();
  }


  @Then("^I enter user name - \"(.*?)\"$")
  public void enterUserName(String userName) {
    LoginPage loginPage = new LoginPage(WebDriverFactory.getDriver());
    loginPage.enterUserName(userName);
  }

  @Then("^I enter password - \"(.*?)\"$")
  public void enterPassword(String password) {
    LoginPage loginPage = new LoginPage(WebDriverFactory.getDriver());
    loginPage.enterPassword(password);
  }

  @Then("^I click on the login button$")
  public void clickLoginButton() {
    LoginPage loginPage = new LoginPage(WebDriverFactory.getDriver());
    loginPage.clickLogin();
  }

  @When("^I am on the Home Page$")
  public void atTheHomePage() {
    HomePage homePage = new HomePage(WebDriverFactory.getDriver());
    assert homePage.onPage();
  }

}
