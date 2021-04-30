package LoginTests;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {
  /*  @Test
    public void checkLoginPage(){
        //refreshing so sign in window will disappear
        windowManager.refreshPage();
        homePage.closeLogin();

        var header = homePage.header();
        var loginPage = header.clickOnLoginPage();
        assertTrue(loginPage.isDisplayed(),"Login Page is not visible");
    }*/

    @Test
    public void checkEmptyLoginError(){
        //refreshing so sign in window will disappear
        windowManager.refreshPage();
        //homePage.closeLogin();
        var header = homePage.header();
        var loginPage = header.clickOnLoginPage();

        loginPage.clickOnLoginButton();
    }


}
