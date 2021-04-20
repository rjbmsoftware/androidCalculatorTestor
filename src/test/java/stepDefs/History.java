package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestDataWrapper;

public class History {

    TestDataWrapper testDataWrapper;

    public History(TestDataWrapper testDataWrapper) {
        this.testDataWrapper = testDataWrapper;
    }


    @When("calculator menu selected")
    public void calculator_menu_selected() {
        // Write code here that turns the phrase above into concrete actions
        testDataWrapper.calculatorPage.clickMenu();
    }

    @When("history selected")
    public void history_selected() {
        // Write code here that turns the phrase above into concrete actions
        testDataWrapper.calculatorPage.clickHistory();
    }

    @Then("history page displayed")
    public void history_page_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
