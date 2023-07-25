package Tests;

import Pages.*;
import constance.Constance;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;
    private MainPage mainPage;
    private LoginPage loginPage;
    private RegistrationPage registrationPage;
    private ForgotPasswordPage forgotPasswordPage;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void loginOnMainPage(){
        driver.get(Constance.MAINPAGE_URL);
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        mainPage.clickLoginOnMainPage();
        loginPage.login();
        mainPage.assertButtonDelivery();
    }
    @Test
    public void loginOnPersonalAccount(){
        driver.get(Constance.MAINPAGE_URL);
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        mainPage.getInPersonalAccount();
        loginPage.login();
        mainPage.assertButtonDelivery();
    }
    @Test
    public void loginOnRegistrationPage(){
        driver.get(Constance.REGISTRATION_URL);
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        registrationPage.clickEntranceButton();
        loginPage.login();
        mainPage.assertButtonDelivery();
    }
    @Test
    public void loginOnRecoverPassword(){
        driver.get(Constance.FORGOR_PASSWORD_URL);
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
        forgotPasswordPage.clickEntranceButton();
        loginPage.login();
        mainPage.assertButtonDelivery();
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
