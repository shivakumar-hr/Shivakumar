package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.ApparelNShoesPage;
import pom_scripts.LoginPage;
import pom_scripts.ShoppingCartPage;
import pom_scripts.WelcomePage;

public class Tscript_23 extends Base_Test{
	@Test(dataProvider="testdata")
	public void TestData20(String Email, String pwd){
		
		WelcomePage wel=new WelcomePage(driver);
		wel.clickLogin();
		
		LoginPage log=new LoginPage(driver);
		log.enterValueInEmail(Email);
		log.enterValueInPwd(pwd);
		log.clickLoginButton();
		wel.clickApparelnShoesLink();
		ApparelNShoesPage apparel=new ApparelNShoesPage(driver);
		apparel.clickaddtocartGolfBelt();
		apparel.clickClose();
		wel.clickCartLink();
		ShoppingCartPage shop=new ShoppingCartPage(driver);
		shop.sendvalueProductoneQty("2");
		shop.clickUpdateshopBtn();
		shop.clicktermschkbox();
		shop.clickcheckoutbtn();
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		test.log(LogStatus.INFO, "User Checkout successfully");
	}
	@DataProvider(name="testdata")
	public Object[][] getTestData() throws IOException{
		Object[][] testdata=ReadExcel.getMultipleData("Login");
		return testdata;
	}

}
