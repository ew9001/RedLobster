package brand.pepto;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AllUrl {
	Sheet s;
	WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	static String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
	String local=(new java.io.File("").getAbsolutePath());
	String data="" + local + "/" + "pepto_link.xls";	
	String data2="" + local + "/" + "pepto_link.xls";	
	


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
		driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
		 
	    File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile1, new File("Y://Screenshots/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "product.png"));
		
		//((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(3000);

		
		
		
		   //driver.findElement(By.cssSelector("a.request-button.blue-button > span")).click();
		   
		
		
	    
		


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
