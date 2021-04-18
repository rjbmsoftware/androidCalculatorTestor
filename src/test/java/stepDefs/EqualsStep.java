package stepDefs;

import io.cucumber.java.en.When;
import utils.TestDataWrapper;

public class EqualsStep {

    TestDataWrapper testDataWrapper;

    public EqualsStep(TestDataWrapper testDataWrapper) {
        this.testDataWrapper = testDataWrapper;
    }

    @When("equals selected")
    public void equals_selected() {
        testDataWrapper.calculatorPage.clickEquals();
    }
}
