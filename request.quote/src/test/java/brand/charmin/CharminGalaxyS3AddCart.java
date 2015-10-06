package brand.charmin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ext.test4j.apache.commons.io.FileUtils;

public class CharminGalaxyS3AddCart {

  @SuppressWarnings("resource")
@Test	
  public void testGoogle() throws Exception {
    WebDriver driver = new AndroidDriver();
    
    
	  

	  
		String timeStamp = new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime());
	    int counter=1;
		String local=(new java.io.File("").getAbsolutePath());
		String data="" + local + "/" + "all_charmin_products.csv";	
		String data2="" + local + "/" + "all_charmin_products.csv";	
		String myTitle,url;
		String csvFileToRead = null;		 
	  
	  
	 
	    BufferedReader br =null;
	    String line="";
	    String ext = "png";
	    File dir = new File("/users/agolubev1/Desktop/RondAndroid");
	
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

	       // driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get(url);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	       // for (int second = 0;; second++) {
		    //	if (second >= 60);
		    	//try { if ("Â© 2014 Procter & Gamble".equals(driver.findElement(By.cssSelector("div.copyRights > div.text.mode1 > div")).getText())) break; } catch (Exception e) {}
		    	//Thread.sleep(1000);
		    //} changed
	        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        WebElement herbBtn = driver.findElement(By.id("lnkWriteReview"));
	        
	        //IE10 fix the click..
	        WebDriverWait wait = new WebDriverWait(driver, 15);
	        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Write A Review")));
	        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	      
	        jse1.executeScript("document.getElementById('lnkWriteReview').focus();");
	        driver.findElement(By.linkText("Write A Review")).click();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	      

	     
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        
	        WebElement click = driver.findElement(By.xpath("//*[@id='phdesktopbody_0_phdesktopproductratingreview_0_imgRatingStars']"));

	        click.click();
	        
	       
	        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       

	        
	        
//	        WebElement click1 = driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptSecondaryRatingWrite_imgSecondaryRatingStarsOn_0"));

//	        click1.click();
	  
	        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	        
	//        WebElement click2 = driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptSecondaryRatingWrite_imgSecondaryRatingStarsOn_1"));

	  //      click2.click();
	       
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_imgRatingStarsOn")).click();
	    //    driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptSecondaryRatingWrite_imgSecondaryRatingStars_0")).click();
	   //     driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptSecondaryRatingWrite_imgSecondaryRatingStars_1")).click();
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProductReview_txtControlForProductReview_0")).clear();
	        myTitle = driver.getTitle();
	        
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_imgRatingStars")).click();
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProductRating_rblControlForProductRating_0_0_0")).click();
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProductReview_txtControlForProductReview_0")).clear();
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProductReview_txtControlForProductReview_0")).sendKeys("Review for " +myTitle);
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProductReview_textareaControlForProductReview_1")).clear();
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProductReview_textareaControlForProductReview_1")).sendKeys("This is a review for " +myTitle +" using browser ");
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProfileInformation_txtControl_0")).clear();
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProfileInformation_txtControl_0")).sendKeys("QAalbert" +timeStamp);
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProfileInformation_txtControl_1")).clear();
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProfileInformation_txtControl_1")).sendKeys("Brooklyn,NY");
	        new Select(driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProfileInformation_ddlControl_2"))).selectByVisibleText("7");
	        new Select(driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProfileInformation_ddlControl_3"))).selectByVisibleText("1964");
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProfileInformation_txtControl_4")).clear();
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_rptProfileInformation_txtControl_4")).sendKeys("albert.golubev@pkt.com");
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_chkAgree")).click();
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_ibtnPreview")).click();
	        
			 File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile1, new File("Y://Screenshots/cart/"  + timeStamp +"/" + timeStamp +  "/" + counter + "-" + timeStamp + "-" + "charmin.png"));
				
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        counter+=1;
	        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_ibtnSubmit")).click();
	        File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("Y://Screenshots/galaxys3/cart/"  + timeStamp +"/" + timeStamp +  "/" + counter + "-" + timeStamp + "-" + "charmin.png"));
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        counter+=1;
	        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	        driver.findElement(By.id("phdesktopbody_0_phdesktopproductratingreview_0_ibtnContinue")).click();
	        File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("Y://Screenshots/galaxys3/cart/"  + timeStamp +"/" + timeStamp +  "/" + counter + "-" + timeStamp + "-" + "charmin.png"));
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        counter+=1;
	        driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("Y://Screenshots/galaxys3/cart/"  + timeStamp +"/" + timeStamp +  "/" + counter + "-" + timeStamp + "-" + "charmin.png"));
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        counter+=1;

	      //  JavascriptExecutor jse = (JavascriptExecutor)driver;
	 //       jse.executeScript("scroll(0, -9000)"); //y value '250' can be altered
	   //     name=""+ browser+"/portrait/" + browser +"_"+ counter + "_" + "Successful-Completed-Capture-portrait.png";
	 //       takeScreenPortrait(name);
	 
	      
	        counter+=1;
		    
	    
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       // assertTrue(isElementPresent(By.id("phdesktopbody_0_phdesktopproductratingreview_0_ibtnSubmit")));
	        
	        
	     
	  
		  
	        
	        counter+=1;
	    

	      }

	 
  	 driver.quit();   
  }
}