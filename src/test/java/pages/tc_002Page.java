package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By campoNombreUsuario = By.id("username");
    By campoContrasena = By.id("password");
    By botonIniciarSesion = By.id("loginButton");
    By mensajeError = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarNombreUsuario(String nombreUsuario) {
        driver.findElement(campoNombreUsuario).sendKeys(nombreUsuario);
    }

    public void ingresarContrasena(String contrasena) {
        driver.findElement(campoContrasena).sendKeys(contrasena);
    }

    public void clicEnIniciarSesion() {
        driver.findElement(botonIniciarSesion).click();
    }

    public String obtenerMensajeError() {
        return driver.findElement(mensajeError).getText();
    }
}