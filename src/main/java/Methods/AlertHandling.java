package Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//https://mail.rediff.com/cgi-bin/login.cgi
		
		// Set property
		// Find your driver path	
			
		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
			
		// Set up browers
			
		WebDriver driver=new ChromeDriver();
		
		// launch driver
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// How can I interecat web page?
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		Alert alert=driver.switchTo().alert(); // you hae to write this one
											 //	you need the memory
		
		
		
		String text=alert.getText();// title vs. correct or incorrect - return string value
		System.out.println(text);
		
		// not finished - i need to verify
		
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct message");
		}
		else {
			System.out.println("in-correct message");
		}
		
		
		//alert.accept();// my alert// accept means ok
		alert.dismiss(); // it means cancel it
		
		driver.quit();
		
		
		
		
		
	}

}
