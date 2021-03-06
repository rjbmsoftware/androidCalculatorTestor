package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    public AndroidDriver<AndroidElement> getDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", ".Calculator");

        URL url = null;

        try {
            url = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        }

        assert url != null;
        return new AndroidDriver<>(url, desiredCapabilities);
    }
}
