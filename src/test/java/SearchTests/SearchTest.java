package SearchTests;

import Base.BaseTests;
import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SearchPage;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTests {

    @Test
    public void testSearchFailing()  {

        SearchPage searchPage = homePage.search();

        String query = "shampoo";
        searchPage.search(query);
        assertTrue(searchPage.extractQuery().contains("cats"), "Wrong search query");
    }

    @Test
    public void testSearchSuccess()  {
        SearchPage searchPage = homePage.search();
        searchPage.searchInteractable();
        String query = "shampoo";
        searchPage.search(query);
        assertTrue(searchPage.extractQuery().contains(query), "Wrong search query");
    }

    @Test
    public void testDifferentSorting(){
        homePage.closeLogin();

        SearchPage searchPage = homePage.search();
        searchPage.searchInteractable();
        String query = "shampoo";
        searchPage.search(query);
        searchPage.changeSortFilter();
        String sortLowToHigh = "sortBy=PRICE_LOW_TO_HIGH";
        String url =searchPage.getURL();
        assertTrue(url.contains(sortLowToHigh));
    }

    @Test
    public void testChangeRefinement(){
        homePage.closeLogin();

        SearchPage searchPage = homePage.search();
        searchPage.searchInteractable();
        String query = "shampoo";
        try
        {
            searchPage.search(query);
        }
        catch(ElementNotInteractableException ex)
        {
            homePage.closeLogin();
            searchPage.search(query);
        }

        var value = searchPage.changeRefinement();
        String url = searchPage.extractRef();
        assertTrue(url.contains(value));
    }
}
