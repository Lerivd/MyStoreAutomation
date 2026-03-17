package com.leonardo.stepsdefinitions;

import com.leonardo.steps.MyStoreSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStoreStepsDef {
    // Llamamos a Step para mandar los datos a la logica
    MyStoreSteps myStoreSteps;

    @Given("estoy en la pagina de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        myStoreSteps = new MyStoreSteps();
        myStoreSteps.estoyEnLaPaginaDeLaTienda();
    }

    @And("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String usuario, String clave) {
        myStoreSteps.meLogueoConMiUsuarioYClave(usuario, clave);
    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String categoria, String subcategoria) {
        myStoreSteps.navegoALaCategoriaYSubcategoria(categoria, subcategoria);
    }

    @And("agrego {int} unidades del primer producto al carrito")
    public void agregoCantidadUnidadesDelPrimerProductoAlCarrito(int cantidad) {
        myStoreSteps.agregoCantidadUnidadesDelPrimerProductoAlCarrito(cantidad);
    }

    @Then("valido en el popup la confirmacion del producto agregado")
    public void validoEnElPopupLaConfirmacionDelProductoAgregado() {
        myStoreSteps.validoEnElPopupLaConfirmacionDelProductoAgregado();
    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        myStoreSteps.validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente();
    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
        myStoreSteps.finalizoLaCompra();
    }

    @Then("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
        myStoreSteps.validoElTituloDeLaPaginaDelCarrito();
    }

    @And("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
        myStoreSteps.vuelvoAValidarElCalculoDePreciosEnElCarrito();
    }
}
