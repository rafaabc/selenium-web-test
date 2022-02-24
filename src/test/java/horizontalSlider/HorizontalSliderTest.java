package horizontalSlider;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.HorizontalSliderPage;

import static org.junit.jupiter.api.Assertions.*;

public class HorizontalSliderTest extends BaseTest {

    @Test
    @DisplayName("When interacting with the slider, then the slider meter is displayed accordingly")
    void testHorizontalSliderToWholeNumber() {
        String value = "4";
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderPage();
        horizontalSliderPage.setSliderValue(value);
        assertEquals(value, horizontalSliderPage.getSliderValue(), "Slider value is incorrect");
    }
}
