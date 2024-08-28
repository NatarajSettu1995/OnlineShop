package TestPackage;

import org.testng.annotations.Test;

import ObjectPackage.DashBoardObject;

public class DashBoardTest {
	DashBoardObject dashBoardObject;
	@Test
	public void logout()
	{
		dashBoardObject=new DashBoardObject();	
		dashBoardObject.tab_userProfile.click();
		dashBoardObject.btn_logout.click();
	}
}
