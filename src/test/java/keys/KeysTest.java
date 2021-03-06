package keys;

import base.BaseTest;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;
import pages.keys.KeyPressesPage;

import static org.junit.jupiter.api.Assertions.*;

class KeysTest extends BaseTest {

    @Test
    @DisplayName("When key is pressed, then a success message is displayed")
    void testBackspace() {
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals("You entered: BACK_SPACE", keyPage.getResult(), "Incorrect message");
    }
}
