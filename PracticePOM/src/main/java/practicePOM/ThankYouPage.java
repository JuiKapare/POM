package practicePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponents.AbstractComponents;

public class ThankYouPage extends AbstractComponents
{

WebDriver driver;
	
	public ThankYouPage(WebDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css=".complete-header")
	WebElement confirmsg;
	
	public String confirmMsg()
	{
		return confirmsg.getText();
	}
	

}



