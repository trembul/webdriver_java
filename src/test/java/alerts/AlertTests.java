package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlertsPageLink();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "Incorrect result text");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickAlertsPageLink();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_ClickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text is incorrect");

    }

    @Test
    public void testSendTextToPrompt(){
        var alertsPage = homePage.clickAlertsPageLink();
        alertsPage.triggerPrompt();
        String text = "fsafasdf";
        alertsPage.alert_SendTextToPrompt(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResultText(), "You entered: " + text, "Prompt text is incorrect");
    }
}
