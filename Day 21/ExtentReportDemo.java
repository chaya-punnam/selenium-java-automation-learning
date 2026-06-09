import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

    public static void main(String[] args) {

        ExtentSparkReporter spark =
                new ExtentSparkReporter(
                        "ExtentReport.html");

        ExtentReports extent =
                new ExtentReports();

        extent.attachReporter(spark);

        ExtentTest test =
                extent.createTest("Google Test");

        test.pass("Google Opened Successfully");

        extent.flush();

        System.out.println(
                "Report Generated");
    }
}