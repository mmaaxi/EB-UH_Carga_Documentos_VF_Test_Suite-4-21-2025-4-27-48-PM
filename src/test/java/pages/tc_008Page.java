package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {
    WebDriver driver;

    By fileInput = By.id("fileUpload");
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectLargeFile() {
        driver.findElement(fileInput).sendKeys("/path/to/large/file");
    }

    public boolean isFileTooLarge() {
        // Logic to determine if file is too large
        return driver.findElement(fileInput).getAttribute("class").contains("file-too-large");
    }

    public void uploadFile() {
        driver.findElement(uploadButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}