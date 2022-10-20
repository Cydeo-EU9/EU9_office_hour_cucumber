package step_definitions;

import io.cucumber.java.en.*;
import org.junit.*;
import pages.*;
import utilities.*;

public class ButtonStepDefinition {

    ButtonPage buttonPage = new ButtonPage();

    @Given("user is on the button page")
    public void user_is_on_the_button_page() {
        Driver.getDriver().get("https://practice.cydeo.com/multiple_buttons");
    }

    @When("user click number one button")
    public void user_click_number_one_button() {
        buttonPage.button1.click();
    }

    @Then("user should see Clicked on button one!")
    public void user_should_see_clicked_on_button_one() {
        String expectedMsg = "Clicked on button one!";
        String actualMsg = buttonPage.result.getText();
        Assert.assertEquals(expectedMsg,actualMsg);
    }

    @When("user click number two button")
    public void user_click_number_two_button() {
        buttonPage.button2.click();
    }
    @Then("user should see Clicked on button two!")
    public void user_should_see_clicked_on_button_two() {
        String expectedMsg = "Clicked on button two!";
        String actualMsg = buttonPage.result.getText();
        Assert.assertEquals(expectedMsg,actualMsg);
    }

}
