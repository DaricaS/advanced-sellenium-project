package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;

    private By alertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By confirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By promptButton = By.xpath("//button[text()='Click for JS Prompt']");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    public void clickAlertButton() {
        openPage();
        driver.findElement(alertButton).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void sendTextToPrompt(String text) {
        openPage();
        driver.findElement(promptButton).click();
        driver.switchTo().alert().sendKeys(text);
    }
}
