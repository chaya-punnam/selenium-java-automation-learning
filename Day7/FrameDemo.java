import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

    public static void main(String[] args)
            throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(0);

        driver.findElement(By.tagName("p"))
                .clear();

        driver.findElement(By.tagName("p"))
                .sendKeys("Hello Selenium");

        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        driver.quit();
    }
}