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
import java.util.List;
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

public class CrestLinks {
	public static final String USERNAME = "zaqwsx1";
	  public static final String AUTOMATE_KEY = "Fs54nwmULt7BaSTosZxi";
	  
	@Test
	public static void main(String[] args) throws Exception {
		 
		CrestLinks obj = new CrestLinks();
		obj.run();
	 
	  }
	@Test
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
		    caps.setCapability("browserstack.local", "true");

		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.get("http://www.google.com/ncr");
	
			String data="" + local + "/" + "crest_links.csv";	
			String s,actualTitle = "";
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
	                                 + " , name=" + product[0] + "]");
				 driver.get(product[0]);
	
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 
				 temp = driver.getCurrentUrl();
				 
				
				 WebElement box = driver.findElement(By.xpath("//*[@id='blq-main']/div/div[2]/div[1]/div[2]"));
					List <WebElement> allLinks = box.findElements(By.tagName("a"));
					System.out.println("Total links ----> " + allLinks.size());
					
					//print the name of all links in a particular section and clicking on them
					//we have to use a for loop to step through our 'box' or 'array' of items
					
					for(int i=0; i<allLinks.size(); i++){
						System.out.println(allLinks.get(i).getText());
						allLinks.get(i).click();
						System.out.println(driver.getTitle());
						s = String.valueOf(i);
						actualTitle = driver.getTitle();
						System.out.println(actualTitle);
						//take screenshots
						File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					
						FileUtils.copyFile(scrFile, new File (local  + "_"+s +".png"));
						//System.out.println(file_name);
						 driver.get(product[0]);
						
						//build cache - because array is temporarily saved in cache then cleaned when we navigate away
						box = driver.findElement(By.xpath("//*[@id='blq-main']/div/div[2]/div[1]/div[2]"));
						allLinks = box.findElements(By.tagName("a"));
						System.out.println("*************************");
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
