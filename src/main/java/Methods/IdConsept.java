package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdConsept {

	public static void main(String[] args) throws InterruptedException {
		
		//First Way
		//System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
		
		//Second Way
		// WebDriverManager===Boni Garcia 
		WebDriverManager.chromedriver().setup();
		
		
		// Set up browers
			
		WebDriver driver=new ChromeDriver();
		
		// launch driver
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		// ID is always is uniq
		// how can defined id
		
		
		//First Usage type
		
		//WebElement userElement=driver.findElement(By.id("username"));
		//userElement.sendKeys("boblerry2@gmail.com");
		
		//WebElement userPassword=driver.findElement(By.id("password"));
		//userPassword.sendKeys("123@Test");
		
		//WebElement clickBtn=driver.findElement(By.id("LoginBtn"));
		//clickBtn.click();
		
		
		//Second Usage
		
		//driver.findElement(By.id("username")).sendKeys("john@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("123@Test");
		//driver.findElement(By.id("LoginBtn")).click();
		
		//Third Usage
		
		//By username=By.id("username");
		//WebElement userElement=driver.findElement(username);//Profesional Usage
		//userElement.sendKeys("Ilhan@gmail.com");
		
		
		
		// Fourth Usage
		// we will call it, not directly
		
		By username=By.id("username");
		ElementUtil.geElement(driver, username).sendKeys("sample@gmail.com");
		
		
	}

}
