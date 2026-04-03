package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IFramePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By iframe = By.id("mce_0_ifr");
    private By textEditor = By.id("tinymce");

    public IFramePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void switchToIFrame() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
    }

    public void typeInEditor(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(textEditor));
        driver.findElement(textEditor).sendKeys(text);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
}

