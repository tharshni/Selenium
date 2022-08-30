package SeleniumIntro;



import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro1 {
	
	//Selenium is an automation framework-To automate website and not windows based applications
	//supports 14 languages like java ,C# Python,..etc and different supports in all browsers
	//Jar files-Java built in classes,methods
	//why drivers?-browser can not communicate selenium commands straightly,it accepts commands via driver
	//Right click project->at the bottom Properties->Click 'Java build path'->Libraries or (for few class path/module path)->click class path,On Right side Add External JARs and add the downloaded JARs
	
	//Step1:configuring the chrome driver
	//Step2:creating an object for chromedriver class
	//Step3:visiting the website
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Idhaz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver URL=new ChromeDriver();
		
		URL.get("http://www.google.com");
	    //title
		System.out.println(URL.getTitle());
		
		//URL
		System.out.println(URL.getCurrentUrl());
		
		//set methods
		
		//size:height and width of the window
		//dimensiopn
		Dimension S =URL.manage().window().getSize();
		System.out.println("Height is" +S.getHeight());
		System.out.println("Width is" +S.getWidth());
		
		//position :x and y value of the window
		//point
		
		 Point pt= URL.manage().window().getPosition();
		 System.out.println("X value is" +pt.getX());
		 System.out.println("Y value is" +pt.getY());
		 
		 //getting browser capabilites
		 Capabilities c=  URL.getCapabilities();
		 System.out.println("Brwoser Name is:" +c.getBrowserName());
		 System.out.println("Browser version is:" +c.getVersion());
		 System.out.println("Platform is:" +c.getPlatform());
		
		
		
		URL.quit();
		
		
		//max the window
		//URL.manage().window().maximize();
		
		//full screen
		//URL.manage().window().fullscreen();
		
		//refresh
		//URL.navigate().refresh();		
		
		//holding page for few seconds
		//Thread.sleep(4000);
		
		//close browser
		//URL.close();
		
	}

}
