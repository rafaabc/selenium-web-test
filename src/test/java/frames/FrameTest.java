package frames;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.WysiwygEditorPage;

import static org.junit.jupiter.api.Assertions.*;

class FrameTest extends BaseTest {

    @Test
    @DisplayName("When interacting with a text within an iframe, then a message change should be displayed")
    void testWysiwyg() {
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditor();
        wysiwygEditorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "World!";

        wysiwygEditorPage.setTextArea(text1);
        wysiwygEditorPage.decreaseIndention();
        wysiwygEditorPage.setTextArea(text2);
        assertEquals(text1+text2, wysiwygEditorPage.getTextFromEditor(), "Incorrect message");
    }
}
