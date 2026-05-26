import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

    public static void main(String[] args)
            throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(
                "https://www.globalsqa.com/demo-site/draganddrop/");

        Actions action =
                new Actions(driver);

        WebElement source =
                driver.findElement(By.xpath("//img[contains(@src,'images')]"));

        WebElement target =
                driver.findElement(By.id("trash"));

        action.dragAndDrop(source, target)
                .perform();

        Thread.sleep(3000);

        driver.quit();
    }
}