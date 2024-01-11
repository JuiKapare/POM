package practicePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponents.AbstractComponents;

public class CheckOutPage extends AbstractComponents

{

WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	public InfoPage CheckOut()
	{
		checkout.click();
		
		InfoPage ip = new InfoPage(driver);
		return ip;
	}
}
