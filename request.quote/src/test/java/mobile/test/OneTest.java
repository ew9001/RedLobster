package mobile.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.testng.annotations.Test;

import ext.test4j.apache.commons.io.FileUtils;

public class OneTest  {

    @Test
	public void testGoogle() throws Exception {
    WebDriver driver = new AndroidDriver();
    int row=1;
    String browser="GalaxyS3";
    String timeStamp ="mobile";
    // And now use this to visit Google
    driver.get("http://author.crest.pgsitecore.com/en-us");
    
    // Find the text input element by its name
   // WebElement element = driver.findElement(By.name("q"));
    
    // Enter something to search for
   // element.sendKeys("Cheese!");
    
    // Now submit the form. WebDriver will find the form for us from the element
    //element.submit();
    
    // Check the title of the page
    System.out.println("Page title is: " + driver.getTitle());
    
    
	 File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("Y://Screenshots/GalaxyS15/" + browser +"/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "crest_homepage.png"));
		row+=1;
		
	    System.out.println("Rotate: ");
	    Thread.sleep(4000000);
		 
		 File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("Y://Screenshots/GalaxyS15/" + browser +"/" + timeStamp +  "/" + row + "-" + timeStamp + "-" + "crest_homepage_rotate.png"));
			row+=1;
		 
		 
		 
		 
 //   driver.findElement(By.id("phsmartphonebody_0_phsmartphoneproductprimarycontentarea_0_lnkAddToCart")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.quit();
  }
}