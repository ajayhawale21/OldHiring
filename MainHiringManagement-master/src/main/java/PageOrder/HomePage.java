package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage  {
WebDriver driver;
	@FindBy(xpath = "//div[@class='ant-row']")
	WebElement BrigoshaTitle;
	@FindBy(xpath = "//div[@class='ant-dropdown-trigger']")
	WebElement adminName;
	@FindBy(xpath = "(//li[@class='ant-menu-item'])[1]")
	WebElement dashBoardModule;
	@FindBy(xpath = "(//li[@class='ant-menu-item'])[2]")
	WebElement interviewsModule;
	@FindBy(xpath = "(//li[@class='ant-menu-item'])[3]")
	WebElement agencySummaryModule;
	@FindBy(xpath = "(//li[@class='ant-menu-item'])[4]")
	WebElement usersModule;
	@FindBy(xpath = "//li[@class='ant-menu-item ant-menu-item-selected']")
	WebElement jobsModule;
	@FindBy(xpath = "(//li[@class='ant-menu-item'])[5]")
	WebElement profilesModule;
	@FindBy(xpath = "(//li[@class='ant-menu-item'])[6]")
	WebElement panelistsModule;
	@FindBy(xpath = "(//li[@class='ant-menu-item'])[7]")
	WebElement hrProcessModule;
	Actions ac;
	@FindBy(xpath = "//span[text()='shakira benazir']")
	WebElement VisibleTextIcon;
	
	public HomePage(WebDriver driver)
	{this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePage()
	{
		return driver.getTitle();
	}
	public void DashBoardPageDashBoard()
	{
		ac=new Actions(driver);
		ac.moveToElement(dashBoardModule).click().build().perform();
		
	}
	public void  InterviewsPageInterview()
	{
		ac=new Actions(driver);
		ac.moveToElement(interviewsModule).click().build().perform();
		
	}
	public void  AgencySummaryPageAgencySummary()
	{
		ac=new Actions(driver);
		ac.moveToElement(agencySummaryModule).click().build().perform();
		
	}
	public void UsersPageUsers()
	{
		ac=new Actions(driver);
		ac.moveToElement(usersModule).click().build().perform();
		//return new UsersPage();
	}
	public void JobsPageJobs()
	{
		ac=new Actions(driver);
		ac.moveToElement(jobsModule).click().build().perform();
		
	}
	public void  ProfilesPageProfiles()
	{
		ac=new Actions(driver);
		ac.moveToElement(profilesModule).click().build().perform();
			}
	public  void PanelistsPagePanelists()
	{
		ac=new Actions(driver);
		ac.moveToElement(panelistsModule).click().build().perform();
		
	}
	public void HRProcessPageHRProcess()
	{
		ac=new Actions(driver);
		ac.moveToElement(hrProcessModule).click().build().perform();
		
	}
	public String validateAdmin() throws InterruptedException 
	{
		Thread.sleep(3000);
		return VisibleTextIcon.getText();
	}
}
