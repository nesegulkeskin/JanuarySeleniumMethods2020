package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardConsept {

	// google da sol ust kosede yer alan <-- isareti --> ya da geri isareti selenium degildir.
	// Bu isaretler it belongs to browser.
	// we can not directly this parts.
	
	public static void main(String[] args) throws InterruptedException {
		
		// Set property
		// Find your driver path	
			
		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
			
		// Set up browers
			
		WebDriver driver=new ChromeDriver();
		
		// launch driver
		
		driver.get("https://www.google.com");
		Thread.sleep(20000);
		
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(20000);
		
		driver.navigate().back();//google
		Thread.sleep(20000);
		
		driver.navigate().forward();//amazon
		Thread.sleep(20000);
		
		driver.navigate().back();//google
		Thread.sleep(20000);
		driver.navigate().refresh();
		
		//Second way
		
		//Navigation navigation=driver.navigate();
		//navigation.back();
		//navigation.forward();
		//navigation.refresh();
		
		driver.quit();
		
		// interview get & navigate - difference
		
		// get navigates to a webpage.
		// webDriver will wait until the page has fully loaaded before
		// retirnig control the script
		
		// What is the navigate?
		// navigate == naviates a webpage
		// navigate interface provides to ability move backwords, forwards, ferresh
		// navigate not wait until the the page has fully loaded
		
		
	}

}
