import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertDemo {
    public static void main(String[] args)
            throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']"))
                .click();

        Thread.sleep(2000);

        Alert alert =
                driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();

        Thread.sleep(3000);

        driver.quit();
    }
}