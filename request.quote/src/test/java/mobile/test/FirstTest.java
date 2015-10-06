package mobile.test;



import java.io.File;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

  public WebDriver driver = null;

  @BeforeMethod
  public void setUp() throws Exception {

    // set up appium

	 
	  DesiredCapabilities capabilities = new DesiredCapabilities();
  	capabilities.setCapability("device", "iPhone");
  	capabilities.setCapability("udid", "03aad7cc56446be7adccca4988873313ad951969");
  	capabilities.setCapability("bundleid", "com.pkt.iphone.WebViewIphone-cal");
  	capabilities.setCapability("ipa", "/Users/agolubev1/Desktop/WebViewIphone.ipa");
  	driver = new RemoteWebDriver( new URL("http://192.168.2.15:3001/wd/hub"), capabilities);

    System.out.println("App launched");
    driver.get("http://yahoo.com");
  }

  @AfterMethod
  public void tearDown() throws Exception {
    driver.quit();
  }

  @Test
  public void testCases() throws InterruptedException {

    String myname = "Smriti";
    System.out.println("QA");
    driver.findElement(By.name("Add")).click();
    driver.findElement(By.xpath("//textfield[1]")).sendKeys(myname);
    driver.findElement(By.name("Save")).click();

    Thread.sleep(5000);

    // write all your tests here

  }
}