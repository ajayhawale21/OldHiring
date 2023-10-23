package PageOrder;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
//import org.testng.Reporter;

public class UsersPage {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='ant-tabs-tab ant-tabs-tab-active']")
	WebElement adminField;
	/* Ajay */
	// @FindBy(xpath =
	// "//*[@id=\"root\"]/section/section/section/aside/div/ul/li[4]/span[1]")
	// (//*[contains(@href,'/create-user')])[1]")
	// "(//a[text()='Users'])[1]") //ul[@role='menu']/li[@class='ant-menu-item
	// ant-menu-item-active ant-menu-item-selected' or
	// @data-menu-id='rc-menu-uuid-14284-1-2']")
	@FindBy(linkText = "(//*[contains(@href,'/create-user')])[1]]")
	WebElement userModule; // ) @FindBy(xpath = "(//*[text()='Add Users'])[1]")
	WebElement AddUsersButton;
	@FindBy(xpath = "//input[@name='name']")
	WebElement addUsersName;
	@FindBy(xpath = "(//input[@name='email'])[1]")
	WebElement addUsersEmail;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement addUsersPhoneNo;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement DesignationDropDown;
	@FindBy(xpath = "//span[text()='Add Admin']")
	WebElement AddAdminBtn;
	@FindBy(xpath = "(//*[@class='ant-select-item ant-select-item-option ant-select-item-option-active'])[1]")
	WebElement roleDropdown;

	@FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
	WebElement SelectRole;
	@FindBy(xpath = "//div[@id='rc-tabs-1-tab-Users']")
	WebElement UsersNearToAgency;
	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary ant-btn-circle ant-btn-icon-only deleteIcon'])[1]")
	WebElement userdeleteButton;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement yesDeleteUser;

	public WebElement selectRoleDropDown(int index) {
		WebElement roleDropDown = driver
				.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[11])[" + index + "]"));
		return roleDropDown;
	}

	public WebElement selectRolDropDown(int idex) {
		WebElement roleDropDown2 = driver
				.findElement(By.xpath("(//div[@class='ant-select-selection-overflow'])[" + idex + "]"));
		return roleDropDown2;
	}
	/* Ajay */

	@FindBy(xpath = "//div[@class='ant-tabs-tab']")
	WebElement agencyField;
	@FindBy(xpath = "//div[@class='ant-page-header ant-page-header-ghost']")
	WebElement pageHeaderTitle;
	@FindBy(xpath = "//span[text()='Name']")
	WebElement nameField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[1]")
	WebElement emailField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[2]")
	WebElement contactField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[3]")
	WebElement manageField;
	@FindBy(xpath = "//input[@placeholder='Search Admin']")
	WebElement searchName;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-input-search-button']")
	WebElement searchButton;

	@FindBy(xpath = "//div[@title='Junior Software Engineer']")
	WebElement selectDesignation;
	@FindBy(xpath = "//div[@title='Admin']")
	WebElement selectRole;
	@FindBy(xpath = "//button[@id='Add Admin']")
	WebElement addAdminOption;

	@FindBy(xpath = "//input[@placeholder='Search Agency']")
	WebElement searchAgency;
	@FindBy(xpath = "//span[@class='anticon anticon-search']")
	WebElement searchAgencyBtn;
	@FindBy(xpath = "//div[text()='Agency']")
	WebElement agency;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary primaryButton']")

	WebElement AddAgencyOption;
	@FindBy(xpath = "//input[@name='agencyName']")
	WebElement agencyName;
	@FindBy(xpath = "//input[@name='location']")
	WebElement agencyLocation;
	@FindBy(xpath = "//input[@id='0']")
	WebElement usersName;
	@FindBy(xpath = "//input[@id='1']")
	WebElement usersPhone;
	@FindBy(xpath = "//input[@id='2']")
	WebElement usersMail;
	@FindBy(xpath = "//input[@class='ant-checkbox-input']")
	WebElement primaryContactCheckbox;
	@FindBy(xpath = "//button[@id='addAgency']")
	WebElement addAgencyButton;
	Actions ac;

	public WebElement deleteAgencyBtn(String agencyName) {
		return driver.findElement(By.xpath("//div[@class='ant-table-content']/..//a[text()='" + agencyName
				+ "']//following::button[@class='ant-btn ant-btn-primary ant-btn-circle ant-btn-icon-only deleteIcon']"));
	}

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement deletePopupBtn;

	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary ant-btn-circle ant-btn-icon-only deleteIcon'])[2]")
	WebElement deleteAdminOption;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement yesDeleteButton;

	@FindBy(xpath = "//button[@id='agencyDelete9']")
	WebElement deleteAgencyOption;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement yesagencyDeleteButton;

	public UsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initiaLIZATION
	}

	public void clickUserModule() throws InterruptedException {
		/*
		 * if (userModule.isDisplayed() == true) {
		 * System.out.println("If block is get executed....");/
		 */
		// userModule.click();

		System.out.println("Enter in Users module sucessfully.......");
	}

	public void UsersPageEnterName(String name) throws InterruptedException {
		Thread.sleep(8000); // utilization
		searchName.sendKeys(name);
		searchButton.click();
		Thread.sleep(3000);
		// return new UsersPage();
	}

	public void AddingUsers(String adname, String ademail, String adphone, int index, int idex)
			throws InterruptedException {
		wait(3000);
		driver.findElement(By.linkText("//*[contains(@href,'/create-user')])[1]]")).click();
		System.out.println("DEF>>>");
		wait(2000);
		driver.findElement(By.xpath("(//span[@role='img'])[4]")).click();// //li[@class='ant-menu-item'])[4]
		System.out.println("DEF1>>>");
		wait(2000);
		AddUsersButton.click();
		addUsersName.sendKeys(adname);
		wait(2000);
		addUsersEmail.sendKeys(ademail);
		wait(2000);
		addUsersPhoneNo.sendKeys(adphone);
		wait(2000);
		DesignationDropDown.click();
		selectDesignation.click();
		wait(2000);
		roleDropdown.click();
		// selectRoleDropDown(int).click();
		wait(2000);
		// SelectRole.click();
		System.out.println("Designation taken sucessfully");
		// selectRolDropDown(int).click();
		wait(2000);
		AddAdminBtn.click();
		wait(2000);
	}

	public void deleteUsersAj() throws InterruptedException {
		Thread.sleep(3000);

		userdeleteButton.click();
		Thread.sleep(2000);
		yesDeleteUser.click();

		System.out.println("After clicking on Delete Users Button , We get meassage---");
	}

	public void addUsersDetails() throws InterruptedException {
		// wait(3000);
		Thread.sleep(3000);
		int size = driver.findElements(By.xpath("//*[@href='/create-user']")).size();
		System.out.println("The size is :" + size);
		for (int i = 0; i <= size; i++) {

			String name = driver.findElements(By.xpath("//*[@href='/create-user']")).get(i).getText();
			System.out.println("The names are" + name);
		}

	}

	public void AddUsersButton(String adname, String ademail, String adphone, int index) throws InterruptedException {

		// Thread.sleep(5000);
		System.out.println("DEF>>>");
		userModule.click();
		Thread.sleep(3000);
		AddUsersButton.click();
		addUsersName.sendKeys(adname);
		Thread.sleep(2000);
		addUsersEmail.sendKeys(ademail);
		Thread.sleep(2000);
		addUsersPhoneNo.sendKeys(adphone);
		Thread.sleep(2000);
		DesignationDropDown.click();
		selectDesignation.click();
		Thread.sleep(2000);
		roleDropdown.click();
		selectRoleDropDown(index).click();
		Thread.sleep(2000);
		AddAdminBtn.click();
		Thread.sleep(4000);
	}

	public void addAgency(String agenName, String AgLocation, String uname, String uphone, String umail)
			throws InterruptedException {

		agency.click();
		Thread.sleep(3000);
		AddAgencyOption.click();
		Thread.sleep(2000);
		agencyName.sendKeys(agenName);
		Thread.sleep(3000);

		agencyLocation.sendKeys(AgLocation);
		Thread.sleep(3000);
		usersName.sendKeys(uname);
		Thread.sleep(2000);
		usersPhone.sendKeys(uphone);
		Thread.sleep(2000);
		usersMail.sendKeys(umail);
		Thread.sleep(2000);
		primaryContactCheckbox.click();
		Thread.sleep(3000);
		addAgencyButton.click();
		String deleteUsersMsg = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"))
				.getText();
		// ant-notification-topRight']")).getText();
		System.out.println("// meassage---" + deleteUsersMsg);

	}

	public void searchAgency(String searchagency) throws InterruptedException {
		// wait(3000);
		// searchAgency.click();
		searchAgency.sendKeys(searchagency);
		Thread.sleep(2000);
		searchAgencyBtn.click();

		// String Vector =
		// driver.findElement(By.xpath("(//table/tbody/tr/td[1])[16]")).getText();
		// System.out.println("Agency search is ..." + Vector);
	}

	public void deleteAgencyAj(String searchagency) {
		deleteAgencyBtn(searchagency).click();
		try {
			Thread.sleep(2000);
			deletePopupBtn.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void clickOnUserIcon() throws InterruptedException {

		Thread.sleep(30);

		driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/section/aside/div/ul/li[4]")).click();
		System.out.println("The clicked on Users Page....");

	}

	public void AddUserName() {
		// random string of length 8 composed of alphabetic characters
		String userName = RandomStringUtils.randomAlphabetic(9);
		System.out.println("The UserName is .. " + userName);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rahul" + userName);
	}

	public void AddUsersPhone() {
		Random r = new Random();

		int i1 = r.nextInt(8); // returns random number between 0 and 7
		int i2 = r.nextInt(8);
		int i3 = r.nextInt(8);
		int i4 = r.nextInt(742); // returns random number between 0 and 741
		int i5 = r.nextInt(10000); // returns random number between 0 and 9999

		String phoneNumber = String.format("%d%d%d%03d%04d", i1, i2, i3, i4, i5);
		System.out.println("The Phone number of user is .." + phoneNumber);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phoneNumber);
	}

	public void AddingUsersEmail() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("rahul" + randomInt + "@gmail.com");
		System.out.println("The emailId of user is .." + "rahul" + randomInt + "@gmail.com");
	}

	public void clickOnPlusIcon() throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@class='anticon anticon-plus-circle']")).click();
		System.out.println("The clicked on add users Page....");

	}

	public void selectDesignation() throws InterruptedException {
		// Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ant-select-selector'])[2]")));
		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[2]")).click();
		System.out.println("The clicked on Designation....");
		int size = driver.findElements(By.xpath("//input[@id='rc_select_0']")).size();
		System.out.println("The size is :" + size);
		for (int i = 0; i < size; i++) {
			String name = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']")).get(i)
					.getText();
			System.out.println("The names are :" + name);
			/*
			 * if (name.equalsIgnoreCase("Junior Software Engineer")) { //
			 * Thread.sleep(4000);
			 * driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"))
			 * .get(i).click(); break; }
			 */

		}
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
	}

	public void selectRole() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ant-select-selector'])[3]")));

		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[3]")).click();
		System.out.println("The clicked on Role....");
		int size = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']")).size();
		System.out.println("The size is :" + size);
		for (int i = 0; i < size; i++) {
			String name = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']")).get(i)
					.getText();
			System.out.println("The names are :" + name);
			if (name.equalsIgnoreCase("Admin")) {
				Thread.sleep(3000);
				driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']")).get(i).click();
				break;
			}

		}
	}

	public void addingAdminBt() {
		driver.findElement(By.xpath("//span[text()='Add User']")).click();

	}

	public void capturingSuccessMessage() {
		String expectedMSg = "success";
		String actuallyMsg = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']")).getText();
		System.out.println("After clicking on Add Users Button , We get meassage---" + actuallyMsg);
		if (expectedMSg.equalsIgnoreCase(actuallyMsg)) {

			System.out.println("It is success....");
		}
		if (!expectedMSg.equalsIgnoreCase(actuallyMsg)) {

			System.out.println("It is fail.... to capture success mesasge");
		}
	}

	public void addingAdminBtn() {
		// TODO Auto-generated method stub

	}

	public String addAgency1(String label, String AgLocation) throws InterruptedException {
		agency.click();
		Thread.sleep(3000);
		AddAgencyOption.click();
		Thread.sleep(2000);

		String agencyName = RandomStringUtils.randomAlphabetic(4);
		driver.findElement(By.xpath("//input[@name='agencyName']")).sendKeys(label + agencyName);
		String name = label + agencyName;
		agencyLocation.sendKeys(AgLocation);
		String userName = RandomStringUtils.randomAlphabetic(4);
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys(label + userName);
		Random r = new Random();

		int i1 = r.nextInt(8); // returns random number between 0 and 7
		int i2 = r.nextInt(8);
		int i3 = r.nextInt(8);
		int i4 = r.nextInt(742); // returns random number between 0 and 741
		int i5 = r.nextInt(10000); // returns random number between 0 and 9999

		String phoneNumber = String.format("%d%d%d%03d%04d", i1, i2, i3, i4, i5);
		driver.findElement(By.xpath("(//input[@name='phone'])[2]")).sendKeys(phoneNumber);

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(label + randomInt + "@gmail.com");
		Thread.sleep(2000);
		primaryContactCheckbox.click();
		Thread.sleep(3000);
		addAgencyButton.click();
		return name;

	}
}
