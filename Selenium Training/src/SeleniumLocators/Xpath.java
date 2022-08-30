package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Idhaz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver browser=new ChromeDriver();
		browser.get("http://www.mycontactform.com");
		
		//id=user
		browser.findElementByXPath("//*[@id=\"user\"]").sendKeys("Priyatharshni");
		browser.findElementByXPath("//*[@id=\"pass\"]").sendKeys("1234567890");
		browser.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/div/input").click();
		
		Thread.sleep(3000);
		browser.quit();
	}

}
