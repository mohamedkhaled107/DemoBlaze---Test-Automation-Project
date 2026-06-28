package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{
    String username = "automation_" + System.currentTimeMillis(); //Dynamic test data to ensure uniqueness
    String password = "12345678";
    String productName = "HTC One M9";
    String productPrice = "700";

    @Test
    public void verifyCartFunctionality() {
        //Register
        new HomePage(driver)
                .clickOnRegisterButton()
                .register(username,password)
                .verifySuccessfulRegister()
                .acceptAlert()
        //Login
                .clickOnLoginButton()
                .login(username,password);
        new LoginPage(driver).verifySuccessfulLogin(username);
        //add to cart
        new HomePage(driver)
                .clickOnProduct(productName)
                .clickAddToCartButton()
                .verifyProductAddToCart()
                .acceptAlert();
        //check product in cart page
        new HomePage(driver)
                .clickOnCartButton()
                .verifyProductDetails(productName,productPrice);
    }
}
