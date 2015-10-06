package mobile.test;

import java.net.MalformedURLException;
import java.net.URL;





import org.openqa.selenium.WebDriver;



import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class SafariLaunchIOS {


public static void main(String args[]) throws Exception{


	 WebDriver driver = new IPhoneDriver("http://localhost:5555/wd/hub");



DesiredCapabilities caps = DesiredCapabilities.iphone();

caps.setCapability("appiumVersion", "1.4.0");

caps.setCapability("deviceName","iPhone 6");

caps.setCapability("deviceOrientation", "portrait");

caps.setCapability("platformVersion","8.3");

caps.setCapability("platformName", "iOS");

caps.setCapability("browserName", "Safari");

//driver = new RemoteWebDriver(new URL("http://192.168.2.15:3001/wd/hub"), caps);


System.out.println("Launched application "+driver);


driver.get("https://www.google.co.in/");

}




}

