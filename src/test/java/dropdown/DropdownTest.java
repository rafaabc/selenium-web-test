package dropdown;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.DropdownPage;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DropdownTest extends BaseTest {

    @Test
    @DisplayName("When the dropdown button is opened, then an option is selected")
    void testSelectOption() {
        DropdownPage dropdownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(1, selectedOptions.size(), "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
