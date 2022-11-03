package step_definitions;

import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import pages.*;
import utilities.*;

import java.util.*;

public class SearchResultStepDef {

    LoginPage loginPage = new LoginPage();

    SearchPage searchPage = new SearchPage();

    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("librarian.username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("librarian.password"));
        loginPage.signInBtn.click();
    }

    @Given("I click on {string} link")
    public void i_click_on_link(String string) {
        searchPage.usersLink.click();
    }

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> list) {
        List<String> actual = new ArrayList<>();
        for (WebElement webElement : searchPage.columns) {
                actual.add(webElement.getText());
        }
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.CONTROL,Keys.SHIFT + "d");

        Assert.assertEquals(actual,list);


    }

}
