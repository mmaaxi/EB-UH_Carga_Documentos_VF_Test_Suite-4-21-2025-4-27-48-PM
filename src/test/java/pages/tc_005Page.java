package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    WebDriver driver;

    By loginButton = By.id("loginButton");
    By logoutButton = By.id("logoutButton");
    By internalPageLink = By.id("internalPageLink");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarSesion(String usuario, String clave) {
        // Lógica para iniciar sesión
    }

    public boolean esUsuarioLogueado() {
        // Verificar si el usuario está logueado
        return true;
    }

    public void cerrarSesion() {
        driver.findElement(logoutButton).click();
    }

    public boolean esRedirigidoAPaginaInicio() {
        // Verificar redirección a página de inicio
        return true;
    }

    public void intentarAccesoPaginaInterna() {
        driver.findElement(internalPageLink).click();
    }

    public boolean esRedirigidoAPaginaLogin() {
        // Verificar redirección a la página de login
        return true;
    }
}