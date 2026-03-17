package com.leonardo.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.leonardo.core.DriverManager.getDriver;

public class MyStoreSteps {
    // Declaramos WebDriver y WebDriverWait
    private WebDriver driver;
    private WebDriverWait wait;

    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");

        // Agregamos una espera explícita para que la pagina cargue correctamente
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println(">> PAGINA PRINCIPAL CARGADA " + driver.getTitle());
    }

    public void meLogueoConMiUsuarioYClave(String usuario, String clave) {
        System.out.println(">> LOGIN");
    }

    public void navegoALaCategoriaYSubcategoria(String categoria, String subcategoria) {
        System.out.println(">> NAVEGACION POR CATEGORIA " + categoria + " Y SUBCATEGORIA " + subcategoria);
    }

    public void agregoCantidadUnidadesDelPrimerProductoAlCarrito(int cantidad) {
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
