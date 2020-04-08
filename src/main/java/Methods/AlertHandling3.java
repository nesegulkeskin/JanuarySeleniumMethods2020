package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertHandling3 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		By goBtn = By.name("proceed");
		
		driver=ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		System.out.println(ElementUtil.getPageTitle(driver));
		ElementUtil.clickOn(driver, goBtn);
		
		Thread.sleep(4000);
		
		String text = ElementUtil.getAlertText(driver);
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct message");
		}
		else{
			System.out.println("incorrect message");
		}
		
		ElementUtil.closeBrowser(driver);
		
		
		
	}

}
