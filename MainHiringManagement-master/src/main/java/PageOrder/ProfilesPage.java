package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProfilesPage  {

	@FindBy(xpath = "//button[@id='add3']")
	WebElement addprofile;
	@FindBy(xpath = "//input[@name='name']")
	WebElement name;
	@FindBy(xpath = "//input[@name='currentLocation']")
	WebElement currentLocation;
	@FindBy(xpath = "//input[@name='e-Mail']")
	WebElement email;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@name='Years']")
	WebElement expInYears;
	@FindBy(xpath = "//input[@name='notice(Days)']")
	WebElement noticeDays;
	@FindBy(xpath = "//div[@class='ant-select-selector']")
	WebElement preferredLocationdd;
	@FindBy(xpath = "//div[@title='Bangalore']")
	WebElement selectPreferredLocation;
	@FindBy(xpath = "//input[@name='currentCTC']")
	WebElement currentCTC;
	
	public ProfilesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
