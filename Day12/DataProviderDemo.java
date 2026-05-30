import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @DataProvider(name = "studentData")
    public Object[][] getData() {

        return new Object[][]{

                {"Ravi"},
                {"Kiran"},
                {"Sai"}

        };
    }

    @Test(dataProvider = "studentData")
    public void printName(String name) {

        System.out.println(name);

    }
}