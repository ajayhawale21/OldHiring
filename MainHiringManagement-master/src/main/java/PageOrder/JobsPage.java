package PageOrder;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Reporter;

public class JobsPage {
	WebDriver driver;
	@FindBy(xpath = "(//div[@class='ant-tabs-tab-btn'])[1]")
	WebElement activeJobTitle;
	@FindBy(xpath = "(//div[@class='ant-tabs-tab-btn'])[2]")
	WebElement inactiveJobTitle;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[1]")
	WebElement jobTitle;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[2]")
	WebElement vacancies;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[3]")
	WebElement experience;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[4]")
	WebElement notice;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[5]")
	WebElement location;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[6]")
	WebElement contact;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[7]")
	WebElement manage;
	@FindBy(xpath = "//input[@placeholder='Search JD']")
	WebElement searchJD;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-input-search-button']")
	WebElement searchJDButton;

	/* to add a job */
	@FindBy(xpath = "//button[@id='addJds']")
	WebElement addJD;
	@FindBy(xpath = "//input[@name='jobTitle']")
	WebElement jdName;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement jdLocationDropDown;
	@FindBy(xpath = "//div[@title='Bangalore']")
	WebElement selectJdLocation;
	@FindBy(xpath = "//div[@class='m-b-10']")
	WebElement jdJobDesc;
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	WebElement addDesc;
	@FindBy(xpath = "//button[@id='saveTextEditorJd']")
	WebElement saveDesc;
	@FindBy(xpath = "//input[@placeholder='Vacancies']")
	WebElement jdvacancies;
	@FindBy(xpath = "//input[@placeholder='min']")
	WebElement jdMinExp;
	@FindBy(xpath = "//input[@placeholder='max']")
	WebElement jdMaxExp;
	@FindBy(xpath = "//input[@placeholder='Notice(Days)']")
	WebElement jdNotice;
	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[2]")
	WebElement priorityDropDown;
	@FindBy(xpath = "//div[@title='Moderate']")
	WebElement selectPriority;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[4]")
	WebElement shortlisterDropDown;
	@FindBy(xpath = "//div[@title='TestAdmin']")
	WebElement selectShortlister;
	@FindBy(xpath = "//button[@id='addRound']")
	WebElement AddRound;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[6]")
	WebElement selectRound1;
	@FindBy(xpath = "(//div[@title='Satarupa'])[2]")
	WebElement selectP1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[7]")
	WebElement selectRoundType1;
	@FindBy(xpath = "//div[@title='Technical']")
	WebElement selectT1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[8]")
	WebElement selectRound2;
	@FindBy(xpath = "(//div[@title='Sri'])[2]")
	WebElement selectP2;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[10]")
	WebElement jdContactDropDown;
	@FindBy(xpath = "(//div[@title='praveen'])[3]")
	WebElement selectContact;
	@FindBy(xpath = "//button[@id='addJd']")
	WebElement AddJDButton;
	@FindBy(xpath = "//a[text()='Manual testing']")
	WebElement jdAutomationTesting;

