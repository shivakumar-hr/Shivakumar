
package test_Scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.WelcomePage;

public class SampleTest extends Base_Test{
	
	@Test
	public void sample() throws InterruptedException {
//		System.out.println("Hello framework");
		WelcomePage welcome=new WelcomePage(driver);
		welcome.movetoElectronics(driver);
		welcome.clickCellPhonesLink();
		
	
		Thread.sleep(2000);
	}

}
