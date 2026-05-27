import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

    public static void main(String[] args)
            throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(
                "https://the-internet.herokuapp.com/upload");

        driver.findElement(By.id("file-upload"))
                .sendKeys(
                        "C:\\Users\\chaya\\OneDrive\\Desktop\\testfile.txt");

        driver.findElement(By.id("file-submit"))
                .click();

        Thread.sleep(3000);

        driver.quit();
    }
}