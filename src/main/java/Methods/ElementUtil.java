package Methods;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.net.URL;


import sun.security.action.GetBooleanAction;

public class ElementUtil {
	
// common methods (gettitle, clickon, submit, sendkeys ..)
	
	
	public static final int DEFAULT_EXP_WAIT =15;
	
	
	
	/**
	 * This Method is used to Handle alert
	 * @param driver
	 * @return
	 */

	public static String getAlertText(WebDriver driver){ // static yazdim cunku yukarida field i static yaptim
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	
	}	
	
	// This method is used to get title
	
	public static String getPageTitle(WebDriver driver){
		return driver.getTitle();
		
	}
	
	// URL method 
	
	public static void launchURL(WebDriver driver, String url){
			driver.get(url);

	}
	
	// launchBrowser method
	
	public static WebDriver launchBrowser(WebDriver driver, String browserName){
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
			driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/nesekeskin/Documents/DRIVER/geckodriver");
			driver=new FirefoxDriver();
		}
		
		else{
			System.out.println("BrowserName is not correct : " + browserName);
		}
		return driver;
	}
	
	
	
	// Click method / driver - locator
	
	public static void clickOn(WebDriver driver,By locator){
		driver.findElement(locator).click();
	}
	
	/**
	 * Get Element} method
	 * @param driver
	 * @param locator
	 * @return
	 */
	
	public static WebElement geElement(WebDriver driver, By locator){
		WebElement element=driver.findElement(locator);
		return element;
	
	}
	
	
	
	
	// Close browser /driver
	
	public static void closeBrowser(WebDriver driver){
		driver.quit();

}
	
}	
	
	
	