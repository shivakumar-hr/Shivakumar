package pom_scripts;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.JavaScriptUtil;

public class ComputersPage extends BasePage {

	public ComputersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@class='header-menu']/ul[1]/li[2]//a[contains(text(),'Computers')]")
	WebElement Computers;
	public void clickOnComputers(){
		clickAction(Computers);
	}
	
	@FindBy(xpath="//div[@class='sub-category-item']//h2[@class='title']//a[contains(text(),'Desktops')]")
	WebElement Desktops;
	public void clickOnDesktops(){
		clickAction(Desktops);
	}
	
	@FindBy(xpath="//a[contains(text(),'Build your own computer')]/../../div[3]/div[2]//input[@value='Add to cart']")
	WebElement addToCart;
	public void clickOnAddToCart(){
		clickAction(addToCart);
	}
	
	@FindBy(xpath="//label[contains(text(),'320 GB ')]")
	WebElement radioButton;
	public void clickOnRadioButton(){
		clickAction(radioButton);
	}
	
	
	@FindBy(xpath="//div[@class='add-to-cart']/div//input[@value='Add to cart']")
	WebElement clickOnAddToCartProduct;
	public void AddToCartButton(){
		clickAction(clickOnAddToCartProduct);
	}
	public void scrolltoCart(WebDriver driver){
		JavaScriptUtil js=new JavaScriptUtil(driver);
		js.jsScrollIntoView(true, clickOnAddToCartProduct);
		js.jsScrollIntoView(true, Build_your_own_expensive_computer_Add_To_Cart);
	}
	
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	WebElement clickOnShoppingCart;
	public void ShoppingCart(){
		clickAction(clickOnShoppingCart);
	}
	
	@FindBy(xpath="//a[contains(text(),'Build your own expensive computer')]/../../div[3]/div[2]//input[@value='Add to cart']")
	WebElement Build_your_own_expensive_computer;
	public void clickOnBuildYourOwnExpensiveComputer(){
		clickAction(Build_your_own_expensive_computer);
	}
	
	@FindBy(xpath="//div[@class='add-to-cart']/div//input[@value='Add to cart']")
	WebElement Build_your_own_expensive_computer_Add_To_Cart;
	public void clickOnBuild_your_own_expensive_computer(){
		clickAction(Build_your_own_expensive_computer_Add_To_Cart);
	}
	
	@FindBy(xpath="//a[contains(text(),'Desktop PC with CDRW')]")
	WebElement Desktop_PC_with_CDRW;
	public void clickOnDesktopPCwithCDRW(){
		clickAction(Desktop_PC_with_CDRW);
	}
	
	@FindBy(xpath="//a[contains(text(),'Elite Desktop PC')]")
	WebElement Elite_Desktop_PC;
	public void clickOnEliteDesktopPC(){
		clickAction(Elite_Desktop_PC);
	}
	
	@FindBy(xpath="//a[.='Simple Computer']")
	WebElement SimpleComputer;
	public void clickOnSimpleComputer(){
		clickAction(SimpleComputer);
	}
}
