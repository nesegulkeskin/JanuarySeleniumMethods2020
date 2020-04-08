package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class AlertHandling2 {
	
	// Creat generic method 
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();//Locator
		
		Thread.sleep(4000);	
		
		//getAlertText();
		// verify icin if i kullaniyorsun
		
		if (ElementUtil.getAlertText(driver).equals("Please enter a valid user name")) {
			System.out.println("Correct message");
		}
		else {
			System.out.println("in-correct message");
		}
		
		driver.quit();
		
	}

	}

	// Generic method 
	
	// it means that it wiil contain my alert function 
	// I can use this function whatever I want in the my framework
	// Bu işlevi çerçevemde ne istersem kullanabilirim
	
	//public static String getAlertText(){ // static yazdim cunku yukarida field i static yaptim
	//	Alert alert=driver.switchTo().alert();
	//	String text=alert.getText();
	//	System.out.println(text);
	//	alert.accept();
	//	return text;
		
	
	


