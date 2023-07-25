package Pages;

import constance.Constance;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAccount {
    private WebDriver driver;
    private final By exitButton = By.xpath("//button[text()='Выход']");
    private final By profile = By.xpath("//a[text()='Профиль']");
    private final By logo = By.className("AppHeader_header__logo__2D0X2");
    private final By constructor = By.xpath("//p[text()='Конструктор']");

    public PersonalAccount(WebDriver driver) {
        this.driver = driver;
    }
    public void clickExitButton(){
        driver.findElement(exitButton).click();
    }
    public void assertProfile(){
        Assert.assertEquals(Constance.PROFILE_TEXT, driver.findElement(profile).getText());
    }
    public void clickLogo(){
        driver.findElement(logo).click();
    }
    public void clickConstructor(){
        driver.findElement(constructor).click();
    }
}
