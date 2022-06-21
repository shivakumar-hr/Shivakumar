package test_Scripts;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.RegisterPage;
import pom_scripts.WelcomePage;

public class TScript_01 extends Base_Test {
	
	@Test(dataProvider = "testdata")
	public void Tc_01(String fname,String lname,String email,String pwd){
		WelcomePage welcome=new WelcomePage(driver);
		welcome.clickRegister();
		RegisterPage reg=new RegisterPage(driver);
		reg.clickMradiobtn();
		reg.sendvalueFnTxtfield(fname);
		reg.sendvalueLnTxtfield(lname);
		reg.sendvalueEmailTxtfield(email);
		reg.sendvaluePwdTxtfield(pwd);
		reg.sendvalueCpwTxtfield(pwd);
		reg.clickRegisterbtn();
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		test.log(LogStatus.INFO, "User Registered Sucessfully");
	}
	
	
	
	
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Register");
		return testdata;
	}

}
