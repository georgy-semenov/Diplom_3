package Pages;

import constance.BaseSeleniumPage;
import constance.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PersonalAccount extends BaseSeleniumPage {
    private final By exitButton = By.xpath("//button[text()='Выход']");
    private final By profile = By.xpath("//a[text()='Профиль']");
    private final By logo = By.className("AppHeader_header__logo__2D0X2");
    private final By constructor = By.xpath("//p[text()='Конструктор']");

    public PersonalAccount() {
        driver.get(Constants.MAINPAGE_URL);
        PageFactory.initElements(driver, this);
    }
    public PersonalAccount clickExitButton(){
        driver.findElement(exitButton).click();
        return this;
    }
    public PersonalAccount assertProfile(){
        Assert.assertEquals(Constants.PROFILE_TEXT, driver.findElement(profile).getText());
        return this;
    }
    public PersonalAccount clickLogo(){
        driver.findElement(logo).click();
        return this;
    }
    public PersonalAccount clickConstructor(){
        driver.findElement(constructor).click();
        return this;
    }
}
