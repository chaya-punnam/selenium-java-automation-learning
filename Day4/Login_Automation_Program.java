import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Automation_Program {
    public static void main(String[] args) throws InterruptedException {
        // Launch browser
        WebDriver driver = new ChromeDriver();
        // Maximize browser
        driver.manage().window().maximize();
        // Open website
        driver.get("https://www.saucedemo.com");
        // Wait
        Thread.sleep(2000);
        // Enter username
        driver.findElement(By.xpath("//input[@id='user-name']"))
                .sendKeys("standard_user");
        // Enter password
        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys("secret_sauce");
        // Click login button
        driver.findElement(By.xpath("//input[@id='login-button']"))
                .click();
        // Wait
        Thread.sleep(5000);
        // Close browser
        driver.quit();
    }
}