package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.JeweleryPage;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TScript_03 extends Base_Test {
	
	
	@Test(dataProvider = "testdata")
	public void tc_03(String email, String pwd) throws IOException, InterruptedException {
		
		  WelcomePage Wp=new WelcomePage(driver); 
		  Wp.clickLogin();
		  LoginPage lp=new LoginPage(driver); 
		  lp.enterValueInEmail(email); 
		  lp.enterValueInPwd(pwd);
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		  lp.clickLoginButton();
		  test.log(LogStatus.INFO, "User is logged in");
		
		  JeweleryPage jew=new JeweleryPage(driver);
		  Wp.clickJeweleryLink();
		  jew.scrollto(driver);
		  jew.clickBlknWhtDiamond();
		  jew.valueenterQty("10");
		  jew.clickonCart();
		  Wp.clickCartLink();
		  test.log(LogStatus.INFO, "User is able to see the product");
	}
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Login");
		return testdata;
}
}
