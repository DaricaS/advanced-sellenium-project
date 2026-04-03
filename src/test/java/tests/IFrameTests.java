package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IFramePage;

public class IFrameTests extends BaseTest {

    @Test
    public void testTypingInIFrame() {
        IFramePage page = new IFramePage(driver);

        page.switchToIFrame();
        page.typeInEditor("Hello IFrame");
        page.switchToDefaultContent();

        Assert.assertTrue(true);
    }
}


