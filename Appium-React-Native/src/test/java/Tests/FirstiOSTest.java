package Tests;

import Pages.CountPage;
import org.testng.annotations.Test;

public class FirstiOSTest extends BaseTest {
    @Test
    public void click_App_Button() {
        CountPage welcomePage = new CountPage(driver);
        welcomePage.tapClickMeAndAssertThatCountIsNow("1").tapClickMeAndAssertThatCountIsNow("2");
    }
}