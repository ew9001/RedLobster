package redlobster.desktop;

import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;

import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleGoogleTest  {

	public void testGoogleCanGiveWeatherResults() { 
		 // Create a WebDriver instance with the activity in which we want the test to run. 
		 WebDriver driver = new AndroidDriver(null, null); 
		 // Let’s open a web page 
		 driver.get("http://www.google.com"); 
      
	}
}