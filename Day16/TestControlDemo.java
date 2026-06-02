import org.testng.annotations.Test;

public class TestControlDemo {

    @Test(priority = 1)
    public void login() {

        System.out.println("Login");

    }

    @Test(priority = 2,
            dependsOnMethods = "login")
    public void search() {

        System.out.println("Search Product");

    }

    @Test(priority = 3,
            enabled = false)
    public void payment() {

        System.out.println("Payment");

    }
}