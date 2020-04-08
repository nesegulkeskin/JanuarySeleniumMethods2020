package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathConsept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//First
		
		//WebElement userElement=driver.findElement(By.xpath("//input[@id='username']"));
		//userElement.sendKeys("bob@gmail.com");
		
		//WebElement userpass=driver.findElement(By.xpath("//input[@id='password']"));
		//userpass.sendKeys("123@Test");
		
		//Element Util
		
		By username=By.xpath("//input[@id='username']");
		ElementUtil.geElement(driver, username).sendKeys("ilhan@gmail.com");
		
	}

}
