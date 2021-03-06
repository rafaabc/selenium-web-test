package horizontalSlider;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.horizontalSlider.HorizontalSliderPage;

import static org.junit.jupiter.api.Assertions.*;

class HorizontalSliderTest extends BaseTest {

    @Test
    @DisplayName("When interacting with the slider, then the slider meter is displayed accordingly")
    void testHorizontalSliderToWholeNumber() {
        String value = "4";
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.setSliderValue(value);
        assertEquals(value, horizontalSliderPage.getSliderValue(), "Slider value is incorrect");
    }
}
