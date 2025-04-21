package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.Tc_004Page;

public class Tc_004Steps {

    private WebDriver driver;
    private Tc_004Page loginPage;

    public Tc_004Steps() {
        // Initialization of WebDriver
        this.driver = Hooks.getDriver();
        loginPage = new Tc_004Page(driver);
    }

    @Given("la página de inicio de sesión está abierta")
    public void pagina_de_inicio_de_sesion_esta_abierta() {
        loginPage.navigateToLoginPage();
    }

    @When("el usuario intenta iniciar sesión con credenciales incorrectas tres veces consecutivas")
    public void intento_login_con_credenciales_incorrectas() {
        for (int i = 0; i < 3; i++) {
            loginPage.login("usuario_incorrecto", "contrasena_incorrecta");
        }
    }

    @Then("el sistema contabiliza los intentos fallidos")
    public void sistema_contabiliza_intentos_fallidos() {
        Assert.assertTrue(loginPage.isAttemptCounted());
    }

    @And("el usuario verifica el mensaje de bloqueo de cuenta")
    public void verifica_mensaje_bloqueo_de_cuenta() {
        Assert.assertTrue(loginPage.isAccountLockedMessageDisplayed());
    }

    @Then("se muestra el mensaje 'Cuenta bloqueada temporalmente por seguridad'")
    public void se_muestra_mensaje_de_cuenta_bloqueada() {
        Assert.assertEquals("Cuenta bloqueada temporalmente por seguridad", loginPage.getLockoutMessage());
    }

    @When("el usuario espera el tiempo definido para desbloqueo e intenta nuevamente")
    public void espera_y_intenta_nuevamente() throws InterruptedException {
        Thread.sleep(loginPage.getUnlockTime());
        loginPage.login("usuario_correcto", "contrasena_correcta");
    }

    @Then("el sistema permite el inicio de sesión tras el desbloqueo")
    public void sistema_permita_inicio_de_sesion() {
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }
}