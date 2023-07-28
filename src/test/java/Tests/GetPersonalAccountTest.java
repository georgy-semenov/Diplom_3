package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.PersonalAccount;
import constance.BaseTest;
import constance.Constants;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class GetPersonalAccountTest extends BaseTest {

    private LoginPage loginPage;
    private MainPage mainPage;
    private PersonalAccount personalAccount;

    @Test
    public void getInPersonalAccount(){
        loginPage = new LoginPage();
        mainPage = new MainPage();
        mainPage.clickLoginOnMainPage();
        loginPage.login();
        mainPage = new MainPage();
        personalAccount = new PersonalAccount();
        mainPage.getInPersonalAccount();
        personalAccount.assertProfile();
    }
}
