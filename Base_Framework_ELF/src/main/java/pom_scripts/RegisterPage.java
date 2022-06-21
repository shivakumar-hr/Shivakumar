package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement maleradiobtn;
	
	public void clickMradiobtn() {
		clickAction(maleradiobtn);
	}
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement femaleradiobtn;
	
	public void clickFradiobtn() {
		clickAction(maleradiobtn);
	}
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstnametxtfield;
	
	public void sendvalueFnTxtfield(String value){
		enter_value(firstnametxtfield, value);
	}
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastnametxtfield;
	
	public void sendvalueLnTxtfield(String value){
		enter_value(lastnametxtfield, value);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement emailtxtfield;
	
	public void sendvalueEmailTxtfield(String value){
		enter_value(emailtxtfield, value);
	}
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement pwdtxtfield;
	
	public void sendvaluePwdTxtfield(String value){
		enter_value(pwdtxtfield, value);
	}
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confirmpwdtxtfield;
	
	public void sendvalueCpwTxtfield(String value){
		enter_value(confirmpwdtxtfield, value);
	}
	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement registerbtn;
	
	public void clickRegisterbtn() {
		clickAction(registerbtn);
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement Continue;
	
	public String Continuepresent(){
		Continue.isDisplayed();
		return "Succesfull";
	}
	/*public void clickonMaleradiobtn(){
		maleradiobtn.click();
	}
	
	public void clickFemaleradiobtn(){
		femaleradiobtn.click();
	}
	
	public void fnametxtvalue(String fname){
		firstnametxtfield.sendKeys(fname);
	}
	
	public void lnametxtvalue(String lname){
		lastnametxtfield.sendKeys(lname);
	}
	
	public void emailtxtvalue(String email){
		emailtxtfield.sendKeys(email);
	}
	
	public void pwdtxtvalue(String pwd){
		pwdtxtfield.sendKeys(pwd);
	}
	
	public void cpwdtxtvalue(String pwd){
		confirmpwdtxtfield.sendKeys(pwd);
	}
	
	public void registerbtnclick(){
		registerbtn.click();
	}*/


}
