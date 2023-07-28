package Pages;

import constance.BaseSeleniumPage;
import constance.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends BaseSeleniumPage {
    public ForgotPasswordPage() {
        driver.get(Constants.FORGOR_PASSWORD_URL);
        PageFactory.initElements(driver, this);
    }
    private final By entranceButton = By.xpath("//a[text()='Войти']");
    public void clickEntranceButton(){
        driver.findElement(entranceButton).click();
    }
}
