package Methods;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);	
		
		//First Usage
		
		//WebElement userElement=driver.findElement(By.cssSelector("#username"));
		//userElement.sendKeys("ilhan@gmail.com");
		
		
		//Second Usage
		
		//driver.findElement(By.cssSelector("#username")).sendKeys("bob@gmail.com");
		
		
		//Third Usage
		
		By username = By.cssSelector("#username");
		//WebElement userElement=driver.findElement(username);
		//userElement.sendKeys("ilhan@gmail.com");
		
		//Fourth Usage
		ElementUtil.geElement(driver, username).sendKeys("ilhan@hotmail.com");
		
		//Interevoiew Question-1
		
		// what we need to know css & xpath
		
		// CSS is faster than xpath
		// CSS is more understandable and readable
		// CSS is only forward
		
		//Xpath can traverse (capraz) both forward and bacward, but css is only forward
		//XPath is complex and make hard to read
		
		
		
		// interview Question-2
		
		// Xpath 
		//Absolute Xpath (/) = Single slash / = it starts with root element, contunies all the way to element
											//kök element ile başlar, elemente kadar devam eder.
		
		//Relative Xpath (//) =Starting selection matching anywhere in the document
							//Seçimin belgenin herhangi bir yerinde başlatılması
		
	}

}
