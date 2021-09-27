import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GeneralExamples extends Base{

    @BeforeTest
    public void initialize() {
        driver = initializeDriver();
    }

    @Test
    public void testGet() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000); //for academic purpose

        driver.get("https://stackoverflow.com/");
        Thread.sleep(2000); //for academic purpose

        driver.get("https://rpp.pe/");
        Thread.sleep(2000); //for academic purpose
    }

    @Test
    public void testBackForward() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000); //for academic purpose

        driver.get("https://stackoverflow.com/");
        Thread.sleep(2000); //for academic purpose

        driver.navigate().back(); //navigate to google
        Thread.sleep(2000); //for academic purpose

        driver.navigate().forward(); //navigate to stackoverflow
        Thread.sleep(2000); //for academic purpose
    }

    @Test
    public void testGetCurrentURL() throws InterruptedException {
        String url;
        driver.get("https://www.google.com/");
        Thread.sleep(2000); //for academic purpose
        url = driver.getCurrentUrl(); //get the current url
        System.out.println("the current url is: " + url); //prints the current url
    }

    @Test
    public void testGetTitle() throws InterruptedException {
        String pageTitle;
        driver.get("https://www.google.com/");
        Thread.sleep(2000); //for academic purpose
        pageTitle = driver.getTitle(); //get the current page title
        System.out.println("the current page title is: " + pageTitle); //prints the current page title
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}
