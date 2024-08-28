package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public String browser = "chrome";
	
	

	public BaseClass() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else if (browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		}
			
		
	}
	
	
	public void enterText(WebElement location,String txt)
	{
		location.sendKeys(txt);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	public void mouseClick(WebElement location)
	{   
		Actions mouse=new Actions(driver);
		mouse.click(location).build().perform();
	}


	public void click(WebElement location)
	{
		location.click();
	}
	
	public void selectDropDown(WebElement dropDownLocation,String text)
	{
		Select select=new Select(dropDownLocation);
		select.selectByVisibleText(text);
		
	}
	
	
	
}
