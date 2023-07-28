package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.PersonalAccount;
import constance.BaseTest;
import org.junit.Test;



public class MoveToConstructorTest extends BaseTest {
    private LoginPage loginPage;
    private MainPage mainPage;
    private PersonalAccount personalAccount;

    @Test
    public void getConstructorOnClickLogo(){
        loginPage = new LoginPage();
        mainPage = new MainPage();
        mainPage.clickLoginOnMainPage();
        loginPage.login();
        mainPage.getInPersonalAccount();
        personalAccount = new PersonalAccount();
        mainPage = new MainPage();
        personalAccount.clickLogo();
        mainPage.getCreateBurger();
    }
    @Test
    public void getConstructorOnClickConstructor(){
        loginPage = new LoginPage();
        mainPage = new MainPage();
        mainPage.clickLoginOnMainPage();
        loginPage.login();
        mainPage.getInPersonalAccount();
        personalAccount = new PersonalAccount();
        mainPage = new MainPage();
        personalAccount.clickConstructor();
        mainPage.getCreateBurger();
    }
}
