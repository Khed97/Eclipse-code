package Stepdefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.LoginPom;

public class stepDef {
	WebDriver driver;
	LoginPom loginpom;
	@Given("Launch the browser")
	public void launch_the_browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		loginpom = new LoginPom(driver);
	}

	@Given("Login into the website")
	public void login_into_the_website() {
		loginpom.clickOnSignInIcon();
		loginpom.enterMobileNumber();
		loginpom.clickOnContinueButton();
		loginpom.enterPassword();
		loginpom.clickOnSignInButton();
	}
	
	@When("Click on Return Section")
	public void click_on_return_section() {
		loginpom.clickOnReturnButton();
	}
	
	@When("Click on buyagain shipped")
	public void click_on_buyagain_shipped() throws InterruptedException {
//		loginpom.clickOnBuyAgainButton();
		Thread.sleep(2000);
//		loginpom.clickOnNotShipped();
	}

	@When("cancelled Orders")
	public void cancelled_orders() throws InterruptedException {
//		loginpom.clickOnCancelOrders();
		WebElement d = loginpom.clickOnBeforeOrdered();
		Actions a = new Actions (driver);
		a.click(d).build().perform();
		for(int i =0;i<2;i++) {
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		}
		
		WebElement e = loginpom.order2022();
		a.click(e).build().perform();

//		a.sendKeys(Keys.ARROW_DOWN).build().perform();		
//		a.sendKeys(Keys.ARROW_UP).build().perform();


	}

}
