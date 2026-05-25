import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
public class ExplicitWaitDemo
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("user-name")));
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");
        driver.findElement(By.id("login-button"))
                .click();
        driver.quit();
    }
}