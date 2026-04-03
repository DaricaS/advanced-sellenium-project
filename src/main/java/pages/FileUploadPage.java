package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;

    private By uploadInput = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFileName = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(uploadInput).sendKeys(filePath);
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(uploadedFileName).getText();
    }
}


