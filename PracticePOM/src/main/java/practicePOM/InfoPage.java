package practicePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponents.AbstractComponents;

public class InfoPage extends AbstractComponents
{

WebDriver driver;
	
	public InfoPage(WebDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement postc;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	
	public void enterInfo(String name, String lastn , String x)
	{
		fname.sendKeys(name);
		lname.sendKeys(lastn);
		postc.sendKeys(x);;
	}
	
	public OrderCheckPage tapContinueBtn()
	{
		continueBtn.click();
		
		OrderCheckPage oc = new OrderCheckPage(driver);
		return oc;
	}
}
