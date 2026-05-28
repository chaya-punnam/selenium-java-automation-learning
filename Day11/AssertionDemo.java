import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

    @Test
    public void titleTest() {

        String actual = "Google";

        String expected = "Google";

        Assert.assertEquals(actual, expected);

        System.out.println("Test Passed");

    }
}