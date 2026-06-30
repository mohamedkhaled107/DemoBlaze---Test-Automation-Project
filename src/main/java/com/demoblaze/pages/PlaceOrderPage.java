package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.demoblaze.utils.ElementActions;

public class PlaceOrderPage {

    private WebDriver driver;
    private ElementActions elementActions;

    private final By nameFiled = By.id("name");
    private final By countryField = By.id("country");
    private final By cityField = By.id("city");
    private final By creditCardField = By.id("card");
    private final By monthField = By.id("month");
    private final By yearField = By.id("year");
    private final By purchaseButton = By.xpath("//*[text()=\"Purchase\"]");

    private final By orderConfirmationMessage = By.cssSelector("[data-has-done-function=\"true\"] > h2");


    public PlaceOrderPage(WebDriver driver)
    {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    //Actions
    public PlaceOrderPage sumbitPLaceOrderForm(String name, String country, String city, String creditCard, String month, String year)
    {
        elementActions.type(nameFiled,name);
        elementActions.type(countryField,country);
        elementActions.type(cityField,city);
        elementActions.type(creditCardField,creditCard);
        elementActions.type(monthField,month);
        elementActions.type(yearField,year);
        elementActions.click(purchaseButton);
        return this;
    }

    //Assertions
    public void verifyConfirmationMessage()
    {
        String messageText = elementActions.getText(orderConfirmationMessage);
        Assert.assertEquals(messageText,"Thank you for your purchase!");
    }


}
