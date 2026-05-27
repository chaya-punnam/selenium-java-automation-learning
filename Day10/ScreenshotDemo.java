import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ScreenshotDemo {

    public static void main(String[] args)
            throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        // Take Screenshot
        File src =
                ((TakesScreenshot)driver)
                        .getScreenshotAs(OutputType.FILE);

        // Save Screenshot
        FileUtils.copyFile(src,
                new File("google.png"));

        System.out.println("Screenshot Taken");

        driver.quit();
    }
}