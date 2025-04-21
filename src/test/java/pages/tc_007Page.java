package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {

    WebDriver driver;

    By uploadField = By.id("upload");
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("error");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectFileWithInvalidFormat() {
        WebElement uploadElement = driver.findElement(uploadField);
        uploadElement.sendKeys("C:\\path\\to\\file.exe");
    }

    public void attemptToUploadFile() {
        driver.findElement(uploadButton).click();
    }

    public boolean isFileRejected() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}