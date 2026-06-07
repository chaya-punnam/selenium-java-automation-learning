package Day20_Framework_Utilities;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class ScreenshotUtility {

    public static void captureScreenshot(
            WebDriver driver,
            String fileName)
            throws Exception {

        File src =
                ((TakesScreenshot)driver)
                        .getScreenshotAs(
                                OutputType.FILE);

        FileUtils.copyFile(
                src,
                new File(fileName));
    }
}
