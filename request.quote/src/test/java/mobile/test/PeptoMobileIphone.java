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
import org.testng.annotations.Test;

import ext.test4j.apache.commons.io.FileUtils;

public class PeptoMobileIphone {
	
	public static void main(String[] args) throws Exception {
		 
		PeptoMobileIphone obj = new PeptoMobileIphone();
		obj.run();
	 
	  }
	 
	  public void run() throws Exception {
		  String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
		  String local=(new java.io.File("").getAbsolutePath());
			String data="" + local + "/" + "mobilePepto.csv";	
			int row=1;
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		
		 WebDriver driver = new IPhoneDriver("http://192.168.2.3:3001/wd/hub/");
		  //Write a review
		  
		 
		try {
	 
			br = new BufferedReader(new FileReader(data));
			while ((line = br.readLine()) != null) {
	 
			        // use comma as separator
				String[] product = line.split(cvsSplitBy);
	 
				System.out.println("{Country [code= " + product[0] 
	                                 + " , name=" + product[1] + "]");
				 driver.get(product[0]);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 JavascriptExecutor jse = (JavascriptExecutor)driver;
				 jse.executeScript("window.scrollBy(450,0)", "");
				 driver.findElement(By.id("phsmartphonebody_0_phsmartphoneproductprimarycontentarea_0_lnkAddToCart")).click();
				 File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile1, new File("Y://Screenshots/pepto" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "product.png"));
					row+=1;
					//((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.findElement(By.linkText("Add To Cart")).click();
				 File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile2, new File("Y://Screenshots/pepto" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "cart.png"));
					row+=1;
					//((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
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
