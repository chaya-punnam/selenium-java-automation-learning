import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo1 {

    public static void main(String[] args)
            throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.leafground.com/select.xhtml");

        Thread.sleep(2000);

        Select dropdown =
                new Select(driver.findElement(By.className("ui-selectonemenu")));

        dropdown.selectByIndex(1);

        driver.quit();
    }
}