	/* Ajay Adding JD */
	@FindBy(xpath = "(//span[@role='img'])[5]")
	WebElement JobsModule;
	@FindBy(xpath = "(//span[text()='Add JD'])[1]")
	WebElement AddJDBtn;
	@FindBy(xpath = "(//div[text()='Add Job Description'])[2]")
	WebElement ADDJdText;// ABCD
	@FindBy(xpath = "//button[@id='saveTextEditorJd']")
	WebElement SaveButton;
	@FindBy(xpath = "//input[@name='jobTitle']")
	WebElement JobTitleField; // sendkeys-Associates
	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[1]")
	WebElement SelectLocation; // sendkeys-Banglore
	@FindBy(xpath = "(//div[text( )='Bangalore'])[2]")
	WebElement Bangalore;
	@FindBy(xpath = "(//input[@placeholder='Vacancies'])[1]")
	WebElement Vacancies;
	@FindBy(xpath = "(//input[@placeholder='min'])[1]")
	WebElement MinExperience;
	@FindBy(xpath = "(//input[@placeholder='max'])[1]")
	WebElement MaxExperience;
	@FindBy(xpath = "(//input[@placeholder='Notice(Days)'])[1]")
	WebElement NoticeDays;
	@FindBy(xpath = "(//input[@id='rc_select_4'])[1]")
	WebElement Priority; // sendkeys-High
	@FindBy(xpath = "(//span[text()='R&D'])[1]")
	WebElement RnDButton;
	@FindBy(xpath = "(//div[@class='ant-select ant-select-single ant-select-show-arrow ant-select-show-search'])[2]")
	WebElement Shortlister; // Thejas
	@FindBy(xpath = "//span[text()='Add Round']")
	WebElement AddRoundBtn;
	@FindBy(xpath = "//input[@id='Round1']")
	WebElement Round1;// Reeshra
	@FindBy(xpath = "(//input[@id='Round1Type'])[1]")
	WebElement RoundType; // Technical
	@FindBy(xpath = "//input[@id='Round1']")
	WebElement Round2;// Reeshra
	@FindBy(xpath = "(//input[@id='rc_select_10'])[1]")
	WebElement Contact;// Reeshra
	@FindBy(xpath = "(//input[@id='rc_select_13'])[1]")
	WebElement SelectFeedbackType;// Technical Automotive
	@FindBy(xpath = "(//button[@id='addJd'])[1]")
	WebElement AddJDBtnFinal;

	@FindBy(xpath = "//input[@placeholder='Search JD']")
	WebElement searchJdField;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-input-search-button']")
	WebElement searchQBtn;

	@FindBy(xpath = "(//span[@aria-label='eye'])[1]")
	WebElement ViewProfileForJDEyeBtn;

	@FindBy(xpath = "(//tbody/tr[1]/td[2])[1]")
	WebElement AnkitProfile;
	@FindBy(xpath = "//textarea[@name='shortlisterComment']")
	WebElement ShortlisterComment;
	@FindBy(xpath = "//button[@id='shortlistCandidate']")
	WebElement ShortlistProfileBtn;
	@FindBy(xpath = "//button[@id='rejectCandidate']")
	WebElement RejectProfileBtn;

	/* Ajay end of Adding JD */

	/* Ajay Adding Profile to Jd */
	@FindBy(xpath = "//button[@id='add9']")
	WebElement plusButton;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Name;
	@FindBy(xpath = "//input[@name='currentLocation']")
	WebElement CurrentLocation;
	@FindBy(xpath = "//input[@name='e-Mail']")
	WebElement EmailID;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement PhoneNum;
	@FindBy(xpath = "//input[@name='Years']")
	WebElement YearsExperience;
	@FindBy(xpath = "//input[@name='Months']")
	WebElement MonthsExperience;
	@FindBy(xpath = "(//input[@placeholder='Notice(Days)'])[2]")
	WebElement NoticeDay;
	@FindBy(xpath = "(//input[@id='rc_select_16'])[1]")
	WebElement preferedLocation;
	//// div[contains(@class,'ant-select ant-select-single ant-select-show-arrow
	//// ant-select-show-search')]
	@FindBy(xpath = "(//input[@name='currentCTC'])[1]")
	WebElement CurrentCTC;
	@FindBy(xpath = "(//input[@name='expectedCTC'])[1]")
	WebElement ExpectedCTC;
	@FindBy(xpath = "(//span[text()='Attach Resume'])[1]")
	WebElement AttachResume;
	@FindBy(xpath = "(//span[text()='Submit Profile'])[1]")
	WebElement SubmitProfileBtn;
	/* Ajay end of Adding Profile to Jd */

