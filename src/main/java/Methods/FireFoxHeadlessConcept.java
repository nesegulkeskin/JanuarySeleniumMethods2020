package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxHeadlessConcept {

	public static void main(String[] args) {
	

		//Whu we use this concept (heasdless mode)?
		//Sometimes jenkins, sometimes linux machine
		//You can not download the browser.
		//In this case you need to use headless mode
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fOptions=new FirefoxOptions();
		fOptions.addArguments("--headless");
		
		WebDriver driver=new FirefoxDriver(fOptions);//() parantez icine objeyi yaziyoruz.
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		
	}

}
