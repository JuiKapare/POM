package practicePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void goToWebPage()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	@FindBy(id="user-name")
	WebElement emailid;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement Loginbtn;
	
	public HomePage userCred(String email,String pass)
	{
		emailid.sendKeys(email);
		password.sendKeys(pass);
		Loginbtn.click();
		HomePage hp = new HomePage(driver);
		return hp;
	}

}
