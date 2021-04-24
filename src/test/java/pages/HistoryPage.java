package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HistoryPage {

    @FindBy(xpath = "//android.widget.TextView")
    private List<MobileElement> textViews;

    public HistoryPage(AndroidDriver<AndroidElement> androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public boolean isPageDisplayed() {
        // unclear why this is needed as "//android.widget.TextView[text()='History']" NSE
        return textViews.stream()
                .map(WebElement::getText)
                .anyMatch(s -> s.equals("History"));
    }
}
