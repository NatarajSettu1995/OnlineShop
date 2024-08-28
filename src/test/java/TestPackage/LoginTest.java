package TestPackage;

import org.testng.annotations.Test;

import ObjectPackage.LoginObject;

public class LoginTest {

	LoginObject loginObject;
	@Test
	public void login()
	{
		loginObject=new LoginObject();
		
//		loginObject.txt_userName.sendKeys("Admin");
//		loginObject.txt_password.sendKeys("admin123");
//		loginObject.btn_login.click();
		
		loginObject.enterText(loginObject.txt_userName, "Admin");
		loginObject.enterText(loginObject.txt_password, "admin123");
		//loginObject.btn_login.click();
		loginObject.click(loginObject.btn_login);
		
	}
}
