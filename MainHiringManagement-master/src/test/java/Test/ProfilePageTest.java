package Test;

import org.testng.annotations.Test;

import BaseB.BaseT;

public class ProfilePageTest extends BaseT {

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

	@Test(priority = 14)

	public void ShortlistProfile() throws InterruptedException {
		jp.ViewProfileShort();
	}

	@Test(priority = 15)
	public void RejectProfile() throws InterruptedException {
		jp.Profilereject();
	}

}
