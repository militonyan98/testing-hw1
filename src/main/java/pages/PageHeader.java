package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.POMBase;

public class PageHeader extends POMBase {
    By accountDropTrigger = By.id("account_drop_trigger");
    By accountDrop = By.id("account_drop");

    public PageHeader(WebDriver driver) {
        super(driver);
    }

    public AccountDropper hoverOverAccountDropper(){
        WebElement accountDropper = $(accountDropTrigger);
        Actions actions = new Actions(mDriver);
        actions.moveToElement(accountDropper).perform();
        return new AccountDropper(accountDropper);
    }

   public LoginPage clickOnLoginPage(){
       WebElement accountDropper = $(accountDropTrigger);
       Actions actions = new Actions(mDriver);
       actions.moveToElement(accountDropper).click().click().perform();
       var loginPage =  new LoginPage(mDriver);
       return loginPage;
   }


    public class AccountDropper {

        private WebElement mAccountDropper;
        public AccountDropper(WebElement accountDropper){
            mAccountDropper = accountDropper;
        }

        public boolean isDropperDisplayed(){
            return mAccountDropper.isDisplayed();
        }



    }

}
