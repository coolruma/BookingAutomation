package wools.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


/**
 * Generic page object
 *
 */
public class Page {

    public Page(){

    }

    private WebDriver webDriver;

    public Page(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getElement(By locator) {
        return webDriver.findElement(locator);
    }

    public List<WebElement> getElements(By locator) {
        return webDriver.findElements(locator);
    }

    public WebElement waitForElementVisibility(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 10);

        return webDriverWait.until(ExpectedConditions
                .visibilityOfElementLocated(locator));

    }
}
