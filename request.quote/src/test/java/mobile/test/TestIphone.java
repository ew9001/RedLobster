package mobile.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by mihai on 7/25/14.
 */
public class TestIphone {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        System.out.println("Starting Browser... ");
        DesiredCapabilities cap = DesiredCapabilities.ipad();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); // -- in case there aren't any certs yet
        driver = new RemoteWebDriver(new URL("http://192.168.2.15:3001/wd/hub"), cap); // replace localhost with the IP where the hub will be running, I use mine on the same computer for this example
        System.out.println("DONE");
    }
    @Test
    public void ipadTest() throws MalformedURLException, InterruptedException {
        System.out.println("Step 1: Going to the URL...");
        driver.get("http://www.cloudtroopers.com/");
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("a[title='Apply']"))));
        System.out.println("DONE");
        System.out.println("Step 2: Clicking Apply...");
        driver.findElement(By.cssSelector("a[title='Apply']")).click(); // a generic page would yield less code
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(driver.findElement(By.className("form-group"))));
        System.out.println("DONE");
        System.out.println("Step 3: Validating title...");
        assertThat("FAIL - TITLE INCORRECT", "Cloud Troopers", equalTo(driver.findElement(By.cssSelector("a.logo")).getText()));
        System.out.println("DONE");
        Thread.sleep(5000); // so that you can see it before you close it down
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("Closing Browser... ");
        driver.quit();
        System.out.println("DONE");
    }
}
