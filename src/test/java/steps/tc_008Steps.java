package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_008Page;
import static org.junit.Assert.assertEquals;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page page;

    public tc_008Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_008Page.class);
    }

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("El usuario selecciona un documento que excede el tamaño máximo permitido")
    public void el_usuario_selecciona_un_documento_que_excede_el_tamano_maximo_permitido() {
        page.selectLargeFile();
    }

    @Then("El sistema identifica que el archivo es demasiado grande")
    public void el_sistema_identifica_que_el_archivo_es_demasiado_grande() {
        boolean isTooLarge = page.isFileTooLarge();
        assertEquals(true, isTooLarge);
    }

    @When("El usuario intenta cargar el documento")
    public void el_usuario_intenta_cargar_el_documento() {
        page.uploadFile();
    }

    @Then("Se muestra un mensaje de error indicando 'El archivo excede el tamaño permitido'")
    public void se_muestra_un_mensaje_de_error_indicando_el_archivo_excede_el_tamano_permitido() {
        String errorMessage = page.getErrorMessage();
        assertEquals("El archivo excede el tamaño permitido", errorMessage);
    }
}