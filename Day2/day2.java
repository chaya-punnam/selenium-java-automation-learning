import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open Google
        driver.get("https://www.google.com");

        System.out.println("Google Title: " + driver.getTitle());
        System.out.println("Google URL: " + driver.getCurrentUrl());

        Thread.sleep(2000);

        // Navigate to YouTube
        driver.navigate().to("https://www.youtube.com");

        System.out.println("YouTube Title: " + driver.getTitle());
        System.out.println("YouTube URL: " + driver.getCurrentUrl());

        Thread.sleep(2000);

        // Navigate to Amazon
        driver.navigate().to("https://www.amazon.in");

        System.out.println("Amazon Title: " + driver.getTitle());
        System.out.println("Amazon URL: " + driver.getCurrentUrl());

        Thread.sleep(2000);

        // Go Back
        driver.navigate().back();

        Thread.sleep(2000);

        // Go Forward
        driver.navigate().forward();

        Thread.sleep(2000);

        // Refresh page
        driver.navigate().refresh();

        Thread.sleep(3000);

        // Minimize browser
        driver.manage().window().minimize();

        Thread.sleep(2000);

        // Close browser
        driver.quit();

    }
}