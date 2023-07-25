package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By entranceButton = By.xpath("//a[text()='Войти']");
    public void clickEntranceButton(){
        driver.findElement(entranceButton).click();
    }
}
