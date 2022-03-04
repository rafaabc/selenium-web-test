package javaScript;

import base.BaseTest;
import org.junit.jupiter.api.*;

class JavaScriptTest extends BaseTest {

    @Test
    @DisplayName("When using JavaScript to scroll down the page, then a table is reached out")
    void testScrollToTable() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    @DisplayName("When using JavaScript to scroll down the page until the 5th paragraph, then 5 paragraphs display")
    void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
