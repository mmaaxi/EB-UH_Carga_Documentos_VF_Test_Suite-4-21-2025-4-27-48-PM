package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;
import static org.junit.Assert.assertEquals;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        page = new tc_002Page(driver);
    }

    @Given("el usuario está en la página de inicio de sesión")
    public void usuarioEnPaginaInicioSesion() {
        driver.navigate().to("http://example.com/login");
    }

    @When("el usuario ingresa un nombre de usuario incorrecto")
    public void usuarioIngresaNombreUsuarioIncorrecto() {
        page.ingresarNombreUsuario("usuarioIncorrecto");
    }

    @When("el usuario ingresa una contraseña incorrecta")
    public void usuarioIngresaContrasenaIncorrecta() {
        page.ingresarContrasena("contrasenaIncorrecta");
    }

    @When("el usuario hace clic en 'Iniciar sesión'")
    public void usuarioHaceClicEnIniciarSesion() {
        page.clicEnIniciarSesion();
    }

    @Then("se muestra el mensaje de error 'Credenciales incorrectas'")
    public void muestraMensajeErrorCredencialesIncorrectas() {
        String mensajeError = page.obtenerMensajeError();
        assertEquals("Credenciales incorrectas", mensajeError);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}