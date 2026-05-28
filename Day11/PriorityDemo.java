import org.testng.annotations.Test;

public class PriorityDemo {

    @Test(priority = 1)
    public void login() {

        System.out.println("Login Test");

    }

    @Test(priority = 2)
    public void searchProduct() {

        System.out.println("Search Product");

    }

    @Test(priority = 3)
    public void logout() {

        System.out.println("Logout Test");

    }
}