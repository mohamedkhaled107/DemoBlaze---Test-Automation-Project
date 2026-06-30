package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

@Test
    public void validLoginTC()
{

    new HomePage(driver)
            .clickOnLoginButton()
            .login(jsonReader.getJsonData("validUser.username"),jsonReader.getJsonData("validUser.password"));
    new LoginPage(driver).verifySuccessfulLogin(jsonReader.getJsonData("validUser.username"));
}

@Test
    public void inValidLoginWithEmptyUserFieldTC()
{
    new HomePage(driver)
            .clickOnLoginButton()
            .login(jsonReader.getJsonData("emptyUsername.username"),jsonReader.getJsonData("emptyUsername.password"));
    new LoginPage(driver).verifyUnSuccessfulLoginWithEmptyField();
}
@Test
public void inValidLoginWithEmptyPasswordFieldTC()
    {
        new HomePage(driver)
                .clickOnLoginButton()
                .login(jsonReader.getJsonData("emptyPassword.username"),jsonReader.getJsonData("emptyPassword.password"));
        new LoginPage(driver).verifyUnSuccessfulLoginWithEmptyField();
    }


@Test
    public void inValidLOginWithUnMatchingPasswordTC()
{
    new HomePage(driver)
            .clickOnLoginButton()
            .login(jsonReader.getJsonData("invalidUser.username"),jsonReader.getJsonData("invalidUser.password"));
    new LoginPage(driver).verifyUnSuccessFulLoginWithUnMatchedPassword();
}


}
