package ObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginObject extends BaseClass{

	public LoginObject() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement txt_userName;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement btn_login;
	

}
