package Test;

import org.testng.annotations.Test;

import BaseB.BaseT;

public class DashBoardPageTest4 extends BaseT {

@Test(priority=19)	
public void panelistOverviewDisplay() throws InterruptedException {
dp.PanelistPage();
dp.SelectPanelist();
dp.SelectCalenderPanelist();
dp.PanelistOverview();
}
	
	
	
	
	
	
}
