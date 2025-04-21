package steps;

import org.openqa.selenium.WebDriver;
import pages.tc_001Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page loginPage = new tc_001Page(driver);

    @Given("El usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        loginPage.navigateToLoginPage();
    }

    @When("El usuario ingresa un nombre de usuario válido")
    public void el_usuario_ingresa_un_nombre_de_usuario_válido() {
        loginPage.enterUsername("usuario_valido");
    }

    @When("El usuario ingresa una contraseña válida")
    public void el_usuario_ingresa_una_contraseña_válida() {
        loginPage.enterPassword("contraseña_valida");
    }

    @When("El usuario hace clic en el botón 'Iniciar sesión'")
    public void el_usuario_hace_clic_en_el_botón_iniciar_sesión() {
        loginPage.clickLoginButton();
    }

    @Then("El usuario es redirigido a la página principal del sistema")
    public void el_usuario_es_redirigido_a_la_página_principal_del_sistema() {
        Assert.assertTrue("El usuario no se redirigió a la página principal", loginPage.isUserRedirectedToHomePage());
    }
}