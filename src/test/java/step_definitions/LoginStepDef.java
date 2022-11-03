package step_definitions;

import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;
import pages.*;
import utilities.*;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();


    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
    }
    @When("user enters username")
    public void user_enters_username() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("student.username"));
    }
    @When("user enters password")
    public void user_enters_password() {
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("student.password"));
        loginPage.signInBtn.click();
    }
    @Then("user should be on student dashboard")
    public void user_should_be_on_student_dashboard() {
        String actual = loginPage.studentRole.getText();
        Assert.assertTrue(actual.contains("Student"));
    }

    @Then("user should be on librarian dashboard")
    public void user_should_be_on_librarian_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters {string} username")
    public void user_enters_username(String role) {
        String username = "";
        if (role.equals("Student")) {
            username = ConfigurationReader.getProperty("student.username");
        }else if(role.equals("Librarian")){
            username = ConfigurationReader.getProperty("librarian.username");
        }
        loginPage.emailInput.sendKeys(username);
    }
    @When("user enters {string} password")
    public void user_enters_password(String role) {
        String password = "";
        if (role.equals("Student")) {
            password = ConfigurationReader.getProperty("student.password");
        }else if(role.equals("Librarian")){
            password = ConfigurationReader.getProperty("librarian.password");
        }
        loginPage.passwordInput.sendKeys(password);
        loginPage.signInBtn.click();

    }
    @Then("user should be on {string} dashboard")
    public void user_should_be_on_dashboard(String role) {
        String actual = "";
        if (role.equals("Student")) {
            actual = loginPage.studentRole.getText();
            Assert.assertEquals(actual,"Student");
        }else if(role.equals("Librarian")){
            actual = loginPage.studentRole.getText();
            Assert.assertEquals(actual,"Librarian");
        }

    }

}
