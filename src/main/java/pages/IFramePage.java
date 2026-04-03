package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage {

    private WebDriver driver;

    private By iframe = By.id("mce_0_ifr");
    private By textEditor = By.id("tinymce");

    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToIFrame() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(driver.findElement(iframe));
    }

    public void typeInEditor(String text) {
        driver.findElement(textEditor).clear();
        driver.findElement(textEditor).sendKeys(text);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
}

