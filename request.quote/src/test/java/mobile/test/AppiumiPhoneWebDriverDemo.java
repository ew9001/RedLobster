package mobile.test;

import java.net.URL;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumiPhoneWebDriverDemo {

    private String baseUrl;
	public WebDriver driver = null;

    @Before
    public void setup() throws Exception
    {

    
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("device", "iPhone");
    	capabilities.setCapability("udid", "1234567890abcdef");
    	capabilities.setCapability("bundleid", "com.pkt.iphone.WebViewIphone-cal");
    	capabilities.setCapability("ipa", "WebViewIphone6.ipa");
    	driver = new RemoteWebDriver( new URL("http://192.168.2.15:3001/wd/hub"), capabilities);
    baseUrl = "http://www.cnn.com";

    }   

    @After
    public void tearDown() throws Exception
    {

    driver.quit();

    }


    @Test
    public void test_searchWorks() throws Exception
    {
        this.driver.get(baseUrl);

        driver.quit();
    }

  }