package com.leonardo.page;

import org.openqa.selenium.By;

public class MyStorePage {

    // Localizadores del Login
    public static By enlaceLogin = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a");
    public static By txtUsuaario = By.id("field-email");
    public static By txtPass = By.id("field-password");
    public static By btnIniciarSesion = By.id("submit-login");
    public static By usuarioCabecera = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span");
    public static By credencialesIncorrectas = By.xpath("//*[@id=\"content\"]/section/div/ul/li");

    // Localizadores de navegacion por categoria y subcategoria
    public static By menuCategoria = By.xpath("//*[@id=\"category-3\"]/a");
    public static By menuSubCategoria = By.xpath("//*[@id=\"category-4\"]/a");
    public static By enlaceproducto = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[2]/h2/a");
    public static By cantidad = By.xpath("<button class=\"btn btn-touchspin js-touchspin bootstrap-touchspin-up\" type=\"button\"><i class=\"material-icons touchspin-up\"></i></button>");
    public static By btnAgregarAlCarrito = By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart.js-product-add-to-cart > div > div.add > button");

    // Localizadores en el popup
    public static By msgConfirmacion = By.xpath("//*[@id=\"myModalLabel\"]/text()");
    public static By cantidadPopup = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/span[3]/strong");
    public static By subtotal = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[2]/span[2]");
    public static By precioTotal = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[4]/span[2]");
    public static By btnFinalizarPopup = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");

    // Localizadores en la pagina del carrito
    public static By tituloCarrito = By.xpath("/html/head/title");
    public static By nombreProducto = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[2]/div[1]/a");
    public static By cantidadCarrito = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[2]/div/div[1]/div/input");
    public static By precioUnidad = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[2]/div[2]/div[2]/span");
    public static By precioTotalCarrito = By.id("//*[@id=\"main\"]/div/div[2]/div[1]/div[1]/div[2]/div[2]/span[2]");

}
