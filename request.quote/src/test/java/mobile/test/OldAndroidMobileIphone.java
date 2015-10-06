package mobile.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ext.test4j.apache.commons.io.FileUtils;

public class OldAndroidMobileIphone {
	
	private static WebDriver driver;
	 
	 public static final String USERNAME = "zaqwsx1";
	  public static final String AUTOMATE_KEY = "Fs54nwmULt7BaSTosZxi";
	  public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	 
	 
	  public String browser_type;
	  public String fail,error,url,rotate;
	  public String baseUrl = "http://uat.charmin.pgsitecore.com/en-us";
	  
		static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	    int counter=1;
		String local=(new java.io.File("").getAbsolutePath());
		
		String data="" + local + "/" + "all_charmin_products.csv";	
		String data2="" + local + "/" + "all_charmin_products.csv";	
		String myTitle;
		String csvFileToRead;
		int row = 0;
	    String safe = "http://10.10.10.34:8080/job/TESTNG3/ws/PageLoads";
	 
	   @Test 
	  public void beforeClass() throws IOException, InterruptedException
	  {	   
		  
		  
		  
			 
		  
		  
		 
		    BufferedReader br =null;
		    String line="";
		    String browser="title";
		    String ext = "png";
		    File dir = new File("/users/agolubev1/Desktop/RondAndroid");
		    WebDriver driver = new AndroidDriver();
		    int lineNumber = 0;
		    System.out.println(data);
		    br = new BufferedReader(new FileReader(csvFileToRead));  
		    
		    while ((line = br.readLine()) != null) {
		  	  
		        System.out.println("The URL is " + counter);
		        String [] nextLine = line.split(",");
		        // nextLine[] is an array of values from the line
		        System.out.println(nextLine[lineNumber]);
		        url=nextLine[lineNumber];
		        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        System.out.println("The URL is " + url);	
	//	        System.out.println("Image Name " +name);
		        driver.get(url);
		       
		       // for (int second = 0;; second++) {
			    //	if (second >= 60);
			    	//try { if ("Â© 2014 Procter & Gamble".equals(driver.findElement(By.cssSelector("div.copyRights > div.text.mode1 > div")).getText())) break; } catch (Exception e) {}
			    	//Thread.sleep(1000);
			    //} changed
		        
		        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		     
		  
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				 
				 Select sel = new Select(driver.findElement(By.id("phsmartphonebody_0_phsmartphoneproductprimarycontentarea_0_ddlQuantity")));
			     sel.selectByValue(nextLine[3]);
			     
			     ((JavascriptExecutor) driver).executeScript("scroll(0,450);");
			 
			     
			    
			     
			     driver.findElement(By.linkText(nextLine[1])).click();
			     
			   
			     
			     
			     driver.findElement(By.linkText(nextLine[2])).click();
			     
				 File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile2, new File("Y://Screenshots/alik11/landscape/" + browser +"/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "charmin.png"));
					row+=1;
			     driver.findElement(By.id("phsmartphonebody_0_phsmartphoneproductprimarycontentarea_0_lnkAddToCart")).click();
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			     
			     
				 File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile1, new File("Y://Screenshots/alik11/landscape/"  + browser +"/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "charmin.png"));
					row+=1;
					
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
					//	
				//	driver.findElement(By.id('not-there')).then(function(element) {
					//	  alert('Found an element that was not expected to be there!');
						///}, function(error) {
						  //alert('The element was not found, as expected');
					///	});
					//((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);
					
		    

		      }
	
		 
	    	 driver.quit();   
		
	  }
	
	  public void beforeTest()
	  {
		  System.out.println("Let me run beforeTest");
	  }  
	 
	 
	
	  
	  

}
