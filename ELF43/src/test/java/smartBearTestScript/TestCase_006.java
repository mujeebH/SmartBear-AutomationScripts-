package smartBearTestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass1;
import GenericLibraries.BasePage;

public class TestCase_006 extends BaseClass1 {
	@Test
	public void clickOnSortByAndSelect() throws InterruptedException {
		BasePage b1=new BasePage(driver);
		b1.getSortBy().click();
		Thread.sleep(1000);
		b1.getFeautured().click();
		Reporter.log("succesfully selected");
	}

}
