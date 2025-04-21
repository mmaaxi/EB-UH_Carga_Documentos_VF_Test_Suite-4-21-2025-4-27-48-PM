package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page passwordRecoveryPage = PageFactory.initElements(driver, tc_003Page.class);

    @When("User clicks on the 'Forgot Password' link")
    public void user_clicks_on_forgot_password_link() {
        passwordRecoveryPage.clickForgotPasswordLink();
    }

    @Then("User is redirected to the password recovery page")
    public void user_redirected_to_password_recovery_page() {
        Assert.assertTrue(passwordRecoveryPage.isPasswordRecoveryPageDisplayed());
    }

    @When("User enters a valid email")
    public void user_enters_valid_email() {
        passwordRecoveryPage.enterEmail("validemail@example.com");
    }

    @Then("The system accepts the input")
    public void system_accepts_input() {
        Assert.assertTrue(passwordRecoveryPage.isEmailAccepted());
    }

    @When("User clicks on the 'Submit' button")
    public void user_clicks_submit_button() {
        passwordRecoveryPage.clickSubmitButton();
    }

    @Then("A confirmation message is displayed and a recovery link is sent")
    public void confirmation_message_displayed() {
        Assert.assertTrue(passwordRecoveryPage.isConfirmationMessageDisplayed());
    }
}