package Pages;

import constance.BaseSeleniumPage;
import constance.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends BaseSeleniumPage {
    private final By entranceButton = By.xpath("//button[text()='Войти в аккаунт']");
    private final By buttonDelivery = By.xpath("//button[text()='Оформить заказ']");
    private final By personalAccount = By.xpath("//p[text()='Личный Кабинет']");
    private final By createBurger = By.xpath("//h1[text()='Соберите бургер']");
    private final By componentsInMenu = By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10']");

    public MainPage() {
        driver.get(Constants.MAINPAGE_URL);
        PageFactory.initElements(driver, this);
    }
    public void clickLoginOnMainPage(){
        driver.findElement(entranceButton).click();
    }
    public void assertButtonDelivery(){
        Assert.assertEquals(Constants.TEXT_ON_BUTTON_DELIVERY, driver.findElement(buttonDelivery).getText());
    }
    public void getInPersonalAccount(){
        driver.findElement(personalAccount).click();
    }
    public void getCreateBurger(){
        Assert.assertEquals(Constants.CREATE_BURGER, driver.findElement(createBurger).getText());
    }
    public void getFilling(String text,boolean result,int number) throws Exception{
        try {
            driver.findElement(By.xpath( "//span[text()='"+ text +"']")).click();
        } catch (Exception exception){
            Assert.assertEquals(result, driver.findElements(componentsInMenu).get(number).isDisplayed());
        }

    }
    public void assertConstructorTrue(boolean result,int number){
        Assert.assertEquals(result, driver.findElements(componentsInMenu).get(number).isDisplayed());
    }
}
