package Tests;

import Pages.RegistrationPage;
import constance.Constance;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationPageTest {
    private WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constance.REGISTRATION_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void getPositiveRegistration(){
        RegistrationPage r = new RegistrationPage(driver);
        r.setName();
        r.setEmail();
        r.setOkPassword();
        r.clickRegistrationButton();
        r.elementEntranceLocate();
    }
    @Test
    public void getFailRegistration(){
        RegistrationPage r = new RegistrationPage(driver);
        r.setName();
        r.setEmail();
        r.setFailPassword();
        r.clickRegistrationButton();
        r.getAlertMessageWithFailPassword();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
