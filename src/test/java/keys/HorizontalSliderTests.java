package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSliderToWholeNumber(){
        String value = "4";
        var horizontalSliderPage = homePage.clickHorizontalSliderLink();
        horizontalSliderPage.moveSlider(value);
        assertEquals(horizontalSliderPage.getSliderValue(), "4", "Incorrect value");
    }
}
