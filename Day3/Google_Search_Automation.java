import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search_Automation{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(2000);

        driver.findElement(By.name("q"))
                .sendKeys("Selenium WebDriver");

        Thread.sleep(2000);

        driver.quit();

    }
}