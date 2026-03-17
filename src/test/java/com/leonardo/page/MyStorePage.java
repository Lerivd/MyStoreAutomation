package com.leonardo.page;

import org.openqa.selenium.By;

public class MyStorePage {

    // Localizadores del Login
    public static By enlaceLogin = By.xpath("//*[@id='_desktop_user_info']/div/a");
    public static By txtUsuaario = By.id("field-email");
    public static By txtPass = By.id("field-password");
    public static By btnIniciarSesion = By.id("submit-login");
    public static By usuarioCabecera = By.xpath("//*[@id='_desktop_user_info']/div/a[2]/span");
    public static By credencialesIncorrectas = By.xpath("//*[@id='content']/section/div/ul/li");

    // Localizadores de navegacion por categoria y subcategoria
    public static By menuCategoria = By.xpath("//*[@id='category-3']/a");
    public static By menuSubCategoria = By.xpath("//*[@id='left-column']/div[1]/ul/li[2]/ul/li[1]/a");
    public static By enlaceproducto = By.xpath("//*[@id='js-product-list']/div[1]/div/article/div/div[2]/h2/a");
    public static By aumentarUnidad = By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div/div[1]/div/span[3]/button[1]");
    public static By btnAgregarAlCarrito = By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart.js-product-add-to-cart > div > div.add > button");

    // Localizadores en el popup
    public static By msgConfirmacion = By.xpath("//h4[@id='myModalLabel']");
    public static By cantidadPopup = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[1]/div/div[2]/span[3]/strong");
    public static By precioUnidadPopup = By.xpath("//p[@class='product-price']");
    public static By precioTotalPopup = By.xpath("//p[@class='product-total']/span[@class='value']");
    public static By btnFinalizarPopup = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a");

    // Localizadores en la pagina del carrito
    public static By tituloCarrito = By.xpath("/html/head/title");
    public static By nombreProducto = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[1]/div/div[2]/h6");
    public static By cantidadCarrito = By.xpath("//div[@id='cart-subtotal-products']/span[@class='label js-subtotal']");
    public static By precioUnidadCarrito = By.xpath("//*[@id='main']/div/div[1]/div/div[2]/ul/li/div/div[2]/div[2]/div[2]/span");
    public static By precioTotalCarrito = By.cssSelector("#main > div > div.cart-grid-right.col-lg-4 > div.card.cart-summary > div.cart-detailed-totals.js-cart-detailed-totals > div.card-block.cart-summary-totals.js-cart-summary-totals > div.cart-summary-line.cart-total > span.value");

}
