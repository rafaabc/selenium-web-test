package hovers;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.HoversPage;

import static org.junit.jupiter.api.Assertions.*;

public class HoversTest extends BaseTest {

    @Test
    void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals("name: user1", caption.getTitle(), "Caption title incorrect");
        assertEquals("View profile", caption.getLinkText(), "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
