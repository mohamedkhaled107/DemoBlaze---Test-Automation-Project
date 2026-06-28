package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementActions;

public class RegisterPage {

    //Locators
    private final By usernameField = By.id("sign-username");
    private final By passwordField = By.id("sign-password");
    private final By registerButton = By.cssSelector("[onclick='register()']");

    //WebDriver
    private WebDriver driver;

    //Variables
    ElementActions elementActions;

    //Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }

    public RegisterPage register(String username, String password)
    {
        elementActions.type(usernameField,username);
        elementActions.type(passwordField,password);
        elementActions.click(registerButton);
        return this;
    }

    public HomePage acceptAlert()
    {
        elementActions.acceptAlert();
        return new HomePage(driver);
    }

    public RegisterPage verifySuccessfulRegister()
    {
        String alert = elementActions.getTextFromAlert();
        Assert.assertEquals(alert,"Sign up successful.");
        return this;
    }

    public RegisterPage verifyUnSuccessfulRegisterWithInvalidUserName()
    {
        String alert = elementActions.getTextFromAlert();
        Assert.assertEquals(alert,"This user already exist.");
        return this;
    }

    public RegisterPage verifyUnsuccessfulRegisterWithEmptyField()
    {
        String alert = elementActions.getTextFromAlert();
        Assert.assertEquals(alert,"Please fill out Username and Password.");
        return this;
    }

}
