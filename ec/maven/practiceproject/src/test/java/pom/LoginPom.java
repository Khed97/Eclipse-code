package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPom {

	@FindBy(id="multiselect")
//	@FindBy(xpath="/html/body/div/form/fieldset/select")
	private WebElement ListOfCarCompany;

	@FindBy(linkText="Gmail")
	private WebElement gmail;
	
	@FindBy(linkText="Actions")
	private WebElement actionsLink;
	
	public LoginPom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectCarBrand () throws InterruptedException {
		Select s = new Select (ListOfCarCompany);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByIndex(5);	

	}
	
	public void clickOnGmail() {
		gmail.click();
	}
	
	public void clickOnActionsLink () {
		actionsLink.click();
	}
	
	
	
}