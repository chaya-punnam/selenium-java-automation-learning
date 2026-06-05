package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithExcel {

    public static void main(String[] args)
            throws Exception {

        String username =
        ExcelUtility.getData(1,0);

        String password =
        ExcelUtility.getData(1,1);

        WebDriver driver =
        new ChromeDriver();

        driver.manage()
              .window()
              .maximize();

        driver.get(
        "https://www.saucedemo.com");

        driver.findElement(
        By.id("user-name"))
        .sendKeys(username);

        driver.findElement(
        By.id("password"))
        .sendKeys(password);

        driver.findElement(
        By.id("login-button"))
        .click();

        Thread.sleep(3000);

        driver.quit();
    }
}
