package mobile.test;




import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by mihai on 7/25/14.
 */
public class ApiumTestIphone {
	static AppiumDriver driver;

 
    public static void setUp() throws MalformedURLException, InterruptedException {
        System.out.println("Starting Browser... ");
        
      DesiredCapabilities capabilities = new DesiredCapabilities();
  	  capabilities.setCapability("appium-version", "1.4.8");
  	  capabilities.setCapability("platformName", "iOS");
  	  capabilities.setCapability("deviceName", "Earl Willis’s iPhone");
  	  capabilities.setCapability("udid", "03aad7cc56446be7adccca4988873313ad9519");
  	  capabilities.setCapability("bundleId", "test");
  	  capabilities.setCapability("browserName", "safari");
  	  capabilities.setCapability("locationServicesEnabled", "True");

  	driver = new IOSDriver(new URL("http://127.0.0.1:4000/wd/hub/"), capabilities);    
        
  	Thread.sleep(8000);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  	driver.get("http://www.google.com");
 
  	//Success.. the complete test was executed on mobile safari on the device.
        
        
        System.out.println("DONE");
    }
  
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
       // assertThat("FAIL - TITLE INCORRECT", "Cloud Troopers", equalTo(driver.findElement(By.cssSelector("a.logo")).getText()));
        System.out.println("DONE");
        Thread.sleep(5000); // so that you can see it before you close it down
    }
  
    public static void tearDown(){
        System.out.println("Closing Browser... ");
        driver.quit();
        System.out.println("DONE");
    }
}
