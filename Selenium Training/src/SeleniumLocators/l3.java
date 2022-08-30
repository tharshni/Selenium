package SeleniumLocators;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class l3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Idhaz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver browser=new ChromeDriver();
		browser.get("http://www.facebook.com");
		
		//cannot find single name using tagname
		//images=> img
		//links=> a
		//elements=> div,li,input,select
		//number of images ,links,elements with div, input
		
		List<WebElement>i= browser.findElementsByTagName("img");
		System.out.println("Number of imgs"+i.size());
		
		List<WebElement>i1= browser.findElementsByTagName("a");
		System.out.println("Number of links"+i1.size());
		
		List<WebElement>i2= browser.findElementsByTagName("input");
		System.out.println("Number of elements with input tag"+i2.size());
		
		browser.quit();
	}

}
