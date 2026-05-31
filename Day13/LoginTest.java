package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver =
                new ChromeDriver();
        driver.get(
                "https://www.saucedemo.com");
        LoginPage login =
                new LoginPage(driver);
        login.enterUsername(
                "standard_user");
        login.enterPassword(
                "secret_sauce");
        login.clickLogin();
        driver.quit();

    }
}