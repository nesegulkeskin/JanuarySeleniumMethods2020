package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCrmTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com");
		driver.manage().window().maximize();
		
		//System.out.println(driver.getTitle());
		
		//profesinal usage get title
		
		//String title=JavaScriptUtil.getTitleByJS(driver);
		//System.out.println(title);
		
		
		//driver.get("https://app.hubspot.com/login");
		//Thread.sleep(5000);
		
		//WebElement SignUp=driver.findElement(By.linkText("Sign up"));
		
		//JavaScriptUtil.clickElementByJS(SignUp, driver);
		
		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		//JavaScriptUtil.generateAlert(driver, "This is Javascript alert");
		
		//JavaScriptUtil.drawBorder(SignUp, driver);
		
		//JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "ilhan@gmail.com");
		
		//String browserValue=JavaScriptUtil.getBrowserInfo(driver);//it retuns syring so syso to print
		//System.out.println(browserValue);
		
		//System.out.println(JavaScriptUtil.getPageInnerText(driver));//it returns String
		
		//WebElement email=driver.findElement(By.id("username"));
		//WebElement password=driver.findElement(By.id("password"));
		//WebElement LoginButton=driver.findElement(By.id("loginBtn"));
		
		//JavaScriptUtil.flash(email, driver);
		//email.sendKeys("ilhan@gmail.com");
		
		//JavaScriptUtil.flash(password, driver);
		//password.sendKeys("1223Test");
		
		//JavaScriptUtil.flash(LoginButton, driver);
		//LoginButton.click();
		
		JavaScriptUtil.scrollPageDown(driver);//go down page asgi inip logoyu gosteriyor
		//Bu method icin https://classic.crmpro.com bu siteyi kullniyoruz.
		
		
		
	}

}
