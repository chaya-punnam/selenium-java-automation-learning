import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowserDemo {

    public static void main(String[] args) {

        String browser = "chrome";

        WebDriver driver;

        if(browser.equals("chrome")) {

            driver = new ChromeDriver();

        }

        else {

            driver = new EdgeDriver();

        }

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

        driver.quit();

    }
}