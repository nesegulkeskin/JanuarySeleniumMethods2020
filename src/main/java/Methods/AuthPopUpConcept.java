package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Interview Question
		
		
		// https://the-internet.herokuapp.com/basic_auth
		//Browser a bagli
		//Alertten farki nedir?
		//interview Question
		//Direkt alertle hsndling edemiyoruz
		//securty nedeniyle bunu kullaniyoruz.
		//neden ayri cunku handle edilme yontemi farki
		
		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		//First way
		//Handle edilme yontemi asgidaki gibidir.
		//Answer = //https://admin:adminadmin:admin@the-internet.herokuapp.com/basic_auth
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	
		
		//Second Way
		String username="admin";
		String password="admin";
				
				
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
				
		
		
		

	}

}
