package login;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest extends BaseTest {

    @Test
    void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getSuccessMessage();
        assertTrue(secureAreaPage.getSuccessMessage()
                        .contains("You logged into a secure area!"),
                "The success message is incorrect");
    }
}
