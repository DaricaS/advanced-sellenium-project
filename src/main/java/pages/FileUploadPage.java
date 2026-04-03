package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploadPage {

    private WebDriver driver;

    private By uploadInput = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String fileName) {
        driver.get("https://the-internet.herokuapp.com/upload");

        File file = new File(fileName);
        driver.findElement(uploadInput).sendKeys(file.getAbsolutePath());

        driver.findElement(uploadButton).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(uploadedFile).getText();
    }
}



