package Methods;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper;

public class LaunchBrowser {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browser="chrome"; // burasi ff olarak da degisebilir ya da digerleri.Ancak safari ve digerleri webdrivermanager i desteklemiyor.
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if (browser.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if (browser.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		
		else if (browser.equals("opera")) {
			WebDriverManager.operadriver().setup();
			driver=new OperaDriver();
		}
		else {
			System.out.println("no defined browser");
		}
		
		driver.get("http://www.google.com");
		
	}

}
