package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.PersonalAccount;
import constance.Constance;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetPersonalAccountTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private MainPage mainPage;
    private PersonalAccount personalAccount;
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
    public void getInPersonalAccount(){
        mainPage = new MainPage(driver);
        personalAccount = new PersonalAccount(driver);
        mainPage.getInPersonalAccount();
        personalAccount.assertProfile();
    }
    @After
    public void tearDown(){
        driver.quit();
    }


}
