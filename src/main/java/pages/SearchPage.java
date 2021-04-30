package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import pages.base.POMBase;
import utils.Helpers;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends POMBase {


    private final By searchBox = By.id("site_search_input");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchInteractable(){
        FluentWait fluentWait = new FluentWait(mDriver)
                .withTimeout(Duration.ofSeconds(5))
                .withTimeout(Duration.ofSeconds(1))
                .ignoreAll(new ArrayList<Class<? extends Throwable>>() {
                    {
                        add(StaleElementReferenceException.class);
                        add(NoSuchElementException.class);
                        add(TimeoutException.class);
                        add(InvalidElementStateException.class);
                        add(WebDriverException.class);
                    }}
                );
        fluentWait.until(ExpectedConditions.elementToBeClickable(searchBox));
    }

    public void search(String query){
        WebElement searchBar = $(searchBox);
        searchBar.sendKeys(Keys.CONTROL, "A", Keys.DELETE);
        searchBar.sendKeys(query);
        searchBar.sendKeys(Keys.RETURN);
    }

    By idOFSortButton = By.id("cat_sort_menu_trigger");
    By cssOfClassLowToHigh = By.cssSelector(".css-1gp2yoo.eanm77i0");
    public void changeSortFilter(){

        WebElement sortMenu = mDriver.findElement(idOFSortButton);
        //clickOnElement(sortMenu);

        List<WebElement> sortOptions = mDriver.findElements(cssOfClassLowToHigh);
        //System.out.println(sortOptions.size());
        WebElement lowToHigh = null;
        for(WebElement element : sortOptions){
            //get text returns empty as the element is hidden
            String elementText = element.getAttribute("textContent");
            //System.out.println(elementText);
            if(elementText.contains("Price Low to High")){
                lowToHigh = element;
            }
        }
        if(lowToHigh==null)
        {
            return;
        }
        //clickOnElement(lowToHigh);
        Actions actions = new Actions(mDriver);
        //move as regular click does not work
        actions.moveToElement(sortMenu).click().moveToElement(lowToHigh).click().build().perform();

    }

    public String changeRefinement()
    {
        String checkBox = "css-uwt6cb";
        WebElement firstRefinementCheckbox =  mDriver.findElement(By.className(checkBox));
        String value = firstRefinementCheckbox.getAttribute("value");
        System.out.println(value);
        Actions actions = new Actions(mDriver);
//move as regular click does not work
        actions.moveToElement(firstRefinementCheckbox).click().build().perform();
        return value;
    }

    public String extractQuery(){
        try
        {
            var map = Helpers.splitQuery(new URL(getURL()));
            if(!map.containsKey("keyword")){
                return null;
            }
            return map.get("keyword");
        }
        catch(Exception exception) {
            return null;
        }

    }

    public String extractRef(){
        try
        {
            var map = Helpers.splitQuery(new URL(getURL()));
            if(!map.containsKey("ref")){
                return null;
            }
            return map.get("ref");
        }
        catch(Exception exception) {
            return null;
        }

    }
}
