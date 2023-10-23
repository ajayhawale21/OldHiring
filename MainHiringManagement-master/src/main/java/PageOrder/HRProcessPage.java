package PageOrder;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class HRProcessPage {
	WebDriver driver;
	@FindBy (xpath = "(//th[@class='ant-table-cell ant-table-cell-fix-left'])[1]")
	WebElement slNoField;
	@FindBy (xpath = "(//th[@class='ant-table-cell ant-table-cell-fix-left'])[2]")
	WebElement idField;
	@FindBy (xpath = "//div[@class='ant-table-column-sorters']")
	WebElement nameField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[1]")
	WebElement experienceField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[2]")
	WebElement currentCTCField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[3]")
	WebElement expectedCTCField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[4]")
	WebElement nativePlaceField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[5]")
	WebElement jobTitleField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[6]")
	WebElement feedbackField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[7]")
	WebElement emailIdField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[8]")
	WebElement contactNoField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[9]")
	WebElement HrStatusField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[10]")
	WebElement offeredCTCField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[11]")
	WebElement noticePeriodField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[12]")
	WebElement LwdField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[13]")
	WebElement HrNoticePeriodField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[14]")
	WebElement ExpectedDojField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[15]")
	WebElement HrActionsField;
	@FindBy (xpath = "(//th[@class='ant-table-cell'])[16]")
	WebElement HrCommentField;
	
	/* search a candidate*/
	@FindBy (xpath = "//input[@placeholder='Search Candidates']")
	WebElement searchcandidatElement;
	@FindBy(xpath = "//span[@class='ant-input-group-addon']")
	WebElement searchbuttonElement;
	
	/* edit the details */
	@FindBy (xpath = "//button[@id='editActions58']")
	WebElement editactionsElement;
	@FindBy(xpath = "//textarea[@name='hRComment']")
	WebElement edithrActTextarea;
	@FindBy(xpath = "//button[@id='hrEditCandidate']")
	WebElement editSaveButton;
	
	/* to view the feedback */
	@FindBy(xpath = "(//a[@class='text-sm'])[1]")
	WebElement viewFeedback;
	
	public HRProcessPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void HRProcessPagehrSearchCandidate(String cand1, String cand2) throws InterruptedException 
	{
		Thread.sleep(3000);
		//return snNumbercolumElement.isDisplayed();
		searchcandidatElement.click();
		searchcandidatElement.sendKeys(cand1);
		Thread.sleep(2000);
		searchbuttonElement.click();
		Thread.sleep(3000);
//		searchcandidatElement.clear_field();
		searchcandidatElement.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	    searchcandidatElement.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		searchcandidatElement.sendKeys(cand2);
		Thread.sleep(2000);
		searchbuttonElement.click();
		Thread.sleep(3000);
		searchcandidatElement.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	    searchcandidatElement.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    searchbuttonElement.click();
		
	}
	public void  HRProcessPageedithractions(String comments) throws InterruptedException {
		
		Thread.sleep(2000);
		editactionsElement.click();
		Thread.sleep(2000);
		edithrActTextarea.click();
		Thread.sleep(2000);
		edithrActTextarea.sendKeys(comments);
		Thread.sleep(3000);
		editSaveButton.click();
		Thread.sleep(3000);
		
	}
	
	public void viewFeedback() throws InterruptedException
	{
		Thread.sleep(2000);
		viewFeedback.click();
		Thread.sleep(8000);
	}
		
	public boolean SlNoField()
	 {
		 return slNoField.isDisplayed();
	 }	
	
	public boolean IdField()
	 {
		 return idField.isDisplayed();
	 }
	
	public boolean NameField()
	 {
		 return nameField.isDisplayed();
	 }
	
	public boolean ExperienceField()
	{
		return experienceField.isDisplayed();
	}
	
	public boolean CurrentCTCField()
	 {
		 return currentCTCField.isDisplayed();
	 }
	
	public boolean ExpectedCTCField()
	 {
		 return expectedCTCField.isDisplayed();
	 }
	
	public boolean NativeField()
	 {
		 return nativePlaceField.isDisplayed();
	 }
	
	public boolean JobTitleField()
	 {
		 return jobTitleField.isDisplayed();
	 }
	
	public boolean FeedbackField()
	 {
		 return feedbackField.isDisplayed();
	 }
	
	public boolean EmailIdField()
	 {
		 return emailIdField.isDisplayed();
	 }
	
	public boolean ContactNoField()
	 {
		 return contactNoField.isDisplayed();
	 }
	
	public boolean HrStatusField()
	 {
		 return HrStatusField.isDisplayed();
	 }
	
	public boolean OfferedCTCField()
	 {
		 return offeredCTCField.isDisplayed();
	 }
	
	public boolean NoticePeriodField()
	 {
		 return noticePeriodField.isDisplayed();
	 }
	
	public boolean LWDField()
	 {
		 return LwdField.isDisplayed();
	 }
	
	public boolean HrNoticePeriodField()
	 {
		 return HrNoticePeriodField.isDisplayed();
	 }
	
	public boolean ExpectedDojField()
	 {
		 return ExpectedDojField.isDisplayed();
	 }
	
	public boolean HrCommentField()
	 {
		 return HrCommentField.isDisplayed();
	 }
	
	public boolean HrActionsField()
	 {
		 return HrActionsField.isDisplayed();
	 }
}
