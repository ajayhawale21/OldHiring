package Test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BaseB.BaseT;

@Ignore
public class JobsPageTest extends BaseT {
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

	
	@Test(priority = 11, dependsOnMethods = { "deleteAgency" }, enabled = true)
	public void addJD() throws InterruptedException {
		// driver.get("https://testhiring.brigosha.com/job-description");
		jp.clickOnJobIcon();
		jp.AddingJD();
		jp.LocationJ2();
		jp.JD3();

	}
/*
	@Test(priority = 11)
	public void SearchingJd() throws InterruptedException {
		jp.SearchJDAj(JdName);

	}

	@Test(priority = 12)
	public void addingProfileToJd() throws InterruptedException {

		// jp.AddProfileToJD();
		jp.AllOne();
	}
*/
	
	
	

}
