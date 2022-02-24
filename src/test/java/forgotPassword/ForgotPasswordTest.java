package forgotPassword;

import base.BaseTest;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ForgotPasswordTest extends BaseTest {

    @Test
    @DisplayName("When the forgot password option is selected, then a 'Sent e-mail' message is displayed")
    void testRetrievePassword() {
        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        var emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        emailSentPage.getSuccessMessage();
        assertTrue(emailSentPage.getSuccessMessage()
                        .contains("Your e-mail's been sent!"),
                "The success message is incorrect");
    }
}
