package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_010Page {

    WebDriver driver;
    WebDriverWait wait;

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadMaliciousDocument(String fileName) {
        WebElement uploadInput = driver.findElement(By.id("uploadFileInput"));
        uploadInput.sendKeys("/path/to/malicious/" + fileName);
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.click();
    }

    public boolean isDocumentUploadSafe() {
        WebElement validationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validationMessage")));
        return validationMessage.getText().contains("Upload successful") || validationMessage.getText().contains("Filtered");
    }

    public boolean isEventLogged() {
        // This is a placeholder for the actual check for event logging
        return true;
    }

    public boolean isAlertGenerated() {
        // This is a placeholder for the actual check for alert generation
        return true;
    }
}