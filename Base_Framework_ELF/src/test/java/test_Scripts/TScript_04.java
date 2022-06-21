package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.JewelryPage;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TScript_04 extends Base_Test{
	
	@Test(dataProvider = "TestData")
	public void testScript4(String email, String pwd) throws IOException {
		
		  WelcomePage Wp=new WelcomePage(driver); //pending Testsript
		  Wp.clickLogin();
		  LoginPage lp=new LoginPage(driver); 
		  lp.enterValueInEmail(email); 
		  lp.enterValueInPwd(pwd);
		  lp.clickLoginButton();
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		  test.log(LogStatus.INFO, "User is logged in");
		  
		  JewelryPage jp=new JewelryPage(driver);
		  jp.clickonjewelLink();
		  jp.clickDiaproduct();
		  jp.AddtoWishListButton();
		  jp.AddtoWishListLink();
		  jp.ClickOnAddToCartCheckBox();
		  jp.clickonAddtocartButton();
		  
	}
	
	@DataProvider(name = "TestData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Login");
		return testdata;
	}

}
