package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By startButton = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By finishText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickStartButton() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(startButton).click();
    }

    public void waitForElementToAppear() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishText));
    }

    public void waitForElementToDisappear() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loading));
    }

    public String getFinishText() {
        return driver.findElement(finishText).getText();
    }
}

