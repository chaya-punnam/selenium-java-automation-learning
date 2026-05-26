import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

    public static void main(String[] args)
            throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in");

        Actions action = new Actions(driver);

        action.moveToElement(
                        driver.findElement(By.id("nav-link-accountList")))
                .perform();

        Thread.sleep(3000);

        driver.quit();
    }
}