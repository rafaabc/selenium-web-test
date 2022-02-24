package javaScriptAlerts;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.JavaScriptAlertsPage;

import static org.junit.jupiter.api.Assertions.*;

class JavaScriptAlertsTest extends BaseTest {

    @Test
    @DisplayName("When confirming the JS Alert, then a success message is displayed")
    void testAcceptAlert() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsPage();
        javaScriptAlertsPage.triggerAlert();
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals("You successfully clicked an alert", javaScriptAlertsPage.getSuccessMessage());
    }

    @Test
    @DisplayName("When opening the JS Confirm, then a message is displayed")
    void testGetTextFromAlert() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsPage();
        javaScriptAlertsPage.triggerConfirm();
        String text = javaScriptAlertsPage.alert_getText();
        javaScriptAlertsPage.alert_clickToDismiss();
        assertEquals("I am a JS Confirm", text, "Alert text incorrect");
    }

    @Test
    @DisplayName("When filling a JS Prompt, then a message is displayed with the text previously filled")
    void testFillPrompt() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsPage();
        javaScriptAlertsPage.triggerPrompt();
        javaScriptAlertsPage.alert_fillPrompt("TAU is awesome!");
        assertEquals("You entered: TAU is awesome!", javaScriptAlertsPage.getSuccessMessage(), "Prompt text incorrect");
    }
}
