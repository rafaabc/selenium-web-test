package frames;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.NestedFramePage;

import static org.junit.jupiter.api.Assertions.*;

public class NestedFramesTest extends BaseTest {

    @Test
    @DisplayName("When there is a nested frame with a text, then it should retrieve the text successfully")
    void testNestedFramesLeft() {
        NestedFramePage nestedFramePage = homePage.clickFrames().clickNestedFrameLink();
        assertEquals("LEFT", nestedFramePage.getTextFromLeftFrame(), "Incorrect text");
        assertEquals("BOTTOM", nestedFramePage.getTextFromEditorBottomFrame(), "Incorrect text");
    }
}
