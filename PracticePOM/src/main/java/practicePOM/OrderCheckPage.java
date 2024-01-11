package practicePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponents.AbstractComponents;

public class OrderCheckPage extends AbstractComponents
{

WebDriver driver;
	
	public OrderCheckPage(WebDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="finish")
	WebElement finish;
	
	public ThankYouPage tapFinishBtn()
	{
		finish.click();
		ThankYouPage ty = new ThankYouPage(driver);
		return ty;
	}
	
}
