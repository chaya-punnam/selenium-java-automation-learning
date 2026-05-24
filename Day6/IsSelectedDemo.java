import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {

    public static void main(String[] args)
            throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.leafground.com/checkbox.xhtml");

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]"))
                .click();

        boolean status =
                driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"))
                        .isSelected();

        System.out.println(status);

        driver.quit();
    }
}