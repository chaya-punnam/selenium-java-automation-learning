import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://example.com");

        Select dropdown =
                new Select(driver.findElement(By.id("country")));

        dropdown.selectByVisibleText("India");

        driver.quit();
    }
}