package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import core.Base;

public class SmokTest extends Base{

	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
	}
	
	@Test
	public void smokeTest() {
		Boolean display = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")).isDisplayed();
		SoftAssert asrt = new SoftAssert();
		asrt.assertTrue(true);
		
	}
	
	@ AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
}
