package Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BaseB.BaseT;
import PageOrder.PanelistsPage;
@Ignore
public class PanelistsPageTest3 extends BaseT {

	
	@Test(priority=16, dependsOnGroups = { "JobDescriptionPage" })
	public void panelistAdd() throws InterruptedException {
		pp.AddPanelist(BaseT.ReadConfig("PanelistName"), BaseT.ReadConfig("PanelistEmail"), BaseT.ReadConfig("PanelistPhone"));
	}
	
	@Test(priority=17)
	public void editingPanelists() throws InterruptedException {
	pp.EditPanelist(BaseT.ReadConfig("EditPanelistPhone"));	
	}
	
	@Test(priority=18)
	
	public void searchingPanelists() throws InterruptedException {
		pp.SearchPanel(BaseT.ReadConfig("PanelistSearch"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
