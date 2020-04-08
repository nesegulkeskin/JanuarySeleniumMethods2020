package Methods;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept { 
	
	//How to handle findElemnts

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	//driver.get("https://amazon.com");
	
	// all links on HTML start a tag. (Yani bu sekilde "a href="https....")
	//link start "div class" in altinda  "a href="https...."
	//for that reason, I can use "tag name" in my project.
	// Hpw can I do that?
	
	List<WebElement> linklist= driver.findElements(By.tagName("a"));
	
	
	
	// a means = I say to webpage or locator select all available links from the webpage
	// it means = end of the project I gonna select all available links from the webpage using the a tag.
	
	// I can store all available links inside the list web element
	
	//Size
	System.out.println("Total available links are : " + linklist.size());
	
	// Print out all available links
	
	for (int i = 0; i < linklist.size(); i++) {
		String text = linklist.get(i).getText();
		System.out.println(text);
		
		// QUESTION 1 (Bosluklari nasil silebilirim. Cevap = asagidaki if kodu ile)
		
		// How to Ignore empty link ? = important question = show me all available link, how can i do that?
		// syso (text) i yorum icine alinacak.
		
		//if (!text.isEmpty()) { //  ! isaretini unutma
		//	System.out.println(text);
		//}
		
		//QUESTION 2 (Consoldaki linkleri nasil tiklayabilirim
		// How can I click on concole

		if (text.equals("Forgot Password?")) {
			linklist.get(i).click();
			break; // if you dont break, you will see other passwords
		}
		
		
	}
	
	
	
	
	
	

	}

}
