package wools.core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Instantiates and stop driver
 */
public class SelTestCase {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @Before 
    public void setupDriver() {
    	System.setProperty("webdriver.chrome.driver","../../../BookingAutomation/Drivers/chromedriver");
        webDriver = new ChromeDriver();
    }

    @After 
    public void stopDriver() {
        webDriver.quit();
    }

}
