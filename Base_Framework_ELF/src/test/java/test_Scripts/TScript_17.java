package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.BasePage;
import pom_scripts.ComputersPage;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TScript_17 extends Base_Test {


	@Test(dataProvider = "testdata")
	public void testScript17(String email, String pwd) throws IOException {
		
		  WelcomePage Wp=new WelcomePage(driver); 
		  Wp.clickLogin();
		  LoginPage lp=new LoginPage(driver); 
		  lp.enterValueInEmail(email); 
		  lp.enterValueInPwd(pwd);
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		  lp.clickLoginButton();
		  test.log(LogStatus.INFO, "User is logged in");
		  
		  ComputersPage com=new ComputersPage(driver);
		  com.clickOnComputers();
		  com.clickOnDesktops();
		  com.clickOnAddToCart();
		  com.clickOnRadioButton();
		  com.scrolltoCart(driver);
		  com.AddToCartButton();
		  com.ShoppingCart();
	}
	
	
	
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Login");
		return testdata;
	}
}
