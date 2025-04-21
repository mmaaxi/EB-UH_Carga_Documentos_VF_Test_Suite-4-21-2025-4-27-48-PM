package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {

    WebDriver driver;

    By documentoSelector = By.id("documentSelector");
    By descargarBoton = By.id("descargar");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarDocumento() {
        WebElement documento = driver.findElement(documentoSelector);
        documento.click();
    }

    public void clickDescargarDocumento() {
        WebElement descargar = driver.findElement(descargarBoton);
        descargar.click();
    }

    public void validarDescarga() {
        // Aquí se implementaría la lógica para validar que el documento fue descargado
    }
}