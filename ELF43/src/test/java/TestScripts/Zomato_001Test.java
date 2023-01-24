package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zomato_001Test{
	@Test
	public void zomato() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
	}

}
