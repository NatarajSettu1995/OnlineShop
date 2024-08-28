package ObjectPackage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class DashBoardObject extends BaseClass{

	public DashBoardObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	public WebElement tab_userProfile;
	
	@FindBy(xpath="//*[text()='Logout']")
	public WebElement btn_logout;
	
}
