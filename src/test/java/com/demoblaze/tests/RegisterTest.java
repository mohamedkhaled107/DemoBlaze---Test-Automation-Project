package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void verifySuccessfulRegisterWithVailData()
    {
        new HomePage(driver)
                .clickOnRegisterButton()
                .register("mohamed1458","147852");
        new RegisterPage(driver).verifySuccessfulRegister();
    }
    @Test
    public void verifyUnsuccessfulRegisterWithEmptyUserField()
    {
        new HomePage(driver)
                .clickOnRegisterButton()
                .register("","147852");
        new RegisterPage(driver).verifyUnsuccessfulRegisterWithEmptyField();
    }
    @Test
    public void verifyUnsuccessfulRegisterWithEmptyPasswordField()
    {
        new HomePage(driver)
                .clickOnRegisterButton()
                .register("mohamed123","");
        new RegisterPage(driver).verifyUnsuccessfulRegisterWithEmptyField();
    }
    @Test
    public void verifyUnSuccessfulRegisterWithAlreadyUsedUser()
    {
        new HomePage(driver)
                .clickOnRegisterButton()
                .register("mohamed1231","15909");
        new RegisterPage(driver).verifyUnSuccessfulRegisterWithInvalidUserName();
    }
}
