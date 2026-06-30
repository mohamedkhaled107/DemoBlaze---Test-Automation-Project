package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.demoblaze.utils.ElementActions;

public class LoginPage {
    private WebDriver driver;
    private ElementActions elementActions;


    private final By userNameField = By.id("loginusername");
    private final By passwordField = By.id("loginpassword");
    private final By loginButton = By.xpath("//button[text()=\"Log in\"]");
    private final By welcomeMsg = By.id("nameofuser");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
elementActions = new ElementActions(driver);
    }

    public HomePage login(String userName, String password)
    {
        elementActions.type(userNameField,userName);
        elementActions.type(passwordField,password);
        elementActions.click(loginButton);
        return new HomePage(driver);
    }


   public void verifySuccessfulLogin(String userName)
   {
       String userMsg =elementActions.getText(welcomeMsg);
       Assert.assertEquals(userMsg,"Welcome "+userName);
   }

   public void verifyUnSuccessfulLoginWithEmptyField()
   {
    String alert = elementActions.getTextFromAlert();
    Assert.assertEquals(alert,"Please fill out Username and Password.");
   }

   public void verifyUnSuccessfulLoginWithInvalidUser()
   {
       String alert = elementActions.getTextFromAlert();
       Assert.assertEquals(alert,"User does not exist.");
   }

   public void verifyUnSuccessFulLoginWithUnMatchedPassword()
   {
       String alert = elementActions.getTextFromAlert();
       Assert.assertEquals(alert,"Wrong password.");
   }


}
