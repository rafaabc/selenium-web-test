package forgotPassword;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.junit.jupiter.api.Assertions.*;

class ForgotPasswordTest extends BaseTest {

    @Test
    void testRetrievePassword() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        emailSentPage.getSuccessMessage();
        assertTrue(emailSentPage.getSuccessMessage()
                        .contains("Your e-mail's been sent!"),
                "The success message is incorrect");
    }
}
