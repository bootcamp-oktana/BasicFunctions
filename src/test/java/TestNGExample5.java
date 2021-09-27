import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//this class is for testng5
public class TestNGExample5 extends Base{
    @BeforeTest  (alwaysRun = true)
    public void initialize() {
        driver = initializeDriver();
    }

    @Test
    public void testExample5_1() throws InterruptedException {
        driver.get("https://www.oktana.com/");
        System.out.println("we open oktana first");
        Thread.sleep(1000); //for academic purpose
    }

    @Test (dependsOnMethods = { "testExample5_1" })
    public void testExample5_2() throws InterruptedException {
        driver.get("https://www.linkedin.com/");
        System.out.println("we open linkedin second");
        Thread.sleep(1000); //for academic purpose
    }

    @Test (dependsOnMethods = { "testExample5_1", "testExample5_2" })
    public void testExample5_3() throws InterruptedException {
        driver.get("https://www.salesforce.com/");
        System.out.println("we open salesforce third");
        Thread.sleep(1000); //for academic purpose
    }

    @AfterTest(alwaysRun = true)
    public void closeDriver() {
        driver.close();
    }
}
