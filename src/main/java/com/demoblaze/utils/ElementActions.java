package com.demoblaze.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementActions {
    private WebDriver driver;
    private  WaitsUtils waits;

    public ElementActions(WebDriver driver)
    {
        this.driver = driver;
        waits = new WaitsUtils(driver);
    }
    public void click(By locator)
    {
        waits.waitForElementToBeClickable(locator);
        driver.findElement(locator).click();
    }

    public void type(By locator, String text)
    {
        waits.waitForElementToBeVisible(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public String getText(By locator)
    {
        waits.waitForElementToBeVisible(locator);
        return driver.findElement(locator).getText();
    }

    public String getTextFromAlert()
    {
        waits.waitForAlertToBePresent();
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        waits.waitForAlertToBePresent();
        driver.switchTo().alert().accept();
    }
}
