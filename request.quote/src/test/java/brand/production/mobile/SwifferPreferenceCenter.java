package brand.production.mobile;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SwifferPreferenceCenter {
	private static WebDriver driver;
	 
	 public static final String USERNAME = "zaqwsx1";
	  public static final String AUTOMATE_KEY = "Fs54nwmULt7BaSTosZxi";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	 
	 
	  public String browser_type;
	  public String fail,error,url,rotate;
	  public String baseUrl = "https://uat.charmin.com/en-us";
	  
		static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	    int counter=1;
		String local=(new java.io.File("").getAbsolutePath());
		String data="" + local + "/" + "homepage.csv";	
		String data2="" + local + "/" + "homepage.csv";	
		String myTitle;
		String csvFileToRead;
		String slide1 = "Today's Fresh Fish";
	    String safe = "https://10.10.10.34:8080/job/TESTNG3/ws/PageLoads1";
	  @Test(groups = {"create"})
		@Parameters({"browser"})
	  @BeforeClass
	  public void beforeClass(String browser) throws IOException, InterruptedException
	  {	   
		  
		  
		  
		  if (browser.equals("safari")) {
			  driver=browserSafari();
			  csvFileToRead = data2;
			}
		  
		  else if (browser.equals("iPhone6Plus")) {
			  driver=iPhone6Plus();
			  csvFileToRead = data2;
			}
		  
		  else if (browser.equals("mobileGalaxyS5")) {
			  driver=mobileGalaxyS5();
			  csvFileToRead = data2;
			}
		  
		  else if (browser.equals("browserFirefox")) {
			  driver=browserFirefox();
			  csvFileToRead = data2;
			}
		  
		  
		  
		  
		  
		  
		 
		

	
		  
		  String name=""+ browser+"/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture.png";
		 
			  System.out.println("Let me see which one get tested " +browser);
			  System.out.println("Image Name " +name);

			  
		 
		  System.out.println("Let me run get driver "+driver);
		  fail="/failed/" + browser +"_"+ counter + "_" + "Failed.png";
			 
		  
		  
		 
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
		        
		      //------------------Blank Login-----------------------------------
				driver.get("pepto-bismol.com");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
			//	driver.findElement(By.className("nav-open-btn")).click();
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
				driver.findElement(By.linkText("Login")).click();
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.id("phdesktopbody_0_submit")).click();
				 System.out.println("I want to take a picture of the blank page");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "No_user_password.png";
		        takeScreenPortrait(name);
		        System.out.println("Image Name " +name);
		        counter+=1;
			     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					
				
					////Assert.assertTrue(logo.isDisplayed());
			   //------------------Wrong Login-----------------------------------
			     
			     driver.findElement(By.id("phdesktopbody_0_username")).click();
			      driver.findElement(By.id("phdesktopbody_0_username")).sendKeys("albert.golubev@pkt.com");
			      driver.findElement(By.id("phdesktopbody_0_password")).clear();
			      driver.findElement(By.id("phdesktopbody_0_password")).sendKeys("zaq12wsx1234");
			      driver.findElement(By.id("phdesktopbody_0_submit")).click();
			      
			      System.out.println("I want to take a picture of the Wrong Login");
			      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "Wrong.png";
			        takeScreenPortrait(name);
			        System.out.println("Image Name " +name);
			        counter+=1;
			     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			     driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
					//////Assert.assertTrue(logo.isDisplayed());
			     //------------------Right Login 
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			      driver.findElement(By.id("phdesktopbody_0_password")).clear();
			      driver.findElement(By.id("phdesktopbody_0_password")).sendKeys("zaq12wsx");
			      driver.findElement(By.id("phdesktopbody_0_submit")).click();
			      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			      System.out.println("I want to take a picture of the Right Login");
			      name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "rightlogin.png";
			        takeScreenPortrait(name);
			        System.out.println("Image Name " +name);
			        counter+=1;
			     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				//	////Assert.assertTrue(logo.isDisplayed());
			     
			     //--------------------I want to change password
			     driver.findElement(By.id("phdesktopbody_0_HlinkEdit")).click();
			 	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			     driver.findElement(By.id("phdesktopbody_0_HlinkReset")).click();
			     driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			 	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				Thread.sleep(100); 
			 	WebElement logo = driver.findElement(By.id("phdesktopbody_0_LoginSubmitBtn"));
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				Assert.assertTrue(logo.isDisplayed());
			     System.out.println("I want to see the blank fields on reset passwrd");
			     driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			      driver.findElement(By.id("phdesktopbody_0_LoginSubmitBtn")).click();
			   	counter+=1;
			      driver.manage().timeouts().implicitlyWait(450, TimeUnit.SECONDS);
			      name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "Blank_Reset.png";
			        takeScreenPortrait(name);
			        System.out.println("Image Name " +name);
			        counter+=1;
				     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
						////Assert.assertTrue(logo.isDisplayed());
				     driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				     driver.findElement(By.id("phdesktopbody_0_username")).sendKeys("aik1771#yasasf.com");
				     driver.findElement(By.id("phdesktopbody_0_zipcode")).sendKeys("11235");
				     driver.findElement(By.id("phdesktopbody_0_LoginSubmitBtn")).click();
				     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				  	counter+=1;
				     System.out.println("I want to see the wrong user and zipcode errors ");
			      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
			      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
			      name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "wrong_user_zip.png";
			        takeScreenPortrait(name);
			        System.out.println("Image Name " +name);
			        counter+=1;
				     
				     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
						////Assert.assertTrue(logo.isDisplayed());
				     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				     driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				     System.out.println("I want to see the right user and zipcode to let me change the password");
			      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
			      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
			      driver.findElement(By.id("phdesktopbody_0_username")).clear();
			      driver.findElement(By.id("phdesktopbody_0_username")).sendKeys("albert.golubev@pkt.com");
			      driver.findElement(By.id("phdesktopbody_0_zipcode")).clear();
				     driver.findElement(By.id("phdesktopbody_0_zipcode")).sendKeys("11211");
				     driver.findElement(By.id("phdesktopbody_0_LoginSubmitBtn")).click();
				  	counter+=1;
				  	name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "right_user_zip.png";
			        takeScreenPortrait(name);
			        System.out.println("Image Name " +name);
			        counter+=1;
				     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
						////Assert.assertTrue(logo.isDisplayed());
				     System.out.println("I want to see the blank fields on set passwrd");
				      
				    //  driver.findElement(By.id("phdesktopbody_0_submit")).click();
				      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
							////Assert.assertTrue(logo.isDisplayed());
				      driver.manage().timeouts().implicitlyWait(450, TimeUnit.SECONDS);
				 
				   	name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "blank_submit_password_set.png";
			        takeScreenPortrait(name);
			        System.out.println("Image Name " +name);
			        counter+=1;
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
							////Assert.assertTrue(logo.isDisplayed());
					   //----------------------Submit password that's short 
					    // driver.findElement(By.name("phdesktopbody_0$password")).sendKeys("aik1");
					     Thread.sleep(200); 
					     driver.findElement(By.id("phdesktopbody_0_password")).sendKeys("aik1");
					     driver.findElement(By.id("showpassword")).click();
					      driver.findElement(By.id("phdesktopbody_0_ResetSubmitBtn")).click();
					     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
							////Assert.assertTrue(logo.isDisplayed());
					     name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "short password.png";
					        takeScreenPortrait(name);
					        System.out.println("Image Name " +name);
					        counter+=1;
					     System.out.println("I want to type in password less then 8 characters & click on show password & submit ");
				      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
				      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
				      name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "less_8_char.png";
				        takeScreenPortrait(name);
				        System.out.println("Image Name " +name);
				        counter+=1;
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
							////Assert.assertTrue(logo.isDisplayed());
					//----------------------Submit password only numbers 1-8     
					     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					     
					     driver.findElement(By.id("phdesktopbody_0_password")).clear();
					     driver.findElement(By.id("phdesktopbody_0_password")).sendKeys("12345678");
					     driver.findElement(By.id("showpassword")).click();
					      driver.findElement(By.id("phdesktopbody_0_ResetSubmitBtn")).click();
					     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

					     System.out.println("I want to submit only numbers my password 1-8 ");
				      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
				      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
				      name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "only_numbers.png";
				        takeScreenPortrait(name);
				        System.out.println("Image Name " +name);
				        counter+=1;
					     
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
							////Assert.assertTrue(logo.isDisplayed());
					     
							//----------------------Submit password only combination of up to 8 chars upper or lower    
							     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
							     
							     driver.findElement(By.id("phdesktopbody_0_password")).clear();
							     driver.findElement(By.id("phdesktopbody_0_password")).sendKeys("ABCabcdA");
							     driver.findElement(By.id("showpassword")).click();
							      driver.findElement(By.id("phdesktopbody_0_ResetSubmitBtn")).click();
							     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

							     System.out.println("I want to submit only up to 8 chars upper or lower");
						      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
						      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
						      name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "only_capital_not_char.png";
						        takeScreenPortrait(name);
						        System.out.println("Image Name " +name);
						        counter+=1;
							     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
									////Assert.assertTrue(logo.isDisplayed()); 
							     
							   //----------------------Submit password that's valid match starting test zaq12wsx   
							     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
							     
							     driver.findElement(By.id("phdesktopbody_0_password")).clear();
							     driver.findElement(By.id("phdesktopbody_0_password")).sendKeys("zaq12wsx");
							     driver.findElement(By.id("showpassword")).click();
							      driver.findElement(By.id("phdesktopbody_0_ResetSubmitBtn")).click();
							     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

							     System.out.println("I want to submit password that I originaly used");
						      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
						      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
						      name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "original_password.png";
						        takeScreenPortrait(name);
						        System.out.println("Image Name " +name);
						        counter+=1;     
							     
							     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
									////Assert.assertTrue(logo.isDisplayed());
							     
							   //------------------Right Login After I changed password
									driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
									driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
									 driver.findElement(By.id("phdesktopbody_0_username")).clear();
								      driver.findElement(By.id("phdesktopbody_0_username")).sendKeys("albert.golubev@pkt.com");
							      driver.findElement(By.id("phdesktopbody_0_password")).clear();
							      driver.findElement(By.id("phdesktopbody_0_password")).sendKeys("zaq12wsx");
							      driver.findElement(By.id("phdesktopbody_0_submit")).click();
							      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
									driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
									driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
							      System.out.println("I want to take a picture of the Right Login");
							      name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "logged_in.png";
							        takeScreenPortrait(name);
							        System.out.println("Image Name " +name);
							        counter+=1;
							     
							     
							     
								 
					     
		        
		        
		       
		        
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

	
	 
	 public WebDriver browserChrome() throws MalformedURLException  
	 {  
	  
		 System.out.println("Let me run mobileGalaxyS3");
		 String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "Chrome");
		 caps.setCapability("browser_version", "39.0");
		 caps.setCapability("os", "OS X");
		 caps.setCapability("os_version", "Mountain Lion");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.debug", "true");
		 caps.setCapability("acceptSslCerts", "true");
		 caps.setCapability("browserstack.selenium_version", "2.47.1");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Chrome 39 MAC OS");
	      browser_type="browserChrome39";
	      System.out.println("Let me see which one get tested" +browser_type);
	      System.out.println("Let me see which one get tested" +driver);
	      driver.get("http://www.publicis.com/");
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      System.out.println(data);
	      return driver;
	   
	    
	      
	 }
	 
	 public WebDriver browserFirefox() throws MalformedURLException  
	 {  
	  
		 System.out.println("Let me run in Firefox");
		 String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "Firefox");
		 caps.setCapability("browser_version", "39.0");
		 caps.setCapability("os", "OS X");
		 caps.setCapability("os_version", "Mavericks");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.debug", "true");
		 caps.setCapability("browserstack.selenium_version", "2.47.1");
			
		 caps.setCapability("acceptSslCerts", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Firefox  39 MAC OS");
	      browser_type=" browserFirefox";
	      System.out.println("Let me see which one get tested" +browser_type);
	      System.out.println("Let me see which one get tested" +driver);
	      driver.get("http://www.publicis.com/");
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      System.out.println(data);
	      return driver;
	   
	    
	      
	 }
	 
	 public WebDriver browserAndroidTablet() throws MalformedURLException  
	 {  
	  
		 System.out.println("Let me run Galaxy Tablet");
		 String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Samsung Galaxy Note 10.1");
		 caps.setCapability("browserstack.debug", "true");
		 caps.setCapability("browserstack.selenium_version", "2.47.1");
			
		 caps.setCapability("acceptSslCerts", "true");
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Firefox  39 MAC OS");
	      browser_type="browserChrome39";
	      System.out.println("Let me see which one get tested" +browser_type);
	      System.out.println("Let me see which one get tested" +driver);
	      driver.get("http://www.publicis.com/");
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      System.out.println(data);
	      return driver;
	   
	    
	      
	 }
	 
	 public WebDriver mobileGalaxyS5() throws MalformedURLException  
	 {  
	  
		 System.out.println("Let me run on Galaxy S5");
		 String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "android");
		 caps.setCapability("platform", "ANDROID");
		 caps.setCapability("device", "Samsung Galaxy S5");
		 caps.setCapability("browserstack.debug", "true");
		 caps.setCapability("acceptSslCerts", "true");
		
			
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run on Galaxy S5");
	      browser_type="mobileGalaxyS5";
	      System.out.println("Let me see which one get tested" +browser_type);
	      System.out.println("Let me see which one get tested" +driver);
	      driver.get("http://google.com");
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	      System.out.println(data);
	      return driver;
	   
	    
	      
	 }
	 
	 public WebDriver iPhone6Plus() throws MalformedURLException  
	 {  
	  
		 System.out.println("Let me run on Galaxy S5");
		 String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browserName", "iPhone");
		 caps.setCapability("platform", "MAC");
		 caps.setCapability("device", "iPhone 6 Plus");
		 caps.setCapability("browserstack.debug", "true");
		 caps.setCapability("acceptSslCerts", "true");
		
			
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run on Galaxy S5");
	      browser_type="iPhone6Plus";
	      System.out.println("Let me see which one get tested" +browser_type);
	      System.out.println("Let me see which one get tested" +driver);
	      driver.get("http://google.com");
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	      System.out.println(data);
	      return driver;
	   
	    
	      
	 }
	 
	 
	 
	 public WebDriver browserSafari() throws MalformedURLException  
	 {  
	  
		 browser_type="safari";
		 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "Safari");
		 caps.setCapability("browser_version", "8.0");
		 caps.setCapability("os", "OS X");
		 caps.setCapability("os_version", "Yosemite");
		 caps.setCapability("resolution", "1024x768");
		 caps.setCapability("browserstack.debug", "true");
		 caps.setCapability("acceptSslCerts", "true");
		 caps.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
		    driver = new RemoteWebDriver(new URL(URL), caps);
	      System.out.println("Let me run Safari");
	      driver.manage().window().maximize();
	      driver.get("https://dawn-dish.com/en-us/resetpasswordpage");
	      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		    
		    //assign key board object
		    //   Keyboard keyboard=((HasInputDevices) driver).getKeyboard();
		       //enter a key
		     //  keyboard.pressKey(Keys.ENTER);
	      
		    try 
		    {
		        //Handle the alert pop-up using seithTO alert statement
		        Alert alert = driver.switchTo().alert();

		        //Print alert is present
		        System.out.println("Alert is present");

		        //get the message which is present on pop-up
		        String message = alert.getText();

		        //print the pop-up message
		        System.out.println(message);

		        alert.sendKeys("");
		        //Click on OK button on pop-up
		        alert.accept();
		    } 
		    catch (NoAlertPresentException e) 
		    {
		        //if alert is not present print message
		        System.out.println("alert is not present");
		    }
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