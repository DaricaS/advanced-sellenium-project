package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class DynamicLoadingTests extends BaseTest {

    @Test
    public void testDynamicElementAppears() {
        DynamicLoadingPage page = new DynamicLoadingPage(driver);

        page.clickStartButton();
        page.waitForElementToAppear();

        Assert.assertTrue(page.getFinishText().contains("Hello World!"));
    }

    @Test
    public void testDynamicElementDisappears() {
        DynamicLoadingPage page = new DynamicLoadingPage(driver);

        page.clickStartButton();
        page.waitForElementToDisappear();

        Assert.assertTrue(page.getFinishText().contains("Hello World!"));
    }

    @Test
    public void testHiddenElementBecomesVisible() {
        DynamicLoadingPage page = new DynamicLoadingPage(driver);

        page.clickStartButton();
        page.waitForElementToAppear();

        Assert.assertTrue(page.getFinishText().contains("Hello World!"));
    }
}

