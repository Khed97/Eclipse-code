import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {

	@Test
	public void verifyPageTitle() {
		String expected_Title = "Google";
		String actual_Title = "Google1";
//		System.out.println("Test case execution started");
		Assert.assertEquals(actual_Title, expected_Title);
		System.out.println("hard assertion");
	}
	
	@Test(enabled=false)
	public void asert () {
		String expected_Title = "Google";
		String actual_Title = "Google1";

		SoftAssert softassert = new SoftAssert();
		
		softassert.assertEquals(actual_Title, expected_Title);
		
		System.out.println("soft assert");		
	}
	
	
	@Test
	public void onTestFailure(ITestResult result) {
		try {
			GetScreenshot.capture(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
