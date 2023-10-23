package Test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BaseB.BaseT;
import PageOrder.LoginPage;
import PageOrder.UsersPage;

public class UsersPageTest2 extends BaseT {
	private static final String String = null;
	String Location = BaseT.ReadConfig("city");
	String Label = BaseT.ReadConfig("label");
	String AN;

	String ProfName = BaseT.ReadConfig("profName");
	String ProfLoc = BaseT.ReadConfig("profLoc");
	String ProfEmail = BaseT.ReadConfig("profEmail");
	String ProfPhone = BaseT.ReadConfig("profPhone");
	String I = BaseT.ReadConfig("i");
	String J = BaseT.ReadConfig("j");
	String K = BaseT.ReadConfig("k");
	String PrefLoc = BaseT.ReadConfig("PrefLoc");
	String L = BaseT.ReadConfig("l");
	String M = BaseT.ReadConfig("m");
	String JdName = BaseT.ReadConfig("JDName");

	// WebDriver driver=super.driver;

	@Test(priority = 6, dependsOnGroups = { "UserPage" })
	public void AddUserTest1() throws InterruptedException {
		System.out.println("41 test run");

		// up.clickUserModule();
		up.clickOnUserIcon();
		up.clickOnPlusIcon();
		up.AddUserName();

		up.AddUsersPhone();
		up.AddingUsersEmail();

		up.selectDesignation();
		up.selectRole();
		up.addingAdminBt();

		up.capturingSuccessMessage();
	}

	@Test(priority = 7)
	public void DeleteUsers() throws InterruptedException {

		Thread.sleep(5000);
		up.deleteUsersAj();
	}

	@Test(priority = 8)
	public void AdAgency() throws InterruptedException {
		String AgencyName = up.addAgency1(Label, Location);
		this.AN = AgencyName;
//		up.addAgency(BaseT.ReadConfig("agenctname"), BaseT.ReadConfig("city"), BaseT.ReadConfig("contactPerson"),
//				BaseT.ReadConfig("contactpersonMob"), BaseT.ReadConfig("contactpersonEmailId"));

	}

	@Test(priority = 9)
	public void SearchAgency() throws InterruptedException {

		up.searchAgency(AN);
		System.out.println("Agency name: search sucessfully");

	}

	@Test(priority = 10) // , groups = "JobPage"
	public void deleteAgency() throws InterruptedException {

		up.deleteAgencyAj(AN);
		System.out.println("Agency name deleted sucessfully....");
	}

	@Test(priority = 11)
	public void SearchingJd() throws InterruptedException {
		jp.clickOnJobIcon();
		jp.SearchJDAj(JdName);

	}


	@Test(priority = 12)
	public void addJD() throws InterruptedException, AWTException {
		// driver.get("https://testhiring.brigosha.com/job-description");
		Thread.sleep(3000);
		jp.clickOnJobIcon();
		Thread.sleep(3000);
		jp.addingAutomationTesterProfile();
		Thread.sleep(3000);
		jp.AddPersonName();
		Thread.sleep(3000);
		jp.AddingPersonEmail();
		Thread.sleep(3000);
		jp.AddPersonPhone();

		Thread.sleep(3000);
		jp.AddingPersonalOtherDetails();
		Thread.sleep(3000);
		jp.selectPrefferdLocationAddProf();
		Thread.sleep(3000);
		jp.uploadFile();

	}

	/*
	 * @Test(priority = 12) public void addingProfileToJd() throws
	 * InterruptedException { wait(2000); jp.addingAutomationTesterProfile();
	 * wait(2000); jp.AddPersonName(); wait(2000); jp.AddPersonPhone(); wait(2000);
	 * jp.AddingPersonEmail();
	 * 
	 * }
	 */

	@Test(priority = 13)
	public void ViewProfileJD() throws InterruptedException {
		jp.ViewProfileShort();
		driver.navigate().back();
	}
	
	
	@Ignore
	@Test(priority = 14)
	public void ViewrejectProfile() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		jp.clickOnJobIcon();
		Thread.sleep(3000);
		jp.addingAutomationTesterProfile();
		Thread.sleep(3000);
		jp.AddPersonName();
		Thread.sleep(3000);
		jp.AddingPersonEmail();
		Thread.sleep(3000);
		jp.AddPersonPhone();

		Thread.sleep(3000);
		jp.AddingPersonalOtherDetails();
		Thread.sleep(3000);
		jp.selectPrefferdLocationAddProf();
		Thread.sleep(3000);
		jp.uploadFile();

		jp.Profilereject();
	}

@Ignore
@Test(priority=15)
public void ViewDuplicateProf() throws InterruptedException, AWTException {
	Thread.sleep(3000);
	jp.clickOnJobIcon();
	Thread.sleep(3000);
	jp.addingAutomationTesterProfile();
	Thread.sleep(3000);
	jp.AddPersonName();
	Thread.sleep(3000);
	jp.AddingPersonEmail();
	Thread.sleep(3000);
	jp.AddPersonPhone();

	Thread.sleep(3000);
	jp.AddingPersonalOtherDetails();
	Thread.sleep(3000);
	jp.selectPrefferdLocationAddProf();
	Thread.sleep(3000);
	jp.uploadFile();
	jp.ViewProfileDuplicate();
}
	
	
	@Test(priority = 16)
	public void panelistAdd() throws InterruptedException {
		pp.AddPanelist(BaseT.ReadConfig("PanelistName"), BaseT.ReadConfig("PanelistEmail"),
				BaseT.ReadConfig("PanelistPhone"));
		pp.panelistDesignation();
	}
	
	@Test(priority=17)
	public void addingSlots() throws InterruptedException {
		pp.addSlotsNewPanelist();
	}
	@Test(priority = 18)

	public void searchingPanelists() throws InterruptedException {
		pp.SearchPanel(BaseT.ReadConfig("PanelistSearch"));

	}
	
	@Test(priority = 19)
	public void editingPanelists() throws InterruptedException {
		pp.EditPanelist(BaseT.ReadConfig("EditPanelistPhone"));
	}

	

	/*
	 * @AfterMethod public void closeBrowser() { driver.quit(); }
	 */

}
