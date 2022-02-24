package login;

import base.BaseTest;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest extends BaseTest {

    @Test
    @DisplayName("When the login form is filled with valid data, then a success message is displayed")
    void testSuccessfulLogin() {
        var loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        var secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getSuccessMessage();
        assertTrue(secureAreaPage.getSuccessMessage()
                        .contains("You logged into a secure area!"),
                "The success message is incorrect");
    }
}
