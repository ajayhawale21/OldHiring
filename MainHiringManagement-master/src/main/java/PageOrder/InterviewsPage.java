package PageOrder;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class InterviewsPage {
WebDriver driver;
	@FindBy(xpath = "//span[@title='Interviews']")
	WebElement pageTitle;
	@FindBy(xpath = "//th[@class='ant-table-cell ant-table-column-has-sorters']")
	WebElement candidateField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[1]")
	WebElement contactField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[2]")
	WebElement statusField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[3]")
	WebElement jobTitleField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[4]")
	WebElement agencyNameField;
	@FindBy(xpath = "//input[@placeholder='Search Candidates']")
	WebElement searchCand;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-input-search-button']")
	WebElement searchButton;
	@FindBy(xpath = "//div[@class='ant-picker']")
	WebElement selectDate;
	@FindBy(xpath = "//td[@title='2022-06-16']")
	WebElement date;
	Actions ac;
	
	 public InterviewsPage(WebDriver driver)
	 {this.driver=driver;
		 PageFactory.initElements(driver, this); //initiaLIZATION
	 }
	 
	 public void InterviewsPagesearchName(String name) throws InterruptedException 
	 {
		 Thread.sleep(8000);		// utilization
		 searchCand.sendKeys(name);
		 searchButton.click();
		 Thread.sleep(3000);
		 searchCand.clear();
		 Thread.sleep(2000);
		
	 }
	 
	 public void  InterviewsPageselectDate(String name) throws InterruptedException 
	 {
		 Thread.sleep(8000);   
		 searchCand.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	     searchCand.sendKeys(Keys.BACK_SPACE);
		 Thread.sleep(2000);             // utilization
		 selectDate.click();
//		 selectDate.sendKeys(date);
		 date.click();
		 Thread.sleep(5000);
		 searchCand.sendKeys(name);
		 searchButton.click();
		 Thread.sleep(4000);
		
	 }
	 
	 public boolean validateCandidateField()
	 {
		 return candidateField.isDisplayed();
	 }
	 
	 public boolean validateContactField()
	 {
		 return contactField.isDisplayed();
	 }
	 
	 public boolean validateStatusField()
	 {
		 return statusField.isDisplayed();
	 }
	 
	 public boolean validateJobTitleField()
	 {
		 return jobTitleField.isDisplayed();
	 }
	 
	 public boolean validateAgencyField()
	 {
		 return agencyNameField.isDisplayed();
	 }
}
