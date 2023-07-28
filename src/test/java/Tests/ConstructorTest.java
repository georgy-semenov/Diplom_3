package Tests;

import Pages.MainPage;
import constance.BaseTest;
import constance.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ConstructorTest extends BaseTest {
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

    @Test
    public void getFilling() throws Exception{
        mainPage = new MainPage();
        mainPage.getFilling(text, result,number);
        mainPage.assertConstructorTrue(result, number);
    }
}
