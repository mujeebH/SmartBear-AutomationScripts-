package smartBearTestScript;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass1;
import GenericLibraries.BasePage;

public class Testcase_003 extends BaseClass1 {
	@Test
	public void ToClickOnBooksPage() {
		String expectedTitle="Shop. Books";
		BasePage b3=new BasePage(driver);
		b3.getBookspge().click();
		Reporter.log("successfully clicked"+driver.getTitle());
		
		assertEquals(driver.getTitle(), expectedTitle, "user is not able to click on books button");
		
	}

}
