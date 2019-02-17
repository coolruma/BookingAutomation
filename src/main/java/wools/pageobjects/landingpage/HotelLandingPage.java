package wools.pageobjects.landingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wools.pageobjects.Page;

public class HotelLandingPage extends Page{
    private WebDriver webDriver;
    HotelLandingPage(){
        super();
    }

    public void selectDates(String duration) {
        WebElement dropDown1 = webDriver.findElement(By.id("myselect2"));
        dropDown1.click();
        WebElement dropDown = webDriver.findElement(By.xpath(".//*[@id='myselect2']/div/div[2]/div[2]"));
        dropDown.click();
    }

    public void clickContinue() {
        waitForElementVisibility(By.cssSelector("a[id ^= 'forwardButton']"))
                .click();
    }
}
