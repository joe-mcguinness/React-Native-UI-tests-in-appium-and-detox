package Tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public static AppiumDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("platformVersion", "16.0");
        caps.setCapability("deviceName", "iPhone 14 Pro");
        caps.setCapability("app", "/Users/joe/Projects/my-app/ios/build/Build/Products/Debug-iphonesimulator/myapp.app");
        caps.setCapability("udid", "9C3ADFD4-BC80-4C45-86C1-13FA2BEC8CD8");
        caps.setCapability("useNewWDA", true);
        //caps.setCapability("showXcodeLog", true);
        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    @AfterTest
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }

}
