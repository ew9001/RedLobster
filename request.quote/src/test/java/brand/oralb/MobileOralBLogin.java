package brand.oralb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MobileOralBLogin {
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
		String data="" + local + "/" + "oralb_login.csv";	
		String data2="" + local + "/" + "oralb_login.csv";	
		String myTitle;
		String csvFileToRead;
	    String safe = "http://10.10.10.34:8080/job/TESTNG3/ws/PageLoads";
	  @Test(groups = {"create"})
		@Parameters({"browser"})
	  @BeforeClass
	  public void beforeClass(String browser) throws IOException, InterruptedException
	  {	   
		  
		  
		  if (browser.equals("mobileGalaxyS3")) {
			  driver=mobileGalaxyS3();
			  csvFileToRead = data;
			  
			}
		  

		 
		  
		  String name=""+ browser+"/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture.png";
		 
			  System.out.println("Let me see which one get tested " +browser);
			  System.out.println("Image Name " +name);

			  
		 
		  System.out.println("Let me run get driver "+driver);
		  fail="/Error/"+ browser+"/Failed/" + timeStamp + "_" + "page_error.png";
			 
		  
		  
		 
		    BufferedReader br =null;
		    String line="";
		    String ext = "png";
		    File dir = new File("/users/agolubev1/Desktop/RondAndroid");
		
		    int lineNumber = 0;

		    br = new BufferedReader(new FileReader(csvFileToRead));  
		    
		    while ((line = br.readLine()) != null) {
		  	  
		        System.out.println("The URL is " + counter);
		        String [] nextLine = line.split(",");
		        // nextLine[] is an array of values from the line
		        System.out.println(nextLine[lineNumber]);
		        url=nextLine[lineNumber];
		        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        System.out.println("The URL is " + url);	
		        System.out.println("Image Name " +name);
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
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        //driver.findElement(By.linkText("LOGIN")).click();
		        name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture-portrait.png";
		        takeScreenPortrait(name);
		        System.out.println("Image Name " +name);
		        name=""+ browser+"/landscape/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture-landscape.png";
		        takeScreenLandscape(name);
		        System.out.println("Image Name " +name);
		        takeScreenPortrait(name);
		        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        driver.findElement(By.id("phsmartphonebody_0_username")).clear();
		        driver.findElement(By.id("phsmartphonebody_0_username")).sendKeys("albert.golubev@pkt.com");
		        driver.findElement(By.id("phsmartphonebody_0_password")).clear();
		        driver.findElement(By.id("phsmartphonebody_0_password")).sendKeys("zaq12wsx");
		        driver.findElement(By.id("phsmartphonebody_0_submit")).click();
		        name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture-portrait.png";
		        takeScreenPortrait(name);
		        System.out.println("Image Name " +name);
		        name=""+ browser+"/landscape/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture-landscape.png";
		        takeScreenLandscape(name);
		        System.out.println("Image Name " +name);
		        takeScreenPortrait(name);
		        counter+=1;
			    
		        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        driver.findElement(By.id("phsmartphoneheader_0_phsmartphoneheadertop_2_LogOffLink")).click();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture-portrait.png";
		        takeScreenPortrait(name);
		        System.out.println("Image Name " +name);
		        name=""+ browser+"/landscape/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture-landscape.png";
		        takeScreenLandscape(name);
		        System.out.println("Image Name " +name);
		        takeScreenPortrait(name);
		        counter+=1;
			    
		        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        driver.findElement(By.id("phsmartphoneheader_0_phsmartphoneheadertop_2_anchrContinue")).click();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture-portrait.png";
		        takeScreenPortrait(name);
		        System.out.println("Image Name " +name);
		        name=""+ browser+"/landscape/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture-landscape.png";
		        takeScreenLandscape(name);
		        counter+=1;
			    
		        System.out.println("Image Name " +name);
		        takeScreenPortrait(name);
		        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		
			     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			       
		        
		        if (browser.equals("mobileiPhone5S")||browser.equals("mobileiPhone4S")||browser.equals("mobileiPhone5")||browser.equals("mobileiPhone5C")||browser.equals("tabletKindleFire2")||browser.equals("tabletKindleFireHD"))
		        {
		        	JavascriptExecutor jse = (JavascriptExecutor)driver;
		        jse.executeScript("scroll(0, 14700)"); //y value '250' can be altered
		        	   driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		        	 name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "Successful-Scrolled-Capture.png";
				        System.out.println("Image Name is  " +name);
				        takeScreenPortrait(name);
		        }
		        
		        counter+=1;
		    

		      }
	
		 
	    	 driver.quit();   
		
	  }
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("Let me run beforeTest");
	  }  
	  @Test
	  public void f()
	  {
	       //your test code here
		  System.out.println("I'm out here print f");
	  }
	 @AfterTest
	 public void afterTest()
	 {
	 }
	 @AfterClass
	 public void afterClass()
	 {
	     driver.quit();
	 }

	
	 
	 public WebDriver mobileGalaxyS3() throws MalformedURLException  
	 {  
	  
		 System.out.println("Let me run mobileGalaxyS3");
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Samsung Galaxy S5");
		 caps.setCapability("browserstack.debug", "true");
		 caps.setCapability("browserstack.local", "true");
		 caps.setCapability("rotatable", true);
		 caps.setCapability("acceptSslCerts", "true");
		 caps.setCapability("deviceOrientation", "landscape");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run mobileGalaxyS3");
	      browser_type="mobileGalaxyS4";
	      System.out.println("Let me see which one get tested" +browser_type);
	      System.out.println("Let me see which one get tested" +driver);
	      driver.get("http://www.tut.by/");
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      System.out.println(data);
	      return driver;
	   
	    
	      
	 } 
	 
	

	 
	 public WebDriver takeScreenLandscape(String name) throws IOException
	 {
		
		 WebDriver augmentedDriver = new Augmenter().augment(driver);
		//  System.out.println("Let me Rotate ");
		//((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
	     System.out.println("Let me take a screenshot " +name);
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     System.out.println("I want to rotate");
	    
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		  
		    myTitle = driver.getTitle();
		    
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    FileUtils.copyFile(screenshot, new File(name));
		    
		    return driver;
	 }
	 public WebDriver takeScreenPortrait(String name) throws IOException
	 {
		
		 WebDriver augmentedDriver = new Augmenter().augment(driver);
		//  System.out.println("Let me Rotate ");
	//	((Rotatable)augmentedDriver).rotate(ScreenOrientation.PORTRAIT);
	     System.out.println("Let me take a screenshot " +name);
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     System.out.println("I want to rotate");
	    
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		  
		    myTitle = driver.getTitle();
		    
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    FileUtils.copyFile(screenshot, new File(name));
		    
		    return driver;
	 }
	
	 
	 
	 @AfterMethod(alwaysRun = true, description = "take screenshot on fails") 
	 public void afterMethod_takeScreenshot(ITestResult result) throws Exception { 
	 if (!result.isSuccess()) { 
		 

		 WebDriver augmentedDriver = new Augmenter().augment(driver);
	     System.out.println("I found a bug placed a screen shot @ ContactUS");
		  
		    	
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);

		   
		    FileUtils.copyFile(screenshot, new File(fail));
	
	 } 
	 }

}