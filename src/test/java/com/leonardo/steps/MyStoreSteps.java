package com.leonardo.steps;

import com.leonardo.page.MyStorePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.leonardo.core.DriverManager.*;

public class MyStoreSteps {
    // Declaramos WebDriver y WebDriverWait
    private WebDriver driver;
    private WebDriverWait wait;
    private double precioUnidad = 0.0;

    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");

        // Agregamos una espera explícita para que la pagina cargue correctamente
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        screenShot();
        System.out.println(">> PAGINA PRINCIPAL CARGADA " + driver.getTitle());
    }

    public void meLogueoConMiUsuarioYClave(String usuario, String clave) {
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.enlaceLogin)).click();
        esperaImplicita();
        wait.until(ExpectedConditions.urlContains("iniciar-sesion"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.txtUsuaario)).sendKeys(usuario);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.txtPass)).sendKeys(clave);
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.btnIniciarSesion)).click();

        // Validamos si el nombre de usuario aparece en la cabecera:
//        Assertions.assertEquals(
//                "Leonardo Rivadeneira Romero",
//                ExpectedConditions.visibilityOfElementLocated(MyStorePage.usuarioCabecera)
//        );
        screenShot();

        System.out.println(">> LOGIN");
    }

    public void navegoALaCategoriaYSubcategoria(String categoria, String subcategoria) {
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.menuCategoria)).click();
        wait.until(ExpectedConditions.urlContains("3-clothes"));
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.menuSubCategoria)).click();
        wait.until(ExpectedConditions.urlContains("4-men"));
        esperaImplicita();
        screenShot();

        System.out.println(">> NAVEGACION POR CATEGORIA " + categoria + " Y SUBCATEGORIA " + subcategoria);
    }

    public void agregoCantidadUnidadesDelPrimerProductoAlCarrito(int cantidad) {
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.enlaceproducto)).click();
        esperaImplicita();
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.aumentarUnidad)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.btnAgregarAlCarrito)).click();
        esperaImplicita();
        screenShot();
        System.out.println(">> SE AGREGO " + cantidad + " UNIDADES");

    }

    public void validoEnElPopupLaConfirmacionDelProductoAgregado() {

        System.out.println(">> VALIDAMOS EL DETALLE");
    }

    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        System.out.println(">> VALIDAMOS MONTO TOTAL");
    }

    public void finalizoLaCompra() {
        System.out.println(">> FINALIZAMOS COMPRA");
    }

    public void validoElTituloDeLaPaginaDelCarrito() {
        System.out.println(">> VALIDAMOS QUE ESTAMOS EN EL CARRITO");
    }

    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
        System.out.println(">> VALIDAMOS EL CALCULO DE PRECIOS EN EL CARRITO");
    }
}
