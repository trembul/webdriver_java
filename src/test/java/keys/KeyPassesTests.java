package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPassesTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPassesPage = homePage.clickKeyPressesLink();
        keyPassesPage.enterText("r" + Keys.BACK_SPACE);
        assertEquals(keyPassesPage.getResultText(), "You entered: BACK_SPACE", "Result message is incorrect");
    }

}
