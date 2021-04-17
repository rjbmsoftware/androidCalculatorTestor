package stepDefs;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionSteps {
    private AndroidDriver<AndroidElement> androidDriver;

    @Given("user enters a number and taps plus and enters another number")
    public void user_enters_a_number_and_taps_plus_and_enters_another_number() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", ".Calculator");

        URL url = new URL("http://localhost:4723/wd/hub");
        androidDriver = new AndroidDriver<>(url, desiredCapabilities);

        MobileElement el1 = androidDriver.findElementById("com.android.calculator2:id/digit_8");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("plus");
        el2.click();
        MobileElement el3 = androidDriver.findElementById("com.android.calculator2:id/digit_2");
        el3.click();

    }
    @When("equals selected")
    public void equals_selected() {
        MobileElement el4 = androidDriver.findElementByAccessibilityId("equals");
        el4.click();
    }
    @Then("result is the sum of the two numbers")
    public void result_is_the_sum_of_the_two_numbers() {
        MobileElement result = androidDriver.findElementById("com.android.calculator2:id/result");
        String answer = result.getText();
        assertEquals("10", answer);
    }
}
