package stepDefs;

import io.cucumber.java.en.Given;
import utils.TestDataWrapper;

public class SubtractionSteps {

    TestDataWrapper testDataWrapper;

    public SubtractionSteps(TestDataWrapper testDataWrapper) {
        this.testDataWrapper = testDataWrapper;
    }

    @Given("user enters a number and taps minus and enters another number")
    public void userEntersANumberAndTapsMinusAndEntersAnotherNumber() {
        testDataWrapper.calculatorPage.clickEight()
                .clickMinus()
                .clickTwo();
    }
}
