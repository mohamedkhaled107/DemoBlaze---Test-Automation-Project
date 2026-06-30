package com.demoblaze.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.JsonReader;

public class BaseTest {
    protected JsonReader jsonReader;
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        jsonReader =new JsonReader("login-data");
        //Initialize WebDriver and navigate to the login page
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
