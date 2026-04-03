package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    private WebDriver driver;

    private By columnA = By.id("column-a");
    private By columnB = By.id("column-b");

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragElement(String from, String to) {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(driver);

        if (from.equals("A") && to.equals("B")) {
            actions.dragAndDrop(driver.findElement(columnA), driver.findElement(columnB)).perform();
        } else if (from.equals("B") && to.equals("A")) {
            actions.dragAndDrop(driver.findElement(columnB), driver.findElement(columnA)).perform();
        }
    }

    public String getElementAText() {
        return driver.findElement(columnA).getText();
    }

    public String getElementBText() {
        return driver.findElement(columnB).getText();
    }
}

