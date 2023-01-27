package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	
	WebDriver driver;
	
//	@FindBy(xpath="span[@class='nav-line-2 ']")
//	private WebElement signInIcon;
	
	
//	@FindBy(xpath="a[@href='https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&']")
//	private WebElement signInIcon;
	
	@FindBy(xpath="//span[contains(text(),'Hello, sign in')]")
	private WebElement signInIcon;

			
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement EnterMobileNumber;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement EnterPassword;
	
	//input[@id='signInSubmit']
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement SignInButton;
	
	
	@FindBy(xpath="//span[contains(text(),'Returns')]")
	private WebElement returnButton;
	
	
	@FindBy(linkText="Buy Again")
	private WebElement buyAgain;
	
	
	@FindBy(linkText="Not Yet Shipped")
	private WebElement notShipped;		
	
	
	@FindBy(linkText="Cancelled Orders")
	private WebElement cancelOrder;	
	
	@FindBy(xpath="/html/body/div[1]/section/div/div[4]/form/span")
	private WebElement beforeOrdered;
	
//	@FindBy(xpath="//a[@id='orderFilter_2']")
//	private WebElement last;
	
	@FindBy(linkText="2022")
	private WebElement last;
	
	
	
	public LoginPom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInIcon() {
		signInIcon.click();
	}
	
	public void enterMobileNumber() {
		EnterMobileNumber.sendKeys("7972679643");
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public void enterPassword() {
		EnterPassword.sendKeys("Kedar@123");
	}
	
	public void clickOnSignInButton() {
		SignInButton.click();
	}
	
	public void clickOnReturnButton() {
		returnButton.click();
	}
	
	public void clickOnBuyAgainButton() {
		buyAgain.click();
	}
	
	public void clickOnNotShipped () {
		notShipped.click();
	}
	
	public void clickOnCancelOrders () {
		cancelOrder.click();
	}
	
	public WebElement clickOnBeforeOrdered() {
		WebElement a = beforeOrdered;
		return a;
	}
	
	public WebElement order2022() {
	WebElement b = last;
	
	return last;
	
	}
	
}
