package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class AgencySummaryPage {

	@FindBy(xpath = "(//th[@class='ant-table-cell'])[1]")
	WebElement AgencyNameField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[2]")
	WebElement ProfilesSharedField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[3]")
	WebElement InProgressField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[4]")
	WebElement ActionPendingField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[5]")
	WebElement NotShortlistedField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[6]")
	WebElement NotSelectedField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[7]")
	WebElement DuplicateProfilesField;
	
	@FindBy(xpath = "//span[@id='dateRange-calender']")
	WebElement selectDateRange;
	@FindBy(xpath = "//li[@class='ant-dropdown-menu-item ant-dropdown-menu-item-only-child']")
	WebElement startDate;
	@FindBy(xpath = "//td[@title='2022-06-01']")
	WebElement selectStartDate;
	@FindBy(xpath = "//td[@title='2022-06-09']")
	WebElement selectEndDate;
	@FindBy(xpath = "//a[text()='Placement technologies']")
	WebElement agencyName;
	
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement jobSummaryButton;
	@FindBy(xpath = "//div[@class='ant-picker ant-picker-range']")
	WebElement selectJSDate;
	@FindBy(xpath = "//td[@title='2022-06-01']")
	WebElement selectJSStartDate;
	@FindBy(xpath = "//td[@title='2022-06-09']")
	WebElement selectJSEndDate;
	@FindBy(xpath = "//button[@class='ant-btn']")
	WebElement goBackButton;
	
	@FindBy(xpath = "//span[@class='anticon anticon-caret-down']")
	WebElement profilesDropDownMenu;
	@FindBy(xpath = "(//li[@class='ant-dropdown-menu-item ant-dropdown-menu-item-only-child'])[2]")
	WebElement automotiveProfile;
	@FindBy(xpath = "//div[@class='ant-picker ant-picker-range']")
	WebElement AutomotiveDateRange;
	@FindBy(xpath = "//td[@title='2022-06-01']")
	WebElement AStartDate;
	@FindBy(xpath = "//td[@title='2022-06-09']")
	WebElement AEndDate;
	@FindBy(xpath = "(//li[@class='ant-dropdown-menu-item ant-dropdown-menu-item-only-child'])[3]")
	WebElement otherProfile;
	
	public AgencySummaryPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this); //initiaLIZATION
	 }
	
	 public boolean validateAgencyNameField()
	 {
		 return AgencyNameField.isDisplayed();
	 }
	 
	 public boolean validateProfilesSharedField()
	 {
		 return ProfilesSharedField.isDisplayed();
	 }
	 
	 public boolean validateInProgressField()
	 {
		 return InProgressField.isDisplayed();
	 }
	 
	 public boolean validateActionPendingField()
	 {
		 return ActionPendingField.isDisplayed();
	 }
	 
	 public boolean validateNotShortlistedField()
	 {
		 return NotShortlistedField.isDisplayed();
	 }
	 
	 public boolean validateNotSelectedField()
	 {
		 return NotSelectedField.isDisplayed();
	 }
	 
	 public boolean validateDuplicateProfilesField()
	 {
		 return DuplicateProfilesField.isDisplayed();
	 }
	 
	 public void selectDateRange() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 selectDateRange.click();
		 Thread.sleep(5000);
		 startDate.click();
		 Thread.sleep(2000);
		 selectStartDate.click();
		 Thread.sleep(3000);
		 selectEndDate.click();
		 Thread.sleep(2000);
	 }
	 
	 public void jobSummaryDetails() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 jobSummaryButton.click();
		 Thread.sleep(5000);
		 selectJSDate.click();
		 Thread.sleep(3000);
		 selectJSStartDate.click();
		 Thread.sleep(1000);
		 selectJSEndDate.click();
		 Thread.sleep(4000);
		 goBackButton.click();
		 Thread.sleep(2000);
	 }
	 
	 public void allProfilesDetails() throws InterruptedException 
	 {
		 Thread.sleep(2000);
		 jobSummaryButton.click();
		 Thread.sleep(2000);
		 profilesDropDownMenu.click();
		 Thread.sleep(2000);
		 automotiveProfile.click();
		 Thread.sleep(3000);
		 AutomotiveDateRange.click();
		 Thread.sleep(3000);
		 AStartDate.click();
		 Thread.sleep(2000);
		 AEndDate.click();
		 Thread.sleep(4000);
		 goBackButton.click();
		 Thread.sleep(2000);
	}
	 
	 public void viewAgencyDetails() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 selectDateRange.click();
		 Thread.sleep(2000);
		 startDate.click();
		 Thread.sleep(4000);
		 selectStartDate.click();
		 Thread.sleep(3000);
		 selectEndDate.click();
		 Thread.sleep(2000);
		 agencyName.click();
		 Thread.sleep(3000);
	 }
}
