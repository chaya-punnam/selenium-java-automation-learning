import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");

        String value =
                driver.findElement(By.id("user-name"))
                        .getAttribute("placeholder");

        System.out.println(value);

        driver.quit();
    }
}