	/* to add a profile */
	@FindBy(xpath = "//button[@id='add7']")
	WebElement addProfileButton;
	@FindBy(xpath = "//input[@name='name']")
	WebElement addPflName;
	@FindBy(xpath = "(//*[@class='ant-select-selection-placeholder'])[1]")
	WebElement addPflLocation;
	@FindBy(xpath = "//input[@name='e-Mail']")
	WebElement addPflEmail;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement addPflPhone;
	@FindBy(xpath = "//input[@name='Years']")
	WebElement addPflExpInYears;
	@FindBy(xpath = "//input[@name='Months']")
	WebElement addPflExpInMonths;
	@FindBy(xpath = "(//input[@class='ant-input-number-input'])[3]")
	WebElement addPflNoticeDays;
	@FindBy(xpath = "//div[@class='ant-select-selector']")
	WebElement addPflLocationDropDown;
	@FindBy(xpath = "//div[@title='Bangalore']")
	WebElement addPflSelectLocation;
	@FindBy(xpath = "//input[@name='currentCTC']")
	WebElement addPflCurrentCTC;
	@FindBy(xpath = "//input[@name='expectedCTC']")
	WebElement addPflExpectedCTC;
	@FindBy(xpath = "//div[@class='ant-upload ant-upload-select ant-upload-select-picture-card']")
	WebElement addPflPicture;
	@FindBy(xpath = "//button[@class='ant-btn']")
	WebElement addPflResume;
	@FindBy(xpath = "//button[@id='submitProfile']")
	WebElement addPflSubmitButton;

	@FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div/div/div/div")
	WebElement prioritiesHigh;

	// adding jd to automation tester

