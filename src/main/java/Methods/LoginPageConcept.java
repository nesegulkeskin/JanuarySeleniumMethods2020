package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPageConcept {
	
	public static WebDriver driver; // Login yaparken burayi unutma
	
	static By email=By.id("username"); // mail kismina inspect yaptim, id=username sectim
	
	static By password=By.xpath("//input[@id='password']"); 
	// cunku burada xpath diye dusundum ve username i secip inspect dedikten sonra 
	// commanf F ile "//input[@id='password']" bunu yazdiktan sonra copy paste yaptim.
	
	static By loginButton=By.cssSelector("#loginBtn"); //Xpath de acikladigim sekilde yaptim.
														//Comman F ile (#loginBtn)
	
	public static void main(String[] args) throws InterruptedException {
		
	// I need to choose browser
		
		driver=ElementUtil.launchBrowser(driver, "firefox");
		ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		ElementUtil.geElement(driver, email).sendKeys("ilhan@gmail.com");
		ElementUtil.geElement(driver, password).sendKeys("123@Test");
		ElementUtil.geElement(driver, loginButton).click();
		
		
	
	}

}
