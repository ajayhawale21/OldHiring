package Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import BaseB.BaseT;

public class SmokeClass extends BaseT  {

	@Test(priority = 12)
	public void addingProfileToJd() throws InterruptedException, AWTException {
		jp.AddProfileToJD();
	}
}

