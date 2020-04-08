package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkConsept {

	public static void main(String[] args) throws InterruptedException {
	
		//link concesp consist of two sign up
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://learnsdet.com/");
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		By SignUp=By.partialLinkText("Sign");
		//By about=By.linkText("About");//profesional usage
		ElementUtil.geElement(driver, SignUp).click();
		
		//Partial link test
		// it is not guarantee to work always
		// so it didn't work 
	}

}
