package constance;

import Pages.WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class BaseTest {
      WebDriver driver;
    @Before
    public void setUp(){
        driver = WebDriverFactory.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
