package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;

    By forgotPasswordLink = By.linkText("Forgot Password");
    By emailField = By.id("email");
    By submitButton = By.id("submit");
    By confirmationMessage = By.id("confirmationMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

    public boolean isPasswordRecoveryPageDisplayed() {
        return driver.getCurrentUrl().contains("password-recovery");
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public boolean isEmailAccepted() {
        return driver.findElement(emailField).getAttribute("value").equals("validemail@example.com");
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }
}