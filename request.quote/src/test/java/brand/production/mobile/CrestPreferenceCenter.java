package brand.production.mobile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrestPreferenceCenter {
	
	
WebDriver driver;
	
	static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	
	
	@BeforeClass

	public void beforeClass(){

		System.out.println("Initialize Selenium for Class 1");

	}

	@BeforeMethod
    /// Start Mobile Browser
	public void beforeMethod(){

		System.out.println("Opening Browser");
	    driver = new FirefoxDriver();
	    driver.get("http://www.crest.com");
	    driver.findElement(By.linkText("Crest Sensi")).click();
	    driver.findElement(By.id("phdesktopbody_0_phdesktopproductcontent_3_UngroupedProducts_rptrProductsList_hypProductName_0")).click();

	}

	@Test

	public void test1(){

			System.out.println("Inside Test 1 - Share Facebook");
			driver.findElement(By.cssSelector("img[alt=\"Visit Crest on Facebook\"]")).click();
		
	}

	@Test

	public void test2(){

			System.out.println("Inside Test 2 - Share Twitter");
			driver.findElement(By.cssSelector("img[alt=\"Follow Crest on Twitter\"]")).click();

	}
	
	@Test
	
	public void test4(){

		System.out.println("Inside Test 3 - Share Email");

}
	@AfterMethod

	public void afterMethod() throws IOException{

		System.out.println("Closing Browser");
     //   File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //	FileUtils.copyFile(scrFile1, new File("Y://Screenshots/Sharing" +  "/" + timeStamp + "-sharing.png"));

	    driver.close();

	}
	@AfterClass
	public void afterClass(){
		System.out.println("Destroy Selenium for class 1");
	    driver.quit();
	}
	

}
