package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.ComputersPage;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class TScript_18 extends Base_Test{

	@Test(dataProvider="testdata")
	public void TestCase18(String Email, String pwd){
		
		WelcomePage wel=new WelcomePage(driver);
		wel.clickLogin();
		
		LoginPage log=new LoginPage(driver);
		log.enterValueInEmail(Email);
		log.enterValueInPwd(pwd);
		log.clickLoginButton();
		
		ComputersPage comp=new ComputersPage(driver);
		comp.clickOnComputers();
		comp.clickOnDesktops();
		comp.clickOnBuildYourOwnExpensiveComputer();
		comp.scrolltoCart(driver);
		comp.clickOnBuild_your_own_expensive_computer();
		comp.ShoppingCart();
	}
	
	@DataProvider(name="testdata")
	public Object[][] getTestData() throws IOException{
		Object[][] testdata=ReadExcel.getMultipleData("Login");
		return testdata;
	}
}
