package Day20_Framework_Utilities;

import org.openqa.selenium.WebDriver;

public class LoginTest {

    public static void main(
            String[] args)
            throws Exception {

        WebDriver driver =
        BrowserUtility
        .launchBrowser();

        driver.get(
        "https://www.google.com");

        ScreenshotUtility
        .captureScreenshot(
        driver,
        "google.png");

        BrowserUtility
        .closeBrowser(driver);
    }
}
