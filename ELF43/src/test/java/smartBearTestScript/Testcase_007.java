package smartBearTestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass1;
import GenericLibraries.BasePage;

public class Testcase_007 extends BaseClass1  {
	@Test
	public void clickonCompare() throws InterruptedException {
		BasePage b2=new BasePage(driver);
		b2.getCompare().click();
		Reporter.log("user is able to click on compare page", true);
	}
}
	


