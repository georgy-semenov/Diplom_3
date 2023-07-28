package Pages;

import constance.BaseSeleniumPage;
import constance.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseSeleniumPage {
    private final By loginField = By.xpath("//input[@class='text input__textfield text_type_main-default']");
    private final By entranceButton = By.xpath("//button[text()='Войти']");
    private final By registrationButton = By.xpath("//a[text()='Зарегистрироваться']");
    private final By forgotPassword = By.xpath("//a[text()='Восстановить пароль']");

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    public void setEmail(){
        driver.findElements(loginField).get(0).sendKeys(Constants.USERNAME);
    }
    public void setPassword(){
        driver.findElements(loginField).get(1).sendKeys(Constants.PASSWORD);
    }
    public void clickEntranceButton(){
        driver.findElement(entranceButton).click();
    }
    public void clickRegButton(){
        driver.findElement(registrationButton).click();
    }
    public void clickForgotButton(){
        driver.findElement(forgotPassword).click();
    }
    public void login(){
        setEmail();
        setPassword();
        clickEntranceButton();
    }
}
