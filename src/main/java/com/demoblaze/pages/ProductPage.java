package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.demoblaze.utils.ElementActions;

public class ProductPage {

    private WebDriver driver;
    private ElementActions elementActions;

    //locators
    private final By addToCartButton = By.xpath("//*[text()=\"Add to cart\"]");
    private final By prductPrice = By.className("price-container");
    private final By productName = By.className("name");

    //constructor
    public ProductPage(WebDriver driver)
    {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    public String getProductNameInProductPage()
    {
        return elementActions.getText(productName);
    }
    public String getProductPriceInProductPage()
    {
        return elementActions.getText(prductPrice);
    }
    public ProductPage clickAddToCartButton()
    {
        elementActions.click(addToCartButton);
        return this;
    }
    public ProductPage acceptAlert()
    {
        elementActions.acceptAlert();
        return this;
    }

    //assertions
    public ProductPage verifyProductDetailsInProductPage(String productName, String productPrice)
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductNameInProductPage(),productName);
        softAssert.assertEquals(getProductPriceInProductPage(),productPrice);
        softAssert.assertAll();
        return new ProductPage(driver);
    }

    public ProductPage verifyProductAddToCart()
    {
        String msg = elementActions.getTextFromAlert();
        Assert.assertEquals(msg,"Product added.");
        return this;
    }



}
