package smartBearTestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass1;
import GenericLibraries.BasePage;

public class TestCase_005 extends BaseClass1{
	@Test
	public void ToSelectpriceButton() {
		BasePage b1=new BasePage(driver);
		b1.getPrice10().click();
		Reporter.log("clicked");
	}

}
