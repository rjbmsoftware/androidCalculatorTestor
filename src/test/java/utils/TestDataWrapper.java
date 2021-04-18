package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.CalculatorPage;

public class TestDataWrapper {

    public AndroidDriver<AndroidElement> androidDriver = new DriverFactory().getDriver();
    public CalculatorPage calculatorPage = new CalculatorPage(androidDriver);
}
