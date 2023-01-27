package t1;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class ParentClass {
	public WebDriver driver;
	 
	public int a=10;
	
	public String generateEmailId() {
		return RandomStringUtils.randomAlphabetic(5);
	}
	
	public static void main(String[] args) {

	}

}
