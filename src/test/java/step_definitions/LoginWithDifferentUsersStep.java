package step_definitions;

import io.cucumber.java.en.*;
import org.junit.*;
import pages.*;

public class LoginWithDifferentUsersStep {

    LoginPage loginPage = new LoginPage();

    @When("user login with {string} and {string}")
    public void user_login_with_and(String userName, String password) {
        loginPage.emailInput.sendKeys(userName);
        loginPage.passwordInput.sendKeys(password);
        loginPage.signInBtn.click();
    }

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String name) throws InterruptedException {
        Thread.sleep(3000);
        String expected = loginPage.studentRole.getText();
        Assert.assertEquals(expected,name);
    }
}
