package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("El usuario ha seleccionado un documento previamente cargado")
    public void seleccionar_documento_previamente_cargado() {
        page.seleccionarDocumento();
    }

    @When("El usuario hace clic en \"Descargar documento\"")
    public void hacer_clic_en_descargar_documento() {
        page.clickDescargarDocumento();
    }

    @Then("El documento se descarga correctamente al dispositivo del usuario")
    public void validar_descarga_documento() {
        page.validarDescarga();
    }
}