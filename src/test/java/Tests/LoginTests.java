package Tests;

import Pages.*;
import constance.BaseTest;
import constance.Constants;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class LoginTests extends BaseTest {
    private MainPage mainPage;
    private LoginPage loginPage;
    private RegistrationPage registrationPage;
    private ForgotPasswordPage forgotPasswordPage;

    @Test
    public void loginOnMainPage(){
        mainPage = new MainPage();
        loginPage = new LoginPage();
        mainPage.clickLoginOnMainPage();
        loginPage.login();
        mainPage.assertButtonDelivery();
    }
    @Test
    public void loginOnPersonalAccount(){
        mainPage = new MainPage();
        loginPage = new LoginPage();
        mainPage.getInPersonalAccount();
        loginPage.login();
        mainPage.assertButtonDelivery();
    }
    @Test
    public void loginOnRegistrationPage(){
        registrationPage = new RegistrationPage();
        loginPage = new LoginPage();
        registrationPage.clickEntranceButton();
        loginPage.login();
        mainPage = new MainPage();
        mainPage.assertButtonDelivery();
    }
    @Test
    public void loginOnRecoverPassword(){
        forgotPasswordPage = new ForgotPasswordPage();
        forgotPasswordPage.clickEntranceButton();
        loginPage = new LoginPage();
        loginPage.login();
        mainPage = new MainPage();
        mainPage.assertButtonDelivery();
    }
}
