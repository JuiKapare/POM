package practicePOM;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MainClass {

	public static void main(String[] args) 
	{
		String email ="standard_user";
		String pass = "secret_sauce";
		String itemName = "Sauce Labs Onesie";
		String name ="standard_user";
		String lastn ="standard_user";
		String x ="53789";
		
		
		WebDriver driver = new ChromeDriver();
		
		LoginPage lp = new LoginPage(driver);
		lp.goToWebPage();
		HomePage hp = lp.userCred(email, pass);
		
		
		
		CheckOutPage co =hp.addToCartItem(itemName);
		
		hp.addToCartLogo();
		
		
		InfoPage ip =co.CheckOut();
		
		
	    ip.enterInfo(name, lastn, x);
	    OrderCheckPage oc = ip.tapContinueBtn();
		
		
		
	    ThankYouPage ty = oc.tapFinishBtn();
		
		
		String actualtext = ty.confirmMsg();
		Assert.assertTrue(actualtext.equalsIgnoreCase("Thank you for your order!"));
		 driver.close();

	}

}
