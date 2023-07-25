package Tests;

import Pages.MainPage;
import constance.Constance;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
@RunWith(Parameterized.class)
public class ConstructorTest {
    private WebDriver driver;
    private MainPage mainPage;
    private final String text;
    private final int number;
    private final boolean result;

    public ConstructorTest(String text, int number, boolean result) {
        this.text = text;
        this.number = number;
        this.result = result;
    }
    @Parameterized.Parameters(name ="Ингридиент. Тестовые данные:{0}")
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Начинки", 2, true},
                {"Соусы", 1, true},
                {"Булки", 0, true}
        };
    }

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constance.MAINPAGE_URL);
    }
    @Test
    public void getFilling() throws Exception{
        mainPage = new MainPage(driver);
        mainPage.getFilling(text, result,number);
        mainPage.assertConstructorTrue(result, number);
        driver.quit();
    }
}
