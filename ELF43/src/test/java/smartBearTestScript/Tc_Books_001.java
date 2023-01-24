package smartBearTestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass1;
import GenericLibraries.BasePage;

public class Tc_Books_001 extends BaseClass1 {
	@Test
	public void ToclickonSortBy() {
		BasePage b1 = new GenericLibraries.BasePage(driver);
		b1.getSortBy().click();
		Reporter.log("clicked", true);
	}

}
