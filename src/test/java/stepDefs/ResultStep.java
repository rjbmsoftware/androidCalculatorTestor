package stepDefs;

import io.cucumber.java.en.Then;
import utils.TestDataWrapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultStep {

    TestDataWrapper testDataWrapper;

    public ResultStep(TestDataWrapper testDataWrapper) {
        this.testDataWrapper = testDataWrapper;
    }

    @Then("result is {int}")
    public void resultIs(int answer) {
        assertEquals(Integer.toString(answer), testDataWrapper.calculatorPage.getResultText());
    }
}
