package data;
import org.testng.annotations.DataProvider;

public class StaticProviderDiv {
    @DataProvider(name = "dataForRes", parallel = true)
    public static Object[][] dataForDivTest(){
        return new Object[][] {
                {4, 2, 2},
                {0.4, 0.5, 0.8},
                {1.5, 3, 0.5},
                {-4, 2, -2},
                {4, -2, -2},
                {-4, -2, 2},
                {0, -2.2, 0},
                {0, 5.5, 0}
        };
    }
}
