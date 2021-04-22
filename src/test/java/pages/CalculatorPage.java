package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    @FindBy(id = "com.android.calculator2:id/digit_9")
    private MobileElement nineButton;

    @FindBy(id = "com.android.calculator2:id/digit_8")
    private MobileElement eightButton;

    @FindBy(id = "com.android.calculator2:id/digit_7")
    private MobileElement sevenButton;

    @FindBy(id = "com.android.calculator2:id/digit_6")
    private MobileElement sixButton;

    @FindBy(id = "com.android.calculator2:id/digit_5")
    private MobileElement fiveButton;

    @FindBy(id = "com.android.calculator2:id/digit_4")
    private MobileElement fourButton;

    @FindBy(id = "com.android.calculator2:id/digit_3")
    private MobileElement threeButton;

    @FindBy(id = "com.android.calculator2:id/digit_2")
    private MobileElement twoButton;

    @FindBy(id = "com.android.calculator2:id/digit_1")
    private MobileElement oneButton;

    @FindBy(id = "com.android.calculator2:id/digit_0")
    private MobileElement zeroButton;

    @AndroidFindBy(accessibility = "plus")
    private MobileElement plusButton;

    @AndroidFindBy(accessibility = "equals")
    private MobileElement equalsButton;

    @FindBy(id = "com.android.calculator2:id/result")
    private MobileElement resultText;

    @FindBy(id = "com.android.calculator2:id/op_sub")
    private MobileElement minusButton;

    @AndroidFindBy(accessibility = "More options")
    private MobileElement menuEllipsis;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    private MobileElement historyLink;

    public CalculatorPage(AndroidDriver<AndroidElement> androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public void clickMenu() {
        menuEllipsis.click();
    }

    public void clickHistory() {
        historyLink.click();
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

    public CalculatorPage clickNumberButton(int number) {
        switch (number) {
            case 0:
               zeroButton.click();
               break;
            case 1:
                oneButton.click();
                break;
            case 2:
                twoButton.click();
                break;
            case 3:
                threeButton.click();
                break;
            case 4:
                fourButton.click();
                break;
            case 5:
                fiveButton.click();
                break;
            case 6:
                sixButton.click();
                break;
            case 7:
                sevenButton.click();
                break;
            case 8:
                eightButton.click();
                break;
            case 9:
                nineButton.click();
                break;
            default:
                throw new InvalidArgumentException("Numbers must be 0-9 inclusive");
        }

        return this;
    }

    public String getResultText() {
        return resultText.getText();
    }

    public CalculatorPage clickMinus() {
        minusButton.click();
        return this;
    }
}
