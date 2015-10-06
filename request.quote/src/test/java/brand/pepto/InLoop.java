package brand.pepto;

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


	import static org.junit.Assert.*;

	import java.io.File;
import java.io.FileInputStream;

	import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

	import jxl.Sheet;
import jxl.Workbook;

	import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.iphone.IPhoneDriver;


	public class InLoop {
	Sheet s;
	WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	static String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
	String local=(new java.io.File("").getAbsolutePath());
	String data="" + local + "/" + "tampaxproducts.xls";	
	String data2="" + local + "/" + "tampaxproducts.xls";	
	


	@Test
		public void searchGoogle() throws Exception {
		WebDriver driver = new IPhoneDriver("http://192.168.2.2:3001/wd/hub/");
		FileInputStream fi = new FileInputStream(data);
		Workbook w = Workbook.getWorkbook(fi);
		s = w.getSheet(0);
		//Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		//String browserName = caps.getBrowserName();
		//String browserVersion = caps.getVersion();
		//System.out.println(browserName+" "+browserVersion);
		//System.out.println("==========");

	for(int row=1; row <=s.getRows();row++) {
		
	   // String baseurl="http://www.google.com";
	   // driver.get(baseurl);

		String urlname = s.getCell(0, row).getContents();
		driver.get(urlname);
		Thread.sleep(1000);
	    File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile1, new File("Y://Screenshots/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "product.png"));
		
		//((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(3000);

		
		
		
		   //driver.findElement(By.cssSelector("a.request-button.blue-button > span")).click();
		   
		driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		  driver.findElement(By.id("phsmartphonebody_0_phsmartphoneproductprimarycontentarea_0_lnkWriteAReview")).click();
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("document.getElementById('phsmartphonebody_0_imgRatingStarsOn').click();");
		
		  
		  
		  WebElement click = driver.findElement(By.xpath("//*[@id='phsmartphonebody_0_imgRatingStars']"));

		  click.click();
		  
		  
		  driver.findElement(By.id("phsmartphonebody_0_rptProductReview_rblControlForProductReview_0_0_0")).click();
		  
		  
		  driver.findElement(By.id("phsmartphonebody_0_rptProductReview_txtControlForProductReview_1")).sendKeys("Vanilla");
		  driver.findElement(By.id("phsmartphonebody_0_rptProductReview_textareaControlForProductReview_2")).sendKeys("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore");
		  driver.findElement(By.id("phsmartphonebody_0_rptProfileInformation_txtControl_0")).sendKeys(timeStamp);
		  driver.findElement(By.id("phsmartphonebody_0_rptProfileInformation_txtControl_1")).sendKeys("Brooklyn,NY");
		  new Select(driver.findElement(By.id("phsmartphonebody_0_rptProfileInformation_ddlControl_2"))).selectByVisibleText("10");
		  new Select(driver.findElement(By.id("phsmartphonebody_0_rptProfileInformation_ddlControl_3"))).selectByVisibleText("1978");
		  driver.findElement(By.id("phsmartphonebody_0_rptProfileInformation_txtControl_4")).sendKeys("albert.golubev@pkt.com");
		  driver.findElement(By.id("phsmartphonebody_0_chkAgree")).click();
		  driver.findElement(By.id("phsmartphonebody_0_ibtnPreview")).click();
		  
		  
		  WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.textToBePresentInElement(By.id("phsmartphonebody_0_divWrireReviewPreviewMode"), "CONFIRM YOUR REVIEW"));
	
		  driver.findElement(By.id("phsmartphonebody_0_ibtnSubmit")).click();
       
		  
		 wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.textToBePresentInElement(By.id("phsmartphonebody_0_divSuccessHeader"), "REVIEW SUBMITTED SUCCESSFULLY"));
		  

        
		
	    File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("Y://Screenshots/" +   "/" + row +  "-" + timeStamp + "-" + "success.png"));
		


		//System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle() + " - portrait");

		
	   // File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile2, new File("Y://Screenshots/" +  browserName + browserVersion + "/" + row +   "-portrait.png"));
		//((Rotatable) driver).rotate(ScreenOrientation.LANDSCAPE);
		
		}
		}



	private boolean isElementPresent(By cssSelector) {
		// TODO Auto-generated method stub
		return false;
	}


	@After
		public void tearDown() throws Exception {
		 
		    driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		    }
		  }
	

}