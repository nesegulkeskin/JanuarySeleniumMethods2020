package Methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotConcept {

	public static void main(String[] args) throws IOException {
		
	// 1.pom.xml i tikla ve icinde pom.xml i tikla
	// 2.google-maven reposotory tikla - common io tikla-2.6 sec 
	// 3. pom xml icinde yaklasik 30.satira denk geliyor ve dependency arasina gelecek sekilde copy paste yap
	
	//	<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
	//		<dependency>
	//		    <groupId>commons-io</groupId>
	//		    <artifactId>commons-io</artifactId>
	//		    <resimversion>2.6</version>
	//		</dependency>

		
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	
	//driver feature
	
	driver.manage().window().maximize();//will be maximize webpage
	driver.manage().deleteAllCookies();
	
	//I want to do clean test for this i delete all cookies 
	// what is cookies - go to the chrome webpage
	
	driver.get("https://siliconelabs.com/");
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Apache common io (ay-o)
	FileUtils.copyFile(src, new File("/Users/nesekeskin/Desktop/screenshot/resim.png"));
	// save screenshot
	
	
	// we have added all requriment in the our pom xml, dependecy so for that reason can see file(java)
	//if we dont add commons io or apachi you will not see one (yani File secmek istedigimizde goremeyiz, dependecy copy 
	//pastelerini yapmazsak eger.
		

	}

}
