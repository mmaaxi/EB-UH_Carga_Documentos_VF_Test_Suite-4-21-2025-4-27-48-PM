package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {
    WebDriver driver;

    By documentInput = By.id("documentUploadInput");
    By previewSection = By.id("previewSection");
    By uploadButton = By.id("uploadButton");
    By successMessage = By.id("successMessage");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void prepareValidPDFDocument() {
        // Aquí se puede simular la existencia de un documento PDF que va a ser usado
    }

    public void selectDocument() {
        driver.findElement(documentInput).sendKeys("/path/to/valid.pdf");
    }

    public boolean isPreviewDisplayed() {
        return driver.findElement(previewSection).isDisplayed();
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }
}