package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

import java.util.*;

public class SearchPage {

    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href=\"#users\"]")
    public WebElement usersLink;

    @FindBy(xpath = "//th")
    public List<WebElement> columns;
}
