package Pages;

import constance.BaseSeleniumPage;
import constance.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage extends BaseSeleniumPage {
    private final By name = By.xpath("//div/input[1]");
    private final By email = By.xpath("//div/input");
    private final By password = By.xpath("//input[@name='Пароль']");
    private final By alertMessage = By.xpath("//*[text()='Некорректный пароль']");
    private final By registrationButton = By.xpath("//button[text()='Зарегистрироваться']");
    private final By entrance = By.xpath("//div/h2[text()='Вход']");
    private final By entranceButton = By.xpath("//a[text()='Войти']");
    public RegistrationPage() {
        driver.get(Constants.REGISTRATION_URL);
        PageFactory.initElements(driver, this);
    }
    public void setName(){
        driver.findElement(name).sendKeys(Constants.NAME);
    }
    public void setEmail(){
        driver.findElements(email).get(1).sendKeys(Constants.EMAIL);
    }
    public void setOkPassword(){
        driver.findElement(password).sendKeys(Constants.OK_PASSWORD);
    }
    public void setFailPassword(){
        driver.findElement(password).sendKeys(Constants.FAIL_PASSWORD);
    }
    public void getAlertMessageWithFailPassword(){
        Assert.assertEquals(Constants.TEXT, driver.findElement(alertMessage).getText());
    }
    public void clickRegistrationButton(){
        driver.findElement(registrationButton).click();
    }
    public void elementEntranceLocate(){
        Assert.assertEquals(Constants.ENTRANCE, driver.findElement(entrance).getText());
    }
    public void clickEntranceButton(){
        WebElement element = driver.findElement(entranceButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();

    }

}
