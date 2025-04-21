package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc_004Page {

    private WebDriver driver;

    // Locators
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");
    private By lockoutMessage = By.id("lockoutMessage");
    
    public Tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("https://example.com/login");
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isAttemptCounted() {
        // Placeholder for checking the attempt count logic
        return true;
    }

    public boolean isAccountLockedMessageDisplayed() {
        return driver.findElement(lockoutMessage).isDisplayed();
    }

    public String getLockoutMessage() {
        return driver.findElement(lockoutMessage).getText();
    }

    public int getUnlockTime() {
        // Return the unlock wait time, assuming 5 minutes for example
        return 5 * 60 * 1000;
    }

    public boolean isLoginSuccessful() {
        // Placeholder for verifying successful login
        return true;
    }
}