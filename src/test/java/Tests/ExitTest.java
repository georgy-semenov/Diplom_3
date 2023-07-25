package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.PersonalAccount;
import Pages.RegistrationPage;
import constance.Constance;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ExitTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private MainPage mainPage;
    private PersonalAccount personalAccount;
    private RegistrationPage registrationPage;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(Constance.MAINPAGE_URL);
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        mainPage.clickLoginOnMainPage();
        loginPage.login();
    }
    @Test
    public void getExit(){
        mainPage = new MainPage(driver);
        personalAccount = new PersonalAccount(driver);
        registrationPage = new RegistrationPage(driver);
        mainPage.getInPersonalAccount();
        personalAccount.clickExitButton();
        registrationPage.elementEntranceLocate();
        driver.quit();
    }
}
