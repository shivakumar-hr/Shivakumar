package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class WelcomePage extends BasePage{
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "ico-login")
	WebElement Loginlink;
	
	public void clickLogin() {
		clickAction(Loginlink);
	}
	
	@FindBy(className = "ico-register")
	WebElement RegisterLink;
	
	public void clickRegister() {
		clickAction(RegisterLink);
	}
	
	@FindBy(className="ico-cart")
	WebElement cartLink;
	
	public void clickCartLink(){
		clickAction(cartLink);
	}
	
	@FindBy(className="ico-wishlist")
	WebElement wishList;
	
	public void clickWishListLink(){
		clickAction(wishList);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Books')]")
	WebElement booksMenu;
	
	public void clickBooksLink(){
		clickAction(booksMenu);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Computers')]")
	WebElement computersMenu;
	
	public void clickComputersink(){
		clickAction(computersMenu);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Desktops')]")
	WebElement desktopsubMenu;
	
	public void clickdesktopLink(){
		actions_classObject(driver).moveToElement(computersMenu);
		clickAction(desktopsubMenu);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Notebooks')]")
	WebElement notebooksubMenu;
	
	public void clickNotebooksLink(){
		actions_classObject(driver).moveToElement(computersMenu);
		clickAction(notebooksubMenu);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Accessories')]")
	WebElement accessoriessubMenu;
	
	public void clickAccesorriesLink(){
		actions_classObject(driver).moveToElement(computersMenu);
		clickAction(accessoriessubMenu);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Apparel')]")
	WebElement apparelnshoesMenu;
	
	public void clickApparelnShoesLink(){
		clickAction(apparelnshoesMenu);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Digital')]")
	WebElement digitaldownloadMenu;
	
	public void clickDigiDownloadLink(){
		clickAction(digitaldownloadMenu);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Electronics')]")
	WebElement electronicsMenu;
	
	public void clickElectronicsLink(){
		clickAction(electronicsMenu);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Camera')]")
	WebElement camernphotosubMenu;
	
	public void clickCameraLink(){
		actions_classObject(driver).moveToElement(electronicsMenu);
		clickAction(camernphotosubMenu);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Cell')]")
	WebElement cellphonesubMenu;
	
	public void clickCellPhonesLink(){
		clickAction(cellphonesubMenu);
	}
	public void movetoElectronics(WebDriver driver){
		actions_classObject(driver).moveToElement(electronicsMenu).perform();
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Jewelry')]")
	WebElement jewleryMenu;
	
	public void clickJeweleryLink(){
		clickAction(jewleryMenu);
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(.,'Gift')]")
	WebElement giftcardsMenu;
	
	public void clickGiftcardsLink(){
		clickAction(giftcardsMenu);
	}

}
