package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlUnitDriverHeadless {

	public static void main(String[] args) {
		
		//interview Question about headless concept
		//Answer= 
		//Firstly chrome options provides headless for bthat reosan we wiil use addArguments method
		//olsa if you install htmlunitdriver dependencies in you pom xml file olsa you can use htmlunitDriver
		//because webdriver provdes htmlunit driver.
		//Ypu can use heasdless consept
		
		//Maven Repository den HtmlUnit Driver diye aratinca selenium olanini seciceksin.
		
		/*
			 
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/htmlunit-driver -->
			<dependency>
			    <groupId>org.seleniumhq.selenium</groupId>
			    <artifactId>htmlunit-driver</artifactId>
			    <version>2.36.0</version>
			</dependency>
		
		*/
		
		//if you want to firefoxdriver
		
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());//output with chromedriver and firefoxdriver 
		
		
		
		
		
		

	}

}
