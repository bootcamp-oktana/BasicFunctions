import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//this class is for testng2
public class TestNGExample2 extends Base{
    @BeforeTest
    public void initialize() {
        driver = initializeDriver();
    }

    @Test
    public void testExample2_1() throws InterruptedException {
        driver.get("https://stackoverflow.com/");
        System.out.println("we open stackoverflow");
        Thread.sleep(1000); //for academic purpose
    }

    @Test
    public void testExample2_2() throws InterruptedException {
        driver.get("https://www.mi.com/global/");
        System.out.println("we open xiaomi");
        Thread.sleep(1000); //for academic purpose
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}
