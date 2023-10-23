package PageOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class LoginPage   {
WebDriver driver;
	@FindBy(xpath="//input[@name='email']")
	WebElement Email;
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary primaryButton']")
	WebElement LoginButton;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-link']")
	WebElement ForgetPassword;
	@FindBy(xpath = "//div[@class='m-t-50 r-c-c']")
	WebElement BrigoshaLogo;
	@FindBy (xpath="//*[@id=\"root\"]/section/section/div/div[3]/img")
	WebElement Logo;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		
	}

	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateBrigoshaLogo()
	{
		return BrigoshaLogo.isDisplayed();
	}
	
	public boolean validateForgotPassword() 
	{
		return ForgetPassword.isDisplayed();
	}

	public void HomePageLogin(String emailid, String password) throws InterruptedException
	{
		Thread.sleep(2000);
		Email.sendKeys(emailid);
		Thread.sleep(2000);
		Password.sendKeys(password);
		Thread.sleep(2000);
		LoginButton.click();
		Thread.sleep(2000);
		
		
	}
	public void LogoDisplay() {
		boolean s=	Logo.isDisplayed();
		System.out.println("Logo is displayed......"+ s);
		
	}
	
}
