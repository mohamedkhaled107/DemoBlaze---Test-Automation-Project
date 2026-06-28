package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;

public class HomePage {

    //Locators
    private final By loginButton = By.id("login2");
    private By registerButton = By.id("signin2");
    private By cartButton = By.id("cartur");
    private WebDriver driver;
    private ElementActions elementActions;

    //Dynamic locator
    private By product(String productName) {
        return By.xpath("//a[.='" + productName + "']");
    }

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }


    //Actions
    public LoginPage clickOnLoginButton() {
        elementActions.click(loginButton);
        return new LoginPage(driver);
    }

    public RegisterPage clickOnRegisterButton() {
        elementActions.click(registerButton);
        return new RegisterPage(driver);
    }
    public CartPage clickOnCartButton() {
        elementActions.click(cartButton);
        return new CartPage(driver);
    }

    public ProductPage clickOnProduct(String productName)
    {
        elementActions.click(product(productName));
        return new ProductPage(driver);
    }


}
