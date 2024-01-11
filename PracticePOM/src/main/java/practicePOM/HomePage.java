package practicePOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponents.AbstractComponents;

public class HomePage extends AbstractComponents
{

WebDriver driver;
	
	public HomePage(WebDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css=".inventory_item")//.inventory_item:nth-child(5)
	List<WebElement> products;
	
	
	By addToCartBtn = By.cssSelector(".btn_small");
	
	By itemaddress = By.cssSelector(".inventory_item_name");
	
	public WebElement selectProduct(String itemName)
	{
		WebElement item =products.stream().filter(s->s.findElement(itemaddress).getText().equals(itemName)).findFirst().orElse(null);//find the item
		return item; //after finding return the item 
		
	}
	
	public CheckOutPage addToCartItem(String itemName)
	{
		WebElement item = selectProduct(itemName); // call the item which need to be selected from above method
		item.findElement(addToCartBtn).click(); // tap on add to cart of that item sepcifically
		CheckOutPage co = new CheckOutPage(driver);
		return co;
		
		
		
	}
	
	
}
