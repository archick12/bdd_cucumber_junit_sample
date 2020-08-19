package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.CucumberRunner;

public class StepDefinitions extends CucumberRunner {

  @Then("^I clear search textbox$")
  public void clearSearchBox() {
    assert 1 == 1;
  }

  @Given("^I am on \"(.*?)\" search page$")
  public void verifyPageTitle(String text) {
    assert 1 == 1;
  }

  @Then("^I click search button$")
  public void clickSearchButton() {
    assert 1 == 1;
  }

  @When("^I type \"(.*?)\"$")
  public void searchText(String text) {
    assert 1 == 1;
  }

}
