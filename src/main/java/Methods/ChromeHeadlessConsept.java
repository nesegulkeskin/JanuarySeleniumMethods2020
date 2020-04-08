package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessConsept {

	public static void main(String[] args) {
		
		//Browser doesnt work in the headlessmod
		//Test is working on the backround.
		//This is called headless in the selenium.
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(co);// () sonradan co yi ekledik
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
