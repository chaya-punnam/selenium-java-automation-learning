import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingXPath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='user-name']"))
                .sendKeys("standard_user");

        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@id='login-button']"))
                .click();

        Thread.sleep(5000);

        driver.quit();
    }
}