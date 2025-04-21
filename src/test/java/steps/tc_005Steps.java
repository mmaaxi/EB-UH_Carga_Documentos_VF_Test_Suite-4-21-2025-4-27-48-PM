package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_005Page;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page pagina;

    @Given("^El usuario ha iniciado sesión con credenciales válidas$")
    public void el_usuario_ha_iniciado_sesión_con_credenciales_válidas() {
        pagina = new tc_005Page(driver);
        pagina.iniciarSesion("usuarioValido", "claveValida");
        Assert.assertTrue(pagina.esUsuarioLogueado());
    }

    @When("^El usuario hace clic en la opción 'Cerrar sesión'$")
    public void el_usuario_hace_clic_en_la_opción_cerrar_sesión() {
        pagina.cerrarSesion();
    }

    @Then("^El sistema cierra la sesión y el usuario es redirigido a la página de inicio$")
    public void el_sistema_cierra_la_sesión_y_el_usuario_es_redirigido_a_la_página_de_inicio() {
        Assert.assertTrue(pagina.esRedirigidoAPaginaInicio());
    }

    @When("^El usuario intenta acceder a una página interna sin autenticación$")
    public void el_usuario_intenta_acceder_a_una_página_interna_sin_autenticación() {
        pagina.intentarAccesoPaginaInterna();
    }

    @Then("^El sistema redirige al usuario a la página de inicio de sesión$")
    public void el_sistema_redirige_al_usuario_a_la_página_de_inicio_de_sesión() {
        Assert.assertTrue(pagina.esRedirigidoAPaginaLogin());
    }
}