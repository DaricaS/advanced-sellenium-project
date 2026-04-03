package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTests extends BaseTest {

    @Test
    public void testDragAndDropAtoB() {
        DragAndDropPage page = new DragAndDropPage(driver);

        page.dragElement("A", "B");

        Assert.assertEquals(page.getElementAText(), "B");
    }

    @Test
    public void testDragAndDropBtoA() {
        DragAndDropPage page = new DragAndDropPage(driver);

        page.dragElement("B", "A");

        Assert.assertEquals(page.getElementBText(), "A");
    }
}

