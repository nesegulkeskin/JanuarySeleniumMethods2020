package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	// Set property
	// Find your driver path	
		
	System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
	// Set up browers
		
	WebDriver driver=new ChromeDriver();
	
	// launch driver
	
	driver.get("https://siliconelabs.com");
	
	// get title	
		
	String title=driver.getTitle();	// return string value
	System.out.println(title);	
	
	// validation -- verify
	if (title.equals("Homepage - SiliconeLabs")) {
	System.out.println("correct title");	
	}
	else {
	System.out.println("in-correct title");	
	}
	
	System.out.println(driver.getCurrentUrl());// to get current url from webpage 
											//outputu:https://siliconelabs.com
											// same WebDriver driver=new ChromeDriver();	
	//System.out.println(driver.getPageSource()); // to get page source
	
	Thread.sleep(30000);// 3 seconds // to slow down your tests
	
	// close the browser
	
	driver.quit();//same
	//driver.close();//same
	
	}

}
