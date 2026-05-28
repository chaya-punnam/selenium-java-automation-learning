import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTitleTest {

    @Test
    public void titleTest() {

        WebDriver driver =
                new ChromeDriver();

        driver.get("https://www.google.com");

        String actualTitle =
                driver.getTitle();

        String expectedTitle =
                "Google";

        Assert.assertEquals(
                actualTitle,
                expectedTitle);

        System.out.println("Title Verified");

        driver.quit();
    }
}