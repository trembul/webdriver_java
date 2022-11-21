package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import utils.WindowManager;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        var example1 = homePage.clickDynamicLoadingPageLink().clickExample1Link();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goToURL("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindowsPage().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testNewWindow(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingPageLink();
        var newTab = dynamicLoadingPage.openExample2InNewTab();
        getWindowManager().switchToNewTab();
        var visibleButton = newTab.isStartButtonVisible();
        assertTrue(visibleButton, "Button is not visible");

    }

}
