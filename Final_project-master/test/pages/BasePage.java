package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.List;

public abstract class BasePage {
    private String url;
    private WebDriver driver;
    public BasePage(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
    }
    public void visit() {
        this.driver.get(url);
    }
    public boolean isVisible(By locator){
        List<WebElement> elements = driver.findElements(locator);
        if (!elements.isEmpty()) {
            return elements.get(0).isDisplayed();
        }
            return false;

    }
    public String getText(By locator) {
        return find(locator).getText();
    }
    public void click(By locator) {
        find(locator).click();
    }
    public void hover(By locator) {
        Actions action = new Actions(driver);
        action.moveToElement(find(locator)).perform();
    }
    public WebElement find(By locator) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }
    public <T> T waitFor(ExpectedCondition<T> expectedCondition) {
        return new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(500L))
                .withTimeout(Duration.ofSeconds(10L))
                .until(expectedCondition);
    }
}