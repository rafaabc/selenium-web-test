package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerContextMenu() {
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(box);
        actions.contextClick(elementLocator).perform();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }
}
