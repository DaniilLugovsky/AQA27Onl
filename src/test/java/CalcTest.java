
import data.Retry;
import data.StaticProviderDiv;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CalcTest extends BaseTest {
    @Test(description = "PositiveTest",testName = "TestPositiveInt")
    public void testResultIntegers() {
        Assert.assertEquals(calculator.div(6, 3), 2,"Successfully");
    }
    @Test(description = "PositiveTest",testName = "TestPositiveDoble",dependsOnMethods = "testResultIntegers")
    public void testResultDouble() {
        Assert.assertEquals(calculator.div(0.5, 0.5), 1,"Successfully");
    }
    @Test(testName = "TestNegativInt")
    public void testFallingResultIntegers() {
        Assert.assertEquals(calculator.div(6, 3), 3);
    }
    @Test(testName = "TestNegativDoble", dependsOnMethods = "testFallingResultIntegers", alwaysRun = true )
    public void testFallingResultDouble() {
        Assert.assertEquals(calculator.div(0.5, 0.5), 2);
    }
    @Test(enabled = false,testName = "ExcludedTest")
    public void testResultIntegers1() {
        Assert.assertEquals(calculator.div(6, 3), 2);
    }
    @Test(testName = "TestTimeOutInt",timeOut = 200)
    public void testTimeOutInt() {
        Assert.assertEquals(calculator.div(6, 3), 2);
    }
    @Test(testName = "TestTimeOutDouble",timeOut = 200, dependsOnMethods = "testTimeOutInt")
    public void testTimeDouble() {
        Assert.assertEquals(calculator.div(0.5, 0.5), 1);
    }
    @Test(testName = "TestIntInvocationCount",invocationCount = 4, threadPoolSize = 2)
    public void invocationCountTestInt() {
        Assert.assertEquals(calculator.div(6, 3), 2);
        System.out.println(Thread.currentThread().getName());
    }
    @Test(testName = "TestDoubleInvocationCount",invocationCount = 4, threadPoolSize = 2)
    public void invocationCountTestDouble() {
        Assert.assertEquals(calculator.div(0.5, 0.5), 1);
        System.out.println(Thread.currentThread().getName());
    }
    @Test(testName = "TestInvocationTimeOut",invocationCount = 10, invocationTimeOut = 100)
    public void invocationCountTest(){
        System.out.println(Thread.currentThread().getName());
        Assert.assertEquals(calculator.div(6, 3), 2);
    }
    @Test(testName = "TestDivisionByZero",expectedExceptions = AssertionError.class)
    public void exceptionTestDouble() {
        Assert.assertEquals(calculator.div(0.5, 0), 1);
    }
    @Test(testName = "TestDivisionByZero",expectedExceptions = ArithmeticException.class)
    public void exceptionTestInt() {
        Assert.assertEquals(calculator.div(10, 0), 1);
    }
    @Test(testName = "TestDivisionByZero")
    public void exceptionTestInt1() {
        Assert.assertEquals(calculator.div(0.4, 0.5), 0.8);
    }
    @Test (testName = "TestDataProvider",dataProvider = "dataForRes", dataProviderClass = StaticProviderDiv.class, threadPoolSize = 6)
    public void testDataProvider(double a, double b, double result) {
        System.out.println(Thread.currentThread().getName());
        Assert.assertEquals(calculator.div(a, b), result);
    }
    @Parameters({"login", "password"})
    @Test(testName = "TestParameters")
    public void paramTest(@Optional("login") String loginName, @Optional("1234") String pswValue) {
        System.out.println("Login is: " + loginName);
        System.out.println("Password is: " + pswValue);
    }
    private int attempt = 1;
    @Test(testName = "TestFlaky",retryAnalyzer = Retry.class)
    public void flakyTest() {
        if (attempt == 4) {
            Assert.assertEquals(calculator.div(6, 3), 2);
        }
        else {
            System.out.println("Attept is :" + attempt);
            attempt++;
            throw new NullPointerException();
        }
    }
}
