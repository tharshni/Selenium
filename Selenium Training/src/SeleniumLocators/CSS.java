package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Idhaz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver browser=new ChromeDriver();
		browser.get("http://www.mycontactform.com");
		
		//css:cascadestyle
		//manual:7 ways
		//shortcut:1 way
		
		//1.tagname and id            Syntax:tagname#id
		//browser.findElementsByCssSelector("input#user").sendKeys("hi");
		
		Thread.sleep(3000);
		browser.quit();
		
	}
}
