package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class ButtonPage {

    public ButtonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@onclick=\"button1()\"]")
    public WebElement button1;

    @FindBy(xpath = "//button[@onclick=\"button2()\"]")
    public WebElement button2;

    @FindBy(xpath = "//button[@onclick=\"button3()\"]")
    public WebElement button3;

    @FindBy(xpath = "//button[@onclick=\"button4()\"]")
    public WebElement button4;

    @FindBy(xpath = "//button[@onclick=\"button5()\"]")
    public WebElement button5;

    @FindBy(xpath = "//button[@onclick=\"button6()\"]")
    public WebElement button6;

    @FindBy(id = "result")
    public WebElement result;
}
