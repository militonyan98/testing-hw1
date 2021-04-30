import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InitialTest {
//    private WebDriver mCurrentWebDriver;
//    private URLBuilder mUrlBuilder;
//
//    public void setup(){
//        if(mCurrentWebDriver==null){
//            mCurrentWebDriver = new ChromeDriver();
//            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        }
//
//
//        if(mUrlBuilder==null)
//            mUrlBuilder = new URLBuilder();
//    }
//
//    public void navigateHome(){
//        mCurrentWebDriver.get(mUrlBuilder.getBaseUrl());
//    }
//
//    public void endSession(){
//       mCurrentWebDriver.close();
//    }
//
//    @Test
//    public void testSearch(){
//        setup();
//        navigateHome();
//        String searchId = "site_search_input";
//        WebElement searchInput =  mCurrentWebDriver.findElement(By.id(searchId));
//        searchInput.sendKeys("foundation");
//        searchInput.sendKeys(Keys.RETURN);
//        String url = mCurrentWebDriver.getCurrentUrl();
//        assertTrue(url.contains("keyword=foundation"));
//        endSession();
//    }
//
//
//    @Test
//    public void testShampoo(){
//        setup();
//        mCurrentWebDriver.get(mUrlBuilder.getShampooUrl());
//        //checkbox class
//        String checkBox = "css-uwt6cb";
//        WebElement firstRefinementCheckbox =  mCurrentWebDriver.findElement(By.className(checkBox));
//
//        String value = firstRefinementCheckbox.getAttribute("value");
//        System.out.println(value);
//        Actions actions = new Actions(mCurrentWebDriver);
//        //move as regular click does not work
//        actions.moveToElement(firstRefinementCheckbox).click().build().perform();
//        String url = mCurrentWebDriver.getCurrentUrl();
//        assertTrue(url.contains("ref="+value));
//        endSession();
//    }
//
//    @Test
//    public void changeSortingFilter(){
//        setup();
//        mCurrentWebDriver.get(mUrlBuilder.getShampooUrl());
//
//
//        //new actions
//        String idOfButton = "cat_sort_menu_trigger";
//        WebElement sortMenu = mCurrentWebDriver.findElement(By.id(idOfButton));
//        //clickOnElement(sortMenu);
//
//        String classForLowToHigh = ".css-1gp2yoo.eanm77i0";
//        List<WebElement> sortOptions = mCurrentWebDriver.findElements(By.cssSelector(classForLowToHigh));
//        //System.out.println(sortOptions.size());
//        WebElement lowToHigh = null;
//        for(WebElement element : sortOptions){
//            //get text returns empty as the element is hidden
//            String elementText = element.getAttribute("textContent");
//            //System.out.println(elementText);
//            if(elementText.contains("Price Low to High")){
//                lowToHigh = element;
//            }
//        }
//        if(lowToHigh==null)
//        {
//            assertTrue(false);
//            return;
//        }
//        //clickOnElement(lowToHigh);
//        Actions actions = new Actions(mCurrentWebDriver);
//        //move as regular click does not work
//        actions.moveToElement(sortMenu).click().moveToElement(lowToHigh).click().build().perform();
//        String sortLowToHigh = "sortBy=PRICE_LOW_TO_HIGH";
//        String url = mCurrentWebDriver.getCurrentUrl();
//        assertTrue(url.contains(sortLowToHigh));
//        endSession();
//
//    }
//
//
//    @Test
//    public void checkIfBasketAdded(){
//        setup();
//        String addToBasketClass = ".css-rqnrql.eanm77i0";
//
//        mCurrentWebDriver.get(mUrlBuilder.getProductUrl());
//
//        WebElement element = mCurrentWebDriver.findElement(By.cssSelector(addToBasketClass));
//        String beforeClick = element.getText();
//        clickOnElement(element);
//        String afterClick = element.getText();
//        //checking the text changed and the new text has added in it
//        assertTrue(!beforeClick.equals(afterClick) && afterClick.contains("Added"));
//        endSession();
//    }
//
//
//    private void clickOnElement(WebElement elem){
//        Actions actions = new Actions(mCurrentWebDriver);
//        //move as regular click does not work
//        actions.moveToElement(elem).click().build().perform();
//    }

}
