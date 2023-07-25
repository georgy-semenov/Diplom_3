package Pages;

import constance.Constance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By loginField = By.xpath("//input[@class='text input__textfield text_type_main-default']");
    private final By entranceButton = By.xpath("//button[text()='Войти']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmail(){
        driver.findElements(loginField).get(0).sendKeys(Constance.USERNAME);
    }
    public void setPassword(){
        driver.findElements(loginField).get(1).sendKeys(Constance.PASSWORD);
    }
    public void clickEntranceButton(){
        driver.findElement(entranceButton).click();
    }
    public void login(){
        setEmail();
        setPassword();
        clickEntranceButton();
    }
}
