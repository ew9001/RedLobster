package brand.charmin;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class CharminAddCartBrowserStack {

  public static final String USERNAME = "zaqwsx1";
  public static final String AUTOMATE_KEY = "Fs54nwmULt7BaSTosZxi";
  public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
  
  public static void main(String[] args) throws Exception {
    
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browserName", "iPhone");
    caps.setCapability("platform", "MAC");
    caps.setCapability("device", "iPhone 5S");
    caps.setCapability("browserstack.debug", "true");
    caps.setCapability("browserstack.local", "true");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://www.google.com/ncr");
    
    driver.quit();

  }
}
