package mobile.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ext.test4j.apache.commons.io.FileUtils;

public class SingleCharminMobileIphone {
	
	public static void main(String[] args) throws Exception {
		 
		SingleCharminMobileIphone obj = new SingleCharminMobileIphone();
		obj.run();
	 
	  }
	 
	  public void run() throws Exception {
		  String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
		  String local=(new java.io.File("").getAbsolutePath());
			String data="" + local + "/" + "all_charmin_products_single.csv";	
			int row=1;
			String browser="iphone5";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		
		
		
		// @SuppressWarnings("deprecation")
		WebDriver driver = new IPhoneDriver("http://192.168.2.2:3001/wd/hub/");
		
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
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				 
				 Select sel = new Select(driver.findElement(By.id("phsmartphonebody_0_phsmartphoneproductprimarycontentarea_0_ddlQuantity")));
			     sel.selectByValue(product[2]);
			     
			     ((JavascriptExecutor) driver).executeScript("scroll(0,450);");
			 
			     
			    
			     
			     driver.findElement(By.linkText(product[1])).click();
			     
			   
			     
			     
			     //driver.findElement(By.linkText(product[2])).click();
			     
				 File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile2, new File("Y://Screenshots/alik11/" + browser +"/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "cadilac.png"));
					row+=1;
			     driver.findElement(By.id("phsmartphonebody_0_phsmartphoneproductprimarycontentarea_0_lnkAddToCart")).click();
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			     
			     
				 File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile1, new File("Y://Screenshots/alik11/"  + browser +"/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "cadilac.png"));
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
