package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileDownloadPage {

    private WebDriver driver;

    public FileDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDownloadLink(String fileName) {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText(fileName)).click();
    }

    public boolean verifyFileDownloaded(String fileName) {
        String downloadPath = System.getProperty("user.dir") + "/downloads/";
        File file = new File(downloadPath + fileName);
        return file.exists();
    }
}

