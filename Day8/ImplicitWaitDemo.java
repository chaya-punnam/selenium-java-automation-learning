import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Implicit Wait
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.quit();
    }
}
