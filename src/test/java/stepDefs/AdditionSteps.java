package stepDefs;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CalculatorPage;
import utils.DriverFactory;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionSteps {
    private AndroidDriver<AndroidElement> androidDriver;
    private CalculatorPage calculatorPage;

    @Given("user enters a number and taps plus and enters another number")
    public void user_enters_a_number_and_taps_plus_and_enters_another_number() throws MalformedURLException {

        androidDriver = new DriverFactory().getDriver();
        calculatorPage = new CalculatorPage(androidDriver);

        calculatorPage.clickEight()
                .clickPlus()
                .clickTwo();
    }

    @When("equals selected")
    public void equals_selected() {
        calculatorPage.clickEquals();
    }

    @Then("result is the sum of the two numbers")
    public void result_is_the_sum_of_the_two_numbers() {
        assertEquals("10", calculatorPage.getResultText());
    }
}
