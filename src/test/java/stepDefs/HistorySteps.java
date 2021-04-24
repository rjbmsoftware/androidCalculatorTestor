package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HistoryPage;
import utils.TestDataWrapper;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HistorySteps {

    TestDataWrapper testDataWrapper;
    HistoryPage historyPage;

    public HistorySteps(TestDataWrapper testDataWrapper) {
        this.testDataWrapper = testDataWrapper;
    }


    @When("calculator menu selected")
    public void calculator_menu_selected() {
        testDataWrapper.calculatorPage.clickMenu();
    }

    @When("history selected")
    public void history_selected() {
        historyPage = testDataWrapper.calculatorPage.clickHistory();
    }

    @Then("history page displayed")
    public void history_page_displayed() {
        assertTrue(historyPage.isPageDisplayed());
    }
}
