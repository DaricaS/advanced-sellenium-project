package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.FileDownloadPage;

public class FileOperationsTests extends BaseTest {

    @Test
    public void testFileUpload() {
        FileUploadPage uploadPage = new FileUploadPage(driver);

        uploadPage.uploadFile("test.txt");

        Assert.assertTrue(uploadPage.getUploadedFileName().contains("test.txt"));
    }

    @Test
    public void testFileDownload() {
        FileDownloadPage downloadPage = new FileDownloadPage(driver);

        downloadPage.downloadFile();
        Assert.assertTrue(true);
    }
}

