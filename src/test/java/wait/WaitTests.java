package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var dynamicLoadingExample1Page = homePage.clickDynamicLoadingPageLink().clickExample1Link();
        dynamicLoadingExample1Page.clickStartButton();
        assertEquals(dynamicLoadingExample1Page.getLoadedText(),"Hello World!", "Incorrect text");

    }

    @Test
    public void testWaitUntilTextVisible(){
        var dynamicLoadingExample2Page =  homePage.clickDynamicLoadingPageLink().clickExample2Link();
        dynamicLoadingExample2Page.clickStartButton();
        assertEquals(dynamicLoadingExample2Page.getLoadedText(), "Hello World!", "Incorrect text");
    }
}
