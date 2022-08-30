package SeleniumWindow;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class size {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Idhaz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver browser=new ChromeDriver();
		browser.get("http://www.google.com");
		
		
		
		//Resizing of Window size-(Dimension change)
		//size==>dimension(In dimension only default class is available)
		//create an object for dimension class
		//pass desired height and width in it
		//apply it on the window
		
		Dimension d=new Dimension(500, 500);
		browser.manage().window().setSize(d);
		 
		 
		 //Repositioning Window Size-moving window from one place to another
		 Point pt=new Point(500, 500);
				 browser.manage().window().setPosition(pt);
				 Thread.sleep(3000);
		 
		 browser.quit();
	}

}
