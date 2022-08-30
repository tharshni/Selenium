package SeleniumWindow;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Idhaz\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver browser=new ChromeDriver();
	browser.get("http://www.mycontactform.com");
	
	//browser.executeScript(, args)
	
}

}
