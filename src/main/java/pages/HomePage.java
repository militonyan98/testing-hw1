package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.POMBase;

public class HomePage extends POMBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public SearchPage search(){
        return new SearchPage(mDriver);
    }

    public LoginPage login(){
        return new LoginPage(mDriver);
    }

    public PageHeader header(){
        return new PageHeader(mDriver);
    }

    public void closeLogin(){
        try {
            login().closePage();
        }
        catch (Exception ex){

        }
    }

    /*public LoginPage clickLogin(){

    }*/
}
