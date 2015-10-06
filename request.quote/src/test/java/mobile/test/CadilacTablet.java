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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ext.test4j.apache.commons.io.FileUtils;

public class CadilacTablet {
	
	public static void main(String[] args) throws Exception {
		 
		CadilacTablet obj = new CadilacTablet();
		obj.run();
	 
	  }
	 
	  public void run() throws Exception {
		  String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
		  String local=(new java.io.File("").getAbsolutePath());
			String data="" + local + "/" + "mobileCharmin.csv";	
			int row=1;
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		
		
		
		// @SuppressWarnings("deprecation")
		WebDriver driver = new IPhoneDriver("http://192.168.2.6:3001/wd/hub/");
		
		  //Write a review
		  
		 
		try {
	 
			br = new BufferedReader(new FileReader(data));
			while ((line = br.readLine()) != null) {
	 
			        // use comma as separator
				String[] product = line.split(cvsSplitBy);
	 
				System.out.println("{Product [code= " + product[0] 
	                                 + " , name=" + product[1] + "]");
				 driver.get(product[0]);
				 driver.findElement(By.linkText(product[1])).click();
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 
				 driver.findElement(By.linkText(product[3])).click();
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile1, new File("Y://Screenshots/charmins/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "product.png"));
					row+=1;
					Select droplist = new Select(driver.findElement(By.id("phsmartphonebody_0_phsmartphoneproductprimarycontentarea_0_ddlQuantity")));   
					droplist.selectByVisibleText(product[2]);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
					//	
				//	driver.findElement(By.id('not-there')).then(function(element) {
					//	  alert('Found an element that was not expected to be there!');
						///}, function(error) {
						  //alert('The element was not found, as expected');
					///	});
					//((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.findElement(By.linkText("Add To Cart")).click();
				 File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile2, new File("Y://Screenshots/charmins/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "cart.png"));
					row+=1;
					//((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
			}
			row+=1;
			driver.get("http://author.charmin.pgsitecore.com/en-us/shopping-cart");
			driver.findElement(By.id("phsmartphonebody_0_phsmartphoneshoppingcartretailerlist_0_rptRetailerList_imgRetailerLogo_0"));
			File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("Y://Screenshots/charmins/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "cart.png"));
			row+=1;
			driver.findElement(By.id("phsmartphonebody_0_phsmartphoneshoppingcartretailerlist_0_rptRetailerList_imgRetailerLogo_2"));
			File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("Y://Screenshots/charmins/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "cart.png"));
			row+=1;
			driver.findElement(By.id("phsmartphonebody_0_phsmartphoneshoppingcartretailerlist_0_rptRetailerList_imgRetailerLogo_3"));
			File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile5, new File("Y://Screenshots/charmins/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "cart.png"));
			row+=1;
			driver.findElement(By.id("phsmartphonebody_0_phsmartphoneshoppingcartretailerlist_0_rptRetailerList_imgRetailerLogo_4"));
			File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile6, new File("Y://Screenshots/charmins/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "cart.png"));
			row+=1;
			driver.findElement(By.id("phsmartphonebody_0_phsmartphoneshoppingcartretailerlist_0_rptRetailerList_imgRetailerLogo_5"));
			
			
			File scrFile9 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile9, new File("Y://Screenshots/charmins/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "cart.png"));
			
	 
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
