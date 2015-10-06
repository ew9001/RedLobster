package mobile.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class appiumTest {

static AppiumDriver driver;

public static void main(String[] args) throws MalformedURLException, InterruptedException {
	// TODO Auto-generated method stub
	//192.168.6.114
	System.out.println("Starting . . . ");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("platformVersion", "8.1");
	capabilities.setCapability("platformName", "iOS");
	capabilities.setCapability("deviceName", "iPhone 6");
	File app = new File("/Users/user/Documents/TestApp/Joyious.app");
	capabilities.setCapability("app", app.getAbsolutePath());
	driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	Thread.sleep(8000);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
	Thread.sleep(3000);
	System.out.println("Thats all folks!");
	
}
}