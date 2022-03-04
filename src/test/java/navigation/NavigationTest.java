package navigation;

import base.BaseTest;
import org.junit.jupiter.api.*;

class NavigationTest extends BaseTest {

    @Test
    @DisplayName("Should test the navigator throughout the pages")
    void testNavigator() {
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    @DisplayName("Should test the switching of tabs")
    void testSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
