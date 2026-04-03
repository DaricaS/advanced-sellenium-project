package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadTests extends BaseTest {

    @Test
    public void testDownload() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.cssSelector(".example a")).click();

        Thread.sleep(5000);

        String userHome = System.getProperty("user.home");
        File folder = new File(userHome + "/Downloads");

        File[] files = folder.listFiles();

        Assert.assertTrue(files.length > 0, "No files downloaded");
    }
}




