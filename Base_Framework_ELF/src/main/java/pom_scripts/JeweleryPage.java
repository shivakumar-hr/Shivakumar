package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.JavaScriptUtil;

public class JeweleryPage extends BasePage {

	public JeweleryPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[@class='details']//a[contains(.,'Black & White Diamond Heart')]")
	WebElement BlnWhiDiamond;
	
	public void clickBlknWhtDiamond(){
		clickAction(BlnWhiDiamond);
	}
	public void scrollto(WebDriver driver){
		JavaScriptUtil js=new JavaScriptUtil(driver);
		  js.jsScrollIntoView(true,BlnWhiDiamond);
		
	}
	
	@FindBy(xpath="//input[@class='qty-input']")
	WebElement Qtytxtfeild;
	
	public void valueenterQty(String value){
		Qtytxtfeild.clear();
		enter_value(Qtytxtfeild, value);
	}
	@FindBy(xpath="//div[@class='add-to-cart-panel']//input[@value='Add to cart']")
	WebElement AddtoCartbtn;
	
	public void clickonCart(){
		clickAction(AddtoCartbtn);
	}
	@FindBy(xpath="//input[@id='add-to-wishlist-button-14']")
	WebElement WishListButton;
	public void AddtoWishListButton() {
		clickAction(WishListButton);
	}
	
}

