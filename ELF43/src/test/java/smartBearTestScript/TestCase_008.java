package smartBearTestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass1;
import GenericLibraries.BasePage;

public class TestCase_008 extends BaseClass1 {
	@Test
	public void clickOnWishList() throws InterruptedException {
		BasePage b1=new BasePage(driver);
		b1.getWish1().click();
		b1.getView().click();
		Reporter.log("succesfully clicked", true);
	}
		
	}


