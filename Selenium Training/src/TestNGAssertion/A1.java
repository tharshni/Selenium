package TestNGAssertion;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListener.C1.class)

public class A1 {
	 @Test
	
	public void t1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Idhaz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		  //Assert.assertEquals(driver.getTitle(),"yahoo");//Google, Yahoo
		
		    Assert.assertNotEquals(driver.getTitle(), "yahoo");//pass
				
			WebElement ele = driver.findElementByLinkText("Privacy");
			Assert.assertTrue(ele.isDisplayed());//pass
			Assert.assertFalse(ele.isSelected());//pass
			driver.quit();

	}
	

}
