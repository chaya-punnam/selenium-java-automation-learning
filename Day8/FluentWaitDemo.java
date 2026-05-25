import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");

        FluentWait wait =
                new FluentWait(driver)

                        .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2));

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.quit();
    }
}
