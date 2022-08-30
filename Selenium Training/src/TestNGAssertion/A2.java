package TestNGAssertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A2 {
	
	//soft assert=>Non Static in nature=>Soft Assert builtin class
	
	@Test
	
public void t1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Idhaz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(driver.getTitle(),"yahoo");//Google, Yahoo//fail
		
		s.assertNotEquals(driver.getTitle(), "yahoo");//pass
				
	    WebElement ele = driver.findElementByLinkText("Privacy");
			
	    s.assertTrue(ele.isDisplayed());//pass
			
	    s.assertFalse(ele.isSelected());//pass
	    
		driver.quit();
		
		//assertAll()->invoke
		
		s.assertAll();//it won't change output of the code,only the status will change

}
}
