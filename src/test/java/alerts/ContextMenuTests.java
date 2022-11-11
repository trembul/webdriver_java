package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test

    public void testRightClick(){
        var contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.clickSquare();
        String message = contextMenuPage.alert_GetText();
        contextMenuPage.alert_ClickToAccept();
        assertEquals(message, "You selected a context menu", "Incorrect pop-up text");
    }

}
