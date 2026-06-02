import org.testng.annotations.Test;

public class DependencyDemo {

    @Test
    public void login() {

        System.out.println("Login Success");

    }

    @Test(dependsOnMethods = "login")
    public void searchProduct() {

        System.out.println("Search Product");

    }
}