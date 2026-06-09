import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GoogleTest {

    public static void main(String[] args) {

        ExtentSparkReporter spark =
                new ExtentSparkReporter(
                        "GoogleReport.html");

        ExtentReports extent =
                new ExtentReports();

        extent.attachReporter(spark);

        ExtentTest test =
                extent.createTest(
                        "Google Test");

        WebDriver driver =
                new ChromeDriver();

        driver.get(
                "https://www.google.com");

        test.pass(
                "Google Opened");

        driver.quit();

        extent.flush();
    }
}