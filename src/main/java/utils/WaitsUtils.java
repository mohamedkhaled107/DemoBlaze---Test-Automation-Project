package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WaitsUtils {


    Wait<WebDriver> wait;

    public WaitsUtils (WebDriver driver)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void waitForElementToBeVisible(By locator) {
        // Implement logic to wait for an element to be visible3
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitForElementToBeClickable(By locator) {
        // Implement logic to wait for an element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForAlertToBePresent() {
        // Implement logic to wait for an alert to be present
        wait.until(ExpectedConditions.alertIsPresent());
    }
}