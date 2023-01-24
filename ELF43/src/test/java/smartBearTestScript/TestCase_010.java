package smartBearTestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass1;
import GenericLibraries.BasePage;

public class TestCase_010  extends BaseClass1 {
	@Test
	public void clickOnWishList() throws InterruptedException {
		BasePage b1=new BasePage(driver);
		b1.getForums().click();
		Reporter.log("user is able to click on forums",true);

}
}
