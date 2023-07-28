package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.PersonalAccount;
import Pages.RegistrationPage;
import constance.BaseTest;
import org.junit.Test;



public class ExitTest extends BaseTest {
    private LoginPage loginPage;
    private MainPage mainPage;
    private PersonalAccount personalAccount;
    private RegistrationPage registrationPage;

    @Test
    public void getExit(){
        mainPage = new MainPage();
        mainPage.clickLoginOnMainPage();
        loginPage = new LoginPage();
        loginPage.login();
        mainPage = new MainPage();
        personalAccount = new PersonalAccount();
        registrationPage = new RegistrationPage();
        mainPage.getInPersonalAccount();
        personalAccount.clickExitButton();
        registrationPage.elementEntranceLocate();
    }
}
