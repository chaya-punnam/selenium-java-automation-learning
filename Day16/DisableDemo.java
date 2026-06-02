import org.testng.annotations.Test;

public class DisableDemo {

    @Test
    public void login() {

        System.out.println("Login Test");

    }

    @Test(enabled = false)
    public void payment() {

        System.out.println("Payment Test");

    }
}