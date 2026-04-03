package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class MultipleWindowsPage {

    private WebDriver driver;
    private String originalWindow;

    private By newWindowButton = By.linkText("Click Here");
    private By newWindowText = By.tagName("h3");

    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNewWindowButton() {
        driver.get("https://the-internet.herokuapp.com/windows");
        originalWindow = driver.getWindowHandle();
        driver.findElement(newWindowButton).click();
    }

    public void switchToNewWindow() {
        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
            }
        }
    }

    public String getNewWindowText() {
        return driver.findElement(newWindowText).getText();
    }

    public void closeWindowAndSwitchBack() {
        driver.close();
        driver.switchTo().window(originalWindow);
    }
}