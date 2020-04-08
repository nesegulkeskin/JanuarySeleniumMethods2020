package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RefreshPage {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement login= driver.findElement(By.id("login1"));
		//login.sendKeys("ilhan@gmail.com");
		
		driver.navigate().refresh();
		//why Iam using refresh
		//because an other keys, what hapened first button a, test will go to the homepage
		//after that test will come back ariginal, this is a refreshr -->re-open it
		
		login=driver.findElement(By.id("login1"));
		login.sendKeys("ilhan@gmail.com");
		
		//the problem is same, why
		//in this case will go to the 
		
		
	}

}
