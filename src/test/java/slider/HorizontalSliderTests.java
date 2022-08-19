package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testHorizontalSliderValue(){
        String value = "4";
        var horizontalSliderPage  = homePage.clickHorizontalSlider();
        horizontalSliderPage.setSliderValue(value);
        assertEquals(horizontalSliderPage.getSliderValue(), value, "Slider is set incorrectly");
    }

}
