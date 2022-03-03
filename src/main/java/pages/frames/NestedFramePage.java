package pages.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage {

    private WebDriver driver;
    private String editorIframeTop = "frame-top";
    private String editorIframeLeft = "frame-left";
    private String editorIframeBottom = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextFromLeftFrame() {
        switchToTopLeftFrame();
        String text = driver.findElement(body).getText();
        switchToMainArea();
        return text;
    }

    public String getTextFromEditorBottomFrame() {
        switchToBottomFrame();
        String text = driver.findElement(body).getText();
        switchToMainArea();
        return text;
    }

    private void switchToTopLeftFrame() {
        driver.switchTo().frame(editorIframeTop);
        driver.switchTo().frame(editorIframeLeft);
    }

    private void switchToBottomFrame() {
        driver.switchTo().frame(editorIframeBottom);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
}
