package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;

    private By alertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By confirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By promptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlertButton() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(alertButton).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void sendTextToPrompt(String text) {
        driver.findElement(promptButton).click();
        driver.switchTo().alert().sendKeys(text);
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
}

