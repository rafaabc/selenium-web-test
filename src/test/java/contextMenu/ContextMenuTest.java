package contextMenu;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.contextMenu.ContextMenuPage;

import static org.junit.jupiter.api.Assertions.*;

class ContextMenuTest extends BaseTest {

    @Test
    @DisplayName("When right clicking in the box, then a context menu is displayed")
    void testInteractWithContextMenu() {
        ContextMenuPage contextMenu = homePage.clickContextMenu();
        contextMenu.triggerContextMenu();
        String text = contextMenu.alert_getText();
        contextMenu.alert_clickToAccept();
        assertEquals("You selected a context menu", text, "Incorrect context menu text");
    }
}
