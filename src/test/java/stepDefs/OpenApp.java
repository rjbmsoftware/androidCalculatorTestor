package stepDefs;

import io.cucumber.java.en.Given;
import utils.TestDataWrapper;

public class OpenApp {

    TestDataWrapper testDataWrapper;

    public OpenApp(TestDataWrapper testDataWrapper) {
        this.testDataWrapper = testDataWrapper;
    }

    @Given("user viewing the calculator page")
    public void user_viewing_the_calculator_page() {
        // test wrapper does this
    }
}
