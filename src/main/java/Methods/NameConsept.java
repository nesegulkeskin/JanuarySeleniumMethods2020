package Methods;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameConsept {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/login");
		Thread.sleep(3000);
		
		//First Usage
		//WebElement userElement=driver.findElement(By.name("username"));
		//userElement.sendKeys("ilhan@gmail.com");
		
		//Second Usage
		//driver.findElement(By.name("username")).sendKeys("bob@gmail.com");
		
		//Third Usage
		
		//By username=By.name("username");
		//WebElement userElement=driver.findElement(username);
		//userElement.sendKeys("ilhan@hot.mail");
		
		
		//Element Util
		
		By username=By.id("username");
		ElementUtil.geElement(driver, username).sendKeys("Last@gmail.com");
		
		
		
	}

}
