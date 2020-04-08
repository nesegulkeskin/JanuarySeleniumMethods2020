package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAllTheLinks {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		
		
		//Size
		System.out.println("Total available links are : " + linklist.size());
		
		// Print out all available links
		
		for (int i = 0; i<linklist.size(); i++) {
			String text = linklist.get(i).getText();
			System.out.println(text);
		
			
		linklist.get(i).click();
		
		//Thread.sleep(2000);
		
		driver.navigate().back();
		
		// bu sekilde "staleelementreferenceexception" hatasi veriyor.	
		// hatta araya thread.sleep i de dahil etmeme ragmen ayni hatayi veriyor, neden?
		// maybe i can put second thread.sleep
		
		
		//Although second Thread.sleep, it gives exception error
		//How can i solve this problem?
		
		
		// interview Question
		// cevap icin RefreshPage classi olusturuldu.
		
		
		// Bu sorunu cozumu de inr=terview sorusuymus
		//solve = linklisti asagidaki sekilde tekrar yazarak
		
		linklist= driver.findElements(By.tagName("a"));
		
		
		
		}
		
		
	}

}
