package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CountPage extends BasePage {

    AppiumDriver driver;
    WebElement clickButton;
    WebElement countText;

    public CountPage(AppiumDriver driver) {
        this.driver = driver;
        this.assertPageHasLoaded();
    }

    @Override
    protected void assertPageHasLoaded() {
        clickButton = driver.findElement(By.id("buttonId"));
        Assert.assertTrue(clickButton.isDisplayed());
    }

    public CountPage tapClickMeAndAssertThatCountIsNow(String count) {
        clickButton.click();
        countText = driver.findElement(By.id("textId"));
        String count2 = countText.getText();
        Assert.assertTrue(countText.getText().equals("You clicked "+ count + " times"));
        return new CountPage(driver);
    }

}