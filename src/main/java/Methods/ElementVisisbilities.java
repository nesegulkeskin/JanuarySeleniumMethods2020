package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVisisbilities {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");
		
		//isdisplayed-isenabled-isselected = Boolean
		//WebElement
		
		WebElement submitButton=driver.findElement(By.id("submitButton"));
		
		System.out.println("Before submit button is enabled");
		System.out.println(submitButton.isDisplayed());//goruntuleme=true
		System.out.println(submitButton.isEnabled());//etkinlestirme = false
		
		System.out.println("Line 23 : " + driver.findElement(By.name("agreeTerms")).isSelected());//false
		//I agree... tiklanilacak yerle ilgili
		
		driver.findElement(By.name("agreeTerms")).click();//selected checboxs
		
		System.out.println("Line 27 : " + driver.findElement(By.name("agreeTerms")).isSelected());//true,after click
		
		System.out.println("After submit button is enabled");
		System.out.println(submitButton.isDisplayed());
		System.out.println(submitButton.isEnabled());
		
		
		
		
		
	}

}
