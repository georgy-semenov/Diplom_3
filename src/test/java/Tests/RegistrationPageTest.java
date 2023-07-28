package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.RegistrationPage;
import constance.BaseTest;
import org.junit.Test;



public class RegistrationPageTest extends BaseTest {
    @Test
    public void getPositiveRegistration(){
        RegistrationPage r = new RegistrationPage();
        r.setName();
        r.setEmail();
        r.setOkPassword();
        r.clickRegistrationButton();
        r.elementEntranceLocate();
    }
    @Test
    public void getFailRegistration(){
        RegistrationPage r = new RegistrationPage();
        r.setName();
        r.setEmail();
        r.setFailPassword();
        r.clickRegistrationButton();
        r.getAlertMessageWithFailPassword();
    }
}
