package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTests extends BaseTest {

    @Test
    public void testAcceptAlert() {
        AlertsPage page = new AlertsPage(driver);

        page.clickAlertButton();
        page.acceptAlert();

        Assert.assertTrue(true);
    }

    @Test
    public void testDismissAlert() {
        AlertsPage page = new AlertsPage(driver);

        page.clickAlertButton();
        page.dismissAlert();

        Assert.assertTrue(true);
    }

    @Test
    public void testSendTextToPrompt() {
        AlertsPage page = new AlertsPage(driver);

        page.sendTextToPrompt("Hello");
        page.acceptAlert();

        Assert.assertTrue(true);
    }
}

