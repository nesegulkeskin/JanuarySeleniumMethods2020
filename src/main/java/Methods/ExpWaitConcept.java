package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
		WebDriver driver=new ChromeDriver();	
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		
		//Thread.sleep(5000);//Thread i yoruma alinca"checking browser" cikiyor, 
							// Thread i yorumdan cikartinca exception hatasi veriyor.
							//How to solve  ? Explicitliy methodu ile
		
		//Excpilicitly Wait=Works with WebElement and non-web element
		//it is available WebDriverWait Interface
		//Explicitly wait will be applied non-WebElement and WebElement
		
		//Exp wait=for non web element
		WebDriverWait wait=new WebDriverWait(driver, 15);//if you dont enough time "timeout exception" hatasi veriyor
		//wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		System.out.println("Title : "+driver.getTitle());
		
		//IT WORKS WHY
		//EXPLICITLY WEBELEMENT OR NON-WEBELEMENT, DOESNT MATTER
		
		//IT WROTE 15 SECONDS if it write 5 seconds yine calisir.
		//yani saniyeyi 15 de yazsak 5 de yazsak c alisiyor ve exception hatasi akmiyoruz
		//ama 3 second yazaesak exception hatasi aliyoruz.
		//cunku bu sitede 5 second bekletiyor ve asagisini istemiyor.
		//explicitly and webdriverwait concept are dynamic consept.it can figure out according your test cases in particular time.

		
		//driver.findElement(By.id("username")).sendKeys("Ilhan@gmail.com");
		//for WebElements
		//NoSuchElemet why wait.until.. methodunu yoruma  aldik.
		
		//WebElement email=driver.findElement(By.id("username"));
		//wait.until(ExpectedConditions.visibilityOf(email));
		
		By email=By.id("username");
		//wait.until(ExpectedConditions.presenceOfElementLocated(email));
		//driver.findElement(email).sendKeys("ilhan@gmail.com");
		//getElement methodunu yazdiktan sonra ustteki iki tanimlari yoruma aldik. 
		By password=By.id("password");
		//By LoginBtn=By.id("loginBtn");
		
		getElement(driver, email, 3).sendKeys("ngulkeskin08@gmail.com");
		getElement(driver, password, 1).sendKeys("NGk45419");
		//getElement(driver, LoginBtn, 2).click();
		
		
	}

	//This is generic method
	
	public static WebElement getElement(WebDriver driver, By locator, int timeout){
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element=driver.findElement(locator);
		return element;
	}
	
	
}
