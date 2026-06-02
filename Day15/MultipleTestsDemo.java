import org.testng.annotations.*;
public class MultipleTestsDemo {
    @BeforeClass
    public void setup() {
        System.out.println("Browser Open");
    }
    @Test
    public void login() {
        System.out.println("Login");
    }
    @Test
    public void search() {
        System.out.println("Search Product");
    }
    @AfterClass
    public void close() {
        System.out.println("Browser Close");
    }
}