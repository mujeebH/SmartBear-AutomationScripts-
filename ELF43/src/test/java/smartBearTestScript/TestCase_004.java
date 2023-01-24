package smartBearTestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass1;
import GenericLibraries.BasePage;

public class TestCase_004 extends BaseClass1 {
	@Test
	public void getCookandenjoyElmnt() {
		BasePage b1=new BasePage(driver);
		b1.getCookandenjoyElmnt().click();
		Reporter.log("clicked",true);

}
}
