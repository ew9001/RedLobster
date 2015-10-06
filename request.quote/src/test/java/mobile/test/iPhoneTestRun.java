package mobile.test;





import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iPhoneTestRun {
    private static WebDriver driver;
    
    @BeforeMethod
	@BeforeClass
    public void setUp() throws Exception {
    	  DesiredCapabilities capabilities = new DesiredCapabilities();
      	  capabilities.setCapability("appium-version", "1.4.0");
      	  capabilities.setCapability("platformName", "iOS");
      	  capabilities.setCapability("deviceName", "Earl Willis’s iPhone");
      	  capabilities.setCapability("udid", "03aad7cc56446be7adccca4988873313ad9519");
      	  capabilities.setCapability("bundleId", "test");
      	  capabilities.setCapability("browserName", "safari");
        	driver = new IOSDriver(new URL("http://127.0.0.1:4000/wd/hub/"), capabilities);    
        driver.get("http://techblog.polteq.com/prestashop/");
    }
    
    @AfterMethod
	@AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
    
    @Test
    public void measurePerformance() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("ipod nano");
        driver.findElement(By.cssSelector("input[name='submit_search']")).click();
        //String searchHeader = driver.findElement(By.cssSelector("H1")).getText().toLowerCase();
            
   //     AssertJUnit.assertTrue(searchHeader.contains("ipod nano"));
    }
}