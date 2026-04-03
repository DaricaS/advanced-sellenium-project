package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileDownloadPage {

    private WebDriver driver;

    private By downloadLink = By.linkText("some-file.txt");

    public FileDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void downloadFile() {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(downloadLink).click();
    }
}
