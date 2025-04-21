package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page uploadPage = new tc_006Page(driver);

    @Given("el usuario tiene un documento PDF válido")
    public void elUsuarioTieneUnDocumentoPDFValido() {
        // Asumiendo que el documento ya existe en el sistema de archivos
        uploadPage.prepareValidPDFDocument();
    }

    @When("selecciona el documento")
    public void seleccionaElDocumento() {
        uploadPage.selectDocument();
    }

    @Then("el sistema debe reconocer el formato y mostrar una vista previa")
    public void elSistemaDebeReconocerElFormatoYMostrarUnaVistaPrevia() {
        Assert.assertTrue(uploadPage.isPreviewDisplayed());
    }

    @When("el usuario hace clic en 'Cargar documento'")
    public void elUsuarioHaceClicEnCargarDocumento() {
        uploadPage.clickUploadButton();
    }

    @Then("el sistema debe procesar la carga y mostrar un mensaje de éxito")
    public void elSistemaDebeProcesarLaCargaYMostrarUnMensajeDeExito() {
        Assert.assertTrue(uploadPage.isUploadSuccessful());
    }
}