package pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class Utility {
	
	static WebDriver driver;
	
//	@AfterMethod
	public  String CaptureScreenshot(String screenshotName) throws IOException {
			File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File d = new File("C:/Users/Admin/Desktop/Failedtest case screenshot/abc.bmp");
			
			FileUtils.copyFile(s,d);
			return screenshotName;

		}

}
