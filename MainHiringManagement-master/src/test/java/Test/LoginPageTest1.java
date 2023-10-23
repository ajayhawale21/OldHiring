package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BaseB.BaseT;
import PageOrder.LoginPage;

public class LoginPageTest1 extends BaseT {

	
	@Test(priority = 0)
	public void LoginPageLogo() throws InterruptedException {
		// driver.get(BaseT.ReadConfig("url"));
		Thread.sleep(2000);
		lp.LogoDisplay();

	}

	@Test(priority = 1, dependsOnMethods = { "LoginPageLogo" })
	public void forgetPasswordLink() throws InterruptedException {
		Thread.sleep(500);
		boolean c = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/div/div[2]/div[2]/button/span"))
				.isDisplayed();
		System.out.println("forget link is present...." + c);
	}

	@Test(priority = 2, dependsOnMethods = { "forgetPasswordLink" })
	public void LoginButtonDisplay() throws InterruptedException {
		Thread.sleep(500);
		boolean d = driver.findElement(By.xpath("//span[text()='LOGIN']")).isDisplayed();
		System.out.println("Login Button is present...." + d);

	}

	@Test(priority = 3, dependsOnMethods = { "LoginButtonDisplay" })

	public void HiringTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority = 4, dependsOnMethods = { "HiringTitleTest" }, groups = "UserPage")
	public void UserPageTest() throws InterruptedException {
		Thread.sleep(2000);
		lp.HomePageLogin(BaseT.ReadConfig("emailid"), BaseT.ReadConfig("password"));

		String title = driver.getTitle();
		System.out.println("User Page title is..." + title);

	}

	@Test(priority = 5, enabled = true)
	public void LogoTest() throws InterruptedException {
		Thread.sleep(1000);
		boolean b = driver.findElement(By.xpath("//*[@src='/static/media/brigosha_logo@3x.70901adc.png']"))
				.isDisplayed();
		System.out.println("UserPAge Logo Test pass sucessfully...." + b);
	}

	/*
	 * @AfterMethod public void closeBrowser() { driver.quit(); }
	 */
}
