package SeleniumLocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class linktextPartiallinktext {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Idhaz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver browser=new ChromeDriver();
		browser.get("http://www.facebook.com");
		
		//Linktext :searching by complete word/group of words, when itis clicked new URL will open
		//No need for code inspection
		
		//browser.findElementByLinkText("Forgotten password?").click();
		
		//partialLinkText
		browser.findElementByPartialLinkText("password?").click();
		Thread.sleep(3000);
		
		browser.quit();
	}

}
