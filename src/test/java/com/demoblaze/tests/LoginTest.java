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
            .login("mohamed1231","123456789");
    new LoginPage(driver).verifySuccessfulLogin("mohamed1231");
}

@Test
    public void inValidLoginWithEmptyUserFieldTC()
{
    new HomePage(driver)
            .clickOnLoginButton()
            .login("","mohamed123");
    new LoginPage(driver).verifyUnSuccessfulLoginWithEmptyField();
}
@Test
public void inValidLoginWithEmptyPasswordFieldTC()
    {
        new HomePage(driver)
                .clickOnLoginButton()
                .login("mohamed1231","");
        new LoginPage(driver).verifyUnSuccessfulLoginWithEmptyField();
    }


@Test
    public void inValidLOginWithUnMatchingPasswordTC()
{
    new HomePage(driver)
            .clickOnLoginButton()
            .login("mohamed1231","123456");
    new LoginPage(driver).verifyUnSuccessFulLoginWithUnMatchedPassword();
}


}