	@FindBy(xpath = "(//span[@class='anticon anticon-plus'])[1]")
	WebElement automationTesterAddBtn;
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement PersonalName;
	@FindBy(xpath = "//input[@name='currentLocation']")
	WebElement CurrentLoc;
	@FindBy(xpath = "//input[@name='e-Mail']")
	WebElement Email;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@name='Years']")
	WebElement ExpYears;
	@FindBy(xpath = "//input[@name='Months']")
	WebElement ExpMonths;
	@FindBy(xpath = "(//input[@name='notice(Days)'])")
	WebElement Noticeday;
	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[2]")
	WebElement PreferedLoc;
	@FindBy(xpath = "//input[@name='currentCTC']")
	WebElement CurrentCtc;
	@FindBy(xpath = "//input[@name='expectedCTC']")
	WebElement ExpCtc;
	@FindBy(xpath = "//button[@class='ant-btn']")
	WebElement AttachRes;
	@FindBy(xpath = "//span[text()='Submit Profile']")
	WebElement SumbitProfBtn;
	@FindBy(xpath = "//div[@class='ant-upload ant-upload-select ant-upload-select-picture-card']")
	WebElement addPflPic;
	@FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[4]/div[1]/div[1]/div")
	WebElement TillExperienceField;
	@FindBy(xpath = "//span[text()='Submit']")
	WebElement FinalSubmitBtn;
	@FindBy (xpath="//input[@type='checkbox']")
	WebElement DuplicateCheckBox;

	public JobsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initiaLIZATION
	}

	public void clickOnJobIcon() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='root']/section/section/section/aside/div/ul/li[5]")).click();
		System.out.println("The clicked on Job Page....");

	}

	public void addingAutomationTesterProfile() throws InterruptedException {

		// automationTesterAddBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='anticon anticon-plus'])[1]")));
		automationTesterAddBtn.click();
		System.out.println("cliked on + button");
	}

	public void AddPersonName() {
		// random string of length 8 composed of alphabetic characters
		String userName = RandomStringUtils.randomAlphabetic(8);
		System.out.println("The UserName is .. " + userName);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ajay" + userName);
	}

	public void AddPersonPhone() {
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

	public void AddingPersonEmail() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(By.xpath("//input[@name='e-Mail']")).sendKeys("ajay" + randomInt + "@gmail.com");
		System.out.println("The emailId of user is .." + "ajay" + randomInt + "@gmail.com");
	}

	public void AddingPersonalOtherDetails() throws InterruptedException {
		CurrentLoc.sendKeys("Pune");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(
				By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[4]/div[1]/div[1]/div"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		ExpYears.sendKeys("3");
		ExpMonths.sendKeys("7");
		Noticeday.sendKeys("10");
		// PreferedLoc.sendKeys("Bangalore");
		CurrentCtc.sendKeys("10");
		ExpCtc.sendKeys("15");
		// AttachRes.sendKeys("C:\\Users\\Brigosha_Guest\\Downloads\\ResumeBrigosha.pdf");
		// wait(3000);
		// addPflPic.sendKeys("C:\\Users\\Brigosha_Guest\\Downloads\\profile.jpg");
		// wait(3000);
		// SumbitProfBtn.click();
		System.out.println("Profile successfully gets added in automation tester JD ");
		// wait(7000);
	}

	public void selectPrefferdLocationAddProf() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[contains(@class,'ant-select ant-select-single ant-select-show-arrow ant-select-show-search')]")));
		driver.findElement(By.xpath(
				"//div[contains(@class,'ant-select ant-select-single ant-select-show-arrow ant-select-show-search')]"))
				.click();
		System.out.println("The clicked on Prefered Location while adding profile....");
		int size = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']")).size();
		System.out.println("The size is :" + size);
		for (int i = 0; i < size; i++) {
			String Locations = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']")).get(i)
					.getText();
			System.out.println("The Locations are :" + Locations);

		}
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
	}

	public void uploadFile() throws InterruptedException, AWTException {
		Actions act = new Actions(driver);
		WebElement resume = driver.findElement(By.xpath("(//span[@class='ant-upload'])[2]"));
		act.moveToElement(resume).click().perform();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Brigosha_Guest\\Downloads\\ResumeBrigosha.pdf");
		WebElement pic = driver.findElement(By.xpath("(//span[@class='ant-upload'])[1]"));
		act.moveToElement(pic).click().perform();
		Thread.sleep(2000);
		uploadfile("C:\\Users\\Brigosha_Guest\\Desktop\\profile.jpg");
		// pic.sendKeys("C:\\Users\\Brigosha_Guest\\Desktop\\profile.jpg");
		// Thread.sleep(5000);
		// WebElement resume =
		// driver.findElement(By.xpath("(//span[@class='ant-upload'])[2]"));
		// resume.sendKeys("C:\\Users\\Brigosha_Guest\\Downloads\\ResumeBrigosha.pdf");
		// Thread.sleep(2000);
		System.out.println("Profile picture & Resume gets uploaded..");
		SumbitProfBtn.click();
		Thread.sleep(2000);
		FinalSubmitBtn.click();
		System.out.println("Add profile gets successfully added.");

	}

	public static void uploadfile(String filePath) throws AWTException {
		setClipBoard(filePath);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void setClipBoard(String file) {
		StringSelection obj = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}

	public void AddingJD() throws InterruptedException {

		AddJDBtn.click();
		JobTitleField.sendKeys("Associates");
		Thread.sleep(5000);
		System.out.println("Job title was Entered ");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Select
		// Location']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Select Location']")));
		driver.findElement(By.xpath("//*[text()='Select Location']")).sendKeys("Pune");
		/*
		 * driver.findElement(By.xpath("(//div[text()='Add Job Description'])[2]")).
		 * click();
		 *
		 *
		 * (//*[@class='ant-select ant-select-multiple ant-select-show-search'])[1]
		 *
		 * driver.findElement(By.xpath("(//button[@id='saveTextEditorJd'])")).click();
		 *
		 * driver.findElement(By.xpath("((//input[@role='spinbutton'])[1]")).sendKeys(
		 * "10");
		 * driver.findElement(By.xpath("((//input[@role='spinbutton'])[1]")).sendKeys(
		 * "1");
		 * driver.findElement(By.xpath("((//input[@role='spinbutton'])[1]")).sendKeys(
		 * "3");
		 * driver.findElement(By.xpath("((//input[@role='spinbutton'])[1]")).sendKeys(
		 * "30");
		 */

	}

	public void AllOne() throws InterruptedException {
		AddJDBtn.click();
		JobTitleField.sendKeys("Associates");
		Thread.sleep(5000);
		System.out.println("Job title was Entered ");
		Thread.sleep(5000);
		// driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[2]")).click();
		// System.out.println("Clicked on location button ");
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@placeholder='Vacancies']")).sendKeys("10");
//driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[3]")).sendKeys("High");
		/*
		 * driver.findElement(By.
		 * xpath("(//*[@class='ant-select-selection-overflow-item ant-select-selection-overflow-item-suffix'])[1]"
		 * )).click();
		 *
		 */
		driver.findElement(
				By.xpath("//*[@class='ant-form ant-form-horizontal']/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div"))
				.click();
		// driver.findElement(By.xpath("(//*[text()='Select Location'])[1]")).click();
		wait(2000);
		driver.findElement(By.xpath("(//*[@class='rc-virtual-list-holder-inner']/div[1])[1]")).click();
		wait(2000);
		driver.findElement(By.xpath("(//*[@class='rc-virtual-list-holder-inner']/div[1])[1]")).click();

		driver.findElement(By.xpath("(//*[@class='ant-row ant-form-item form-item'])[2]")).sendKeys("Coimbatore");
		wait(2000);
		driver.findElement(By.xpath("(//*[text()='Coimbatore'])[3]")).click();
		wait(2000);
		driver.findElement(By.xpath("//*[@class='m-b-10']")).click();
		wait(2000);
		driver.findElement(By.xpath("//*[@class='ql-editor ql-blank']")).sendKeys("qwerty");
		wait(2000);
		driver.findElement(By.xpath("//*[@id='saveTextEditorJd']")).click();
		wait(2000);
		prioritiesHigh.click();
		prioritiesHigh.sendKeys("High");
		System.out.println("Priorities also got printed");

	}

	public void LocationJD() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7000));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Select
		// Location']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ant-select-selector'])[2]")));

		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[2]")).click();
		System.out.println("The clicked on Location....");
		int size = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']")).size();
		System.out.println("The size is :" + size);
		for (int i = 1; i < size; i++) {
			String name = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']")).get(i)
					.getText();
			System.out.println("The Location names are :" + name);
			System.out.println("The names are :" + name);
			if (name.equalsIgnoreCase("Bangalore")) {
				Thread.sleep(3000);
				driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']")).get(i).click();
				break;
			}

		}
	}

	public void LocationJ2() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Select Location'])")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='Select Location'])")).click();
		System.out.println("The clicked on Location....");
		int size = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']")).size();
		System.out.println("The size is :" + size);
		for (int i = 1; i < size; i++) {
			String name = driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]"))
					.getText();
			System.out.println("The Location names are :" + name);
			System.out.println("The names are :" + name);
			if (name.equalsIgnoreCase("Bangalore")) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
				break;
			}

		}
	}

	public void JD3() throws InterruptedException {
		ADDJdText.sendKeys("ABCD");
		SaveButton.click();
		wait(3000);

		Vacancies.sendKeys("5");
		wait(2000);
		MinExperience.sendKeys("2");
		MaxExperience.sendKeys("5");
		wait(2000);
		NoticeDays.sendKeys("30");
		Priority.sendKeys("High");
		wait(3000);
		RnDButton.click();
		wait(3000);
		Shortlister.sendKeys("Thejas");
		wait(2000);
		AddRoundBtn.click();
		wait(3000);
		Round1.sendKeys("Reeshra");
		RoundType.sendKeys("Technical");
		Round2.sendKeys("Reeshra");
		Contact.sendKeys("Reeshra");
		wait(3000);
		SelectFeedbackType.sendKeys("Technical Automotive");
		wait(3000);
		AddJDBtnFinal.click();
		wait(2000);
		FinalSubmitBtn.click();
	}

	// String profLoc,profLoc
	// String profName, String profEmail, String profPhone, String i, String j,
	// String k, String PrefLoc, String l, String m

	public void AddProfileToJD() throws InterruptedException, AWTException {
		wait(3000);
		addProfileButton.click();
		wait(3000);
		addPflName.sendKeys();
		wait(8000);
		// addPflLocation.sendKeys("Pune");
		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[2]")).click();
		System.out.println("Click was done....");
		wait(3000);
		addPflEmail.sendKeys();
		PhoneNum.sendKeys();
		wait(3000);
		addPflExpInYears.sendKeys();
		MonthsExperience.sendKeys();
		addPflNoticeDays.sendKeys();
		wait(3000);
		preferedLocation.click();
		wait(3000);

		/*
		 * //Robot robot = new Robot(); //Thread.sleep(2000); Thread.sleep(2000); //
		 * robot.keyPress(KeyEvent.VK_DOWN); // Thread.sleep(2000); //
		 * robot.keyRelease(KeyEvent.VK_DOWN); // Thread.sleep(2000);
		 * robot.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
		 * robot.keyRelease(KeyEvent.VK_DOWN); Thread.sleep(2000);
		 * robot.keyPress(KeyEvent.VK_ENTER); Thread.sleep(2000);
		 * robot.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(2000);
		 */
		CurrentCTC.sendKeys();
		ExpectedCTC.sendKeys();
		AttachResume.click();// resume attach pdf file
		wait(3000);
		AddJDBtnFinal.click();
	}

	public void SearchJDAj(String JDName) throws InterruptedException {

		searchJdField.clear();
		searchJdField.sendKeys(JDName);
		searchQBtn.click();
		System.out.println("Automation tester is successfully searched...,");
	}

	public void ViewProfileShort() throws InterruptedException {
		Thread.sleep(3000);
		ViewProfileForJDEyeBtn.click();
		// wait(3000);
		AnkitProfile.click();
		ShortlisterComment.sendKeys("You get shortlisted ..!!!");
		Thread.sleep(5000);
		if (ShortlistProfileBtn.isDisplayed()) {
			ShortlistProfileBtn.click();
		} else {
			System.out.println("Profile shortlister button issue.");
		}
	}

	public void Profilereject() throws InterruptedException {
		Thread.sleep(3000);
		ViewProfileForJDEyeBtn.click();
		//Thread.sleep(3000);
		AnkitProfile.click();
		//Thread.sleep(3000);
		//System.out.println("Clicked on the profiele...");
		ShortlisterComment.sendKeys("You get Rejected ..!!!");
		Thread.sleep(5000);
		if (RejectProfileBtn.isDisplayed()) {
			RejectProfileBtn.click();
		} else {
			System.out.println("Profile Reject button issue.");
		}
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement Element = driver.findElement(By.xpath("//*[text()='Reject']"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		System.out.println("Scrolldown ws done...");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Reject']")));
//Thread.sleep(3000);
//		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-text'])[1]")).click();

		// ShortlisterComment.sendKeys("You get Rejected ..!!!");
	//	Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[text()='Reject']")).click();  //input[@type='checkbox']   //button[@id='rejectCandidate']
		
	}
	public void ViewProfileDuplicate() throws InterruptedException {
		Thread.sleep(3000);
		ViewProfileForJDEyeBtn.click();
		// wait(3000);
		AnkitProfile.click();
		ShortlisterComment.sendKeys("You are dublicate ..!!!");
		Thread.sleep(5000);
		if (DuplicateCheckBox.isDisplayed()) {
			DuplicateCheckBox.click();
		} else {
			System.out.println("Profile deplicate button issue.");
		}
		//button[@class='ant-btn ant-btn-primary']
		driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/div/div[2]/div/div/div[2]/button[2]")).click();
	}
}
