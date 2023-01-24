package smartBearTestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass1;
import GenericLibraries.BasePage;

public class Tc_Books_002 extends BaseClass1 {
	@Test
	public void clickonBestSellers()  {
		BasePage b2=new BasePage(driver);
		b2.getBestsellerpge().click();
		Reporter.log("clicked",true);
			
			
		}
		
	}




