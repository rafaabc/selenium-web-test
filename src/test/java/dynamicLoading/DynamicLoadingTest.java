package dynamicLoading;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.dynamicLoading.DynamicLoadingExample1Page;
import pages.dynamicLoading.DynamicLoadingExample2Page;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicLoadingTest extends BaseTest {

    @Test
    @DisplayName("When there is a loading icon, then it should handles the wait until is hidden")
    void testWaitUntilHidden() {
        DynamicLoadingExample1Page dynamicLoadingExample1Page = homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingExample1Page.clickStart();
        assertEquals("Hello World!", dynamicLoadingExample1Page.getLoadedText(), "Incorrect message");
    }

    @Test
    @DisplayName("When there is a loading icon, then it should handles the wait until the text page is visible")
    void testWaitUntilVisible() {
        DynamicLoadingExample2Page dynamicLoadingExample2Page = homePage.clickDynamicLoading().clickExample2();
        dynamicLoadingExample2Page.clickStart();
        assertEquals("Hello World!", dynamicLoadingExample2Page.getLoadedText(), "Incorrect message");
    }
}
