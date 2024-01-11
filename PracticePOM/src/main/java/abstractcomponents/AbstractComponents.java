package abstractcomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbstractComponents 
{
    WebDriver driver;
    
    public AbstractComponents(WebDriver driver)
    {
    	this.driver =driver;
    	PageFactory.initElements(driver, this);
    	
    }
     
    @FindBy(id="shopping_cart_container")
    WebElement cartLogo;
    
    public void addToCartLogo()
    {
    	cartLogo.click();
    }
	
	
}
