import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        return new Object[][]{

                {"admin","admin123"},
                {"test","test123"}

        };
    }

    @Test(dataProvider = "loginData")
    public void login(String user,
                      String pass) {

        System.out.println(user);
        System.out.println(pass);

    }
}