import org.testng.annotations.Test;

public class GroupsDemo {

    @Test(groups = {"smoke"})
    public void login() {

        System.out.println("Login Test");

    }

    @Test(groups = {"smoke"})
    public void logout() {

        System.out.println("Logout Test");

    }

    @Test(groups = {"regression"})
    public void payment() {

        System.out.println("Payment Test");

    }
}