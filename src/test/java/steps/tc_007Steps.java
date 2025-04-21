package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("selecciona un documento con formato .exe")
    public void selecciona_un_documento_con_formato_exe() {
        page.selectFileWithInvalidFormat();
    }

    @When("intenta cargar el documento")
    public void intenta_cargar_el_documento() {
        page.attemptToUploadFile();
    }

    @Then("el sistema rechaza el archivo")
    public void el_sistema_rechaza_el_archivo() {
        Assert.assertTrue(page.isFileRejected());
    }

    @Then("se muestra un mensaje indicando 'Formato de archivo no permitido'")
    public void se_muestra_un_mensaje_indicando_formato_de_archivo_no_permitido() {
        Assert.assertEquals("Formato de archivo no permitido", page.getErrorMessage());
    }
}