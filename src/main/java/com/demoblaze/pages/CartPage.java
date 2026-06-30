package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import com.demoblaze.utils.ElementActions;

public class CartPage {
    private WebDriver driver;
    private ElementActions elementActions;

    //locators
    private final By placeOrderButton = By.xpath("//*[text()=\"Place Order\"]");
    private final By totalPriceValue = By.id("totalp");
    private final By productName = By.cssSelector(".success>td:nth-child(2)");
    private final By productPrice = By.cssSelector(".success>td:nth-child(3)");

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    public PlaceOrderPage clickPlaceOrderButton()
    {
        elementActions.click(placeOrderButton);
        return new PlaceOrderPage(driver);
    }
    public String getProductNameInCart()
    {
        return elementActions.getText(productName);
    }
    public String getProductPriceInCart()
    {
        return elementActions.getText(productPrice);
    }
    public String getTotalPrice()
    {
        return elementActions.getText(totalPriceValue);
    }

    //Assertions
    public CartPage verifyProductDetails(String productName, String productPrice)
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductNameInCart(),productName);
        softAssert.assertEquals(getProductPriceInCart(),productPrice);
        softAssert.assertAll();
        return this;
    }

}
