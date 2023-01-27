package t1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClass extends ParentClass {
	
	public void launchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/kedar/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println("the value of a " + a);
	}

	public static void main(String[] args) {
		ChildClass C1 = new  ChildClass();
		C1.launchTheBrowser();
	String a=C1.generateEmailId();
	
	System.out.println("this is email " +" "  + a +"@gmail.com");
		
		
	}

}
