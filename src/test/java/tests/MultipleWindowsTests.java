package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MultipleWindowsPage;

public class MultipleWindowsTests extends BaseTest {

    @Test
    public void testNewWindow() {
        MultipleWindowsPage page = new MultipleWindowsPage(driver);

        page.clickNewWindowButton();
        page.switchToNewWindow();

        Assert.assertEquals(page.getNewWindowText(), "New Window");

        page.closeWindowAndSwitchBack();
    }
}


