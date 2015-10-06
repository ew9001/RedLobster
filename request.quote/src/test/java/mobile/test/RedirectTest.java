package mobile.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ext.test4j.apache.commons.io.FileUtils;

public class RedirectTest {
	public static final String USERNAME = "zaqwsx1";
	  public static final String AUTOMATE_KEY = "Fs54nwmULt7BaSTosZxi";
	  
	@Test
	public static void main(String[] args) throws Exception {
		 
		RedirectTest obj = new RedirectTest();
		obj.run();
	 
	  }
	 
	  public void run() throws Exception {
		  String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
		  String local=(new java.io.File("").getAbsolutePath());
		  DesiredCapabilities caps = new DesiredCapabilities();
		  String temp;
		  String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		  caps.setCapability("browser", "Firefox");
		  caps.setCapability("browser_version", "35.0");
		  caps.setCapability("os", "Windows");
		  caps.setCapability("os_version", "7");
		  caps.setCapability("resolution", "1024x768");
		    caps.setCapability("browserstack.debug", "true");

		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.get("http://www.google.com/ncr");
	
			String data="" + local + "/" + "redirectlist.csv";	
			int row=1;
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		
		
		
		// @SuppressWarnings("deprecation")
	//	WebDriver driver = new IPhoneDriver("http://192.168.2.6:3001/wd/hub/");
		
		  //Write a review
		  
		 
		try {
	 
			br = new BufferedReader(new FileReader(data));
			while ((line = br.readLine()) != null) {
	 
			        // use comma as separator
				String[] product = line.split(cvsSplitBy);
	 
				System.out.println("{Product [code= " + product[0] 
	                                 + " , name=" + product[1] + "]");
				 driver.get(product[0]);
	
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 
				 temp = driver.getCurrentUrl();
				 
				 if (temp!=product[1])
				 {
					 
						row+=1;
						System.out.println(row + "mismatch" + temp + " " + product[1] + "\n");
					 
				 }
				
				 
					
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
					//	
				//	driver.findElement(By.id('not-there')).then(function(element) {
					//	  alert('Found an element that was not expected to be there!');
						///}, function(error) {
						  //alert('The element was not found, as expected');
					///	});
					//((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);
					
					
			}
		
			

			
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
		System.out.println("Done");
	  }

}
