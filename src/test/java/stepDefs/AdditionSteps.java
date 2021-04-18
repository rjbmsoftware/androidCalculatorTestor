package stepDefs;

import io.cucumber.java.en.Given;
import utils.TestDataWrapper;

public class AdditionSteps {

    TestDataWrapper testDataWrapper;

    public AdditionSteps(TestDataWrapper testDataWrapper) {
        this.testDataWrapper = testDataWrapper;
    }

    @Given("user enters a number and taps plus and enters another number")
    public void user_enters_a_number_and_taps_plus_and_enters_another_number() {
        testDataWrapper.calculatorPage.clickEight()
                .clickPlus()
                .clickTwo();
    }
}
