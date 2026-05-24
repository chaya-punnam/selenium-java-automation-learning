import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class WindowHandlingDemo {
    public static void main(String[] args)
            throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        String parent =
                driver.getWindowHandle();
        driver.findElement(By.linkText("Click Here"))
                .click();
        Set<String> windows =
                driver.getWindowHandles();
        for(String window : windows) {
            driver.switchTo().window(window);

        }
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.switchTo().window(parent);
        driver.quit();
    }
}