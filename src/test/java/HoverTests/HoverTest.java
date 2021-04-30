package HoverTests;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class HoverTest extends BaseTests {
    @Test
    public void testHoverOnAccountDropper(){
        //refreshing so sign in window will disappear
        windowManager.refreshPage();
        homePage.closeLogin();

        var header = homePage.header();
        var accountDropper = header.hoverOverAccountDropper();
        assertTrue(accountDropper.isDropperDisplayed(),"Dropper not visible");
    }
}
