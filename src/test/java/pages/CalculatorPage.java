package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    @FindBy(id = "com.android.calculator2:id/digit_8")
    private MobileElement eightButton;

    @AndroidFindBy(accessibility = "plus")
    private MobileElement plusButton;

    @FindBy(id = "com.android.calculator2:id/digit_2")
    private MobileElement twoButton;

    @AndroidFindBy(accessibility = "equals")
    private MobileElement equalsButton;

    @FindBy(id = "com.android.calculator2:id/result")
    private MobileElement resultText;

    public CalculatorPage(AndroidDriver<AndroidElement> androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public CalculatorPage clickEight() {
        eightButton.click();
        return this;
    }

    public CalculatorPage clickPlus() {
        plusButton.click();
        return this;
    }

    public CalculatorPage clickTwo() {
        twoButton.click();
        return this;
    }

    public CalculatorPage clickEquals() {
        equalsButton.click();
        return this;
    }

    public String getResultText() {
        return resultText.getText();
    }
}
