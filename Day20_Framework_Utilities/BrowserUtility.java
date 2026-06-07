package Day20_Framework_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtility {

    public static WebDriver launchBrowser() {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        return driver;
    }

    public static void closeBrowser(
            WebDriver driver) {

        driver.quit();
    }
}
