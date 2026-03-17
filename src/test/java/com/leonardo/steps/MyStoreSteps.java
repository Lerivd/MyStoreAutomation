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

    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");

        // Agregamos una espera explícita para que la pagina cargue correctamente
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        screenShot();
        System.out.println(">> PAGINA PRINCIPAL CARGADA " + driver.getTitle().toUpperCase());
    }

    public void meLogueoConMiUsuarioYClave(String usuario, String clave) {
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.enlaceLogin)).click();
        esperaImplicita();
        wait.until(ExpectedConditions.urlContains("iniciar-sesion"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.txtUsuaario)).sendKeys(usuario);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.txtPass)).sendKeys(clave);
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.btnIniciarSesion)).click();

        // Validamos si el nombre de usuario aparece en la cabecera:
        Assertions.assertFalse(
                wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.usuarioCabecera)).getText().isEmpty(),
                "El nombre de usuario no aparece en la cabecera"
        );
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

        System.out.println(">> NAVEGACION POR CATEGORIA " + categoria.toUpperCase() + " Y SUBCATEGORIA " + subcategoria.toUpperCase());
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

        Assertions.assertTrue(
                wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.msgConfirmacion)).getText().contains("Producto añadido correctamente"),
                "El mensaje de confirmacion no se muestra"
        );
        screenShot();
        System.out.println(">> VALIDAMOS LA CONFIRMACION DEL PRODUCTO AGREGADO");
    }

    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        int cantidadPopup = Integer.parseInt(wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.cantidadPopup)).getText());
        double precioUnidadPopup = Double.parseDouble(wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.precioUnidadPopup)).getText().replace("PEN", "").replace(",", "").trim());
        double totalPopup = cantidadPopup * precioUnidadPopup;

        // Validamos que el resultado sea el mismo
        Assertions.assertEquals(
                totalPopup,
                Double.parseDouble(wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.precioTotalPopup)).getText().replace("PEN", "").replace(",", "").trim()),
                "El monto total que se muestra en el popup es incorrecto"
        );
        screenShot();
        System.out.println(">> VALIDAMOS MONTO TOTAL");
    }

    public void finalizoLaCompra() {
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.btnFinalizarPopup)).click();
        System.out.println(">> FINALIZAMOS COMPRA");
    }

    public void validoElTituloDeLaPaginaDelCarrito() {
        Assertions.assertTrue(
                wait.until(ExpectedConditions.urlContains("carrito")),
                "Validacion correcta"
        );
        System.out.println(">> VALIDAMOS QUE ESTAMOS EN EL CARRITO");
    }

    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
        int cantidadCarrito = Integer.parseInt(wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.cantidadCarrito)).getText().replace("artículos", "").trim());
        double precioCarrito = Double.parseDouble(wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.precioUnidadCarrito)).getText().replace("PEN", "").replace(",", "").trim());
        double totalCarrito = cantidadCarrito * precioCarrito;

        // Validamos que el resultado sea el mismo
        Assertions.assertEquals(
                totalCarrito,
                Double.parseDouble(wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.precioTotalCarrito)).getText().replace("PEN", "").replace(",", "").trim()),
                "El monto total que se muestra en el carrito es incorrecto"
        );
        System.out.println(">> VALIDAMOS EL CALCULO DE PRECIOS EN EL CARRITO");
    }
}
