package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassNameConsept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);	
		
		//form-control private-form__control login-email 
		
		// form control 1.class
		// private-form  2.class
		// login-email   3.class 
		// it has 3 class.
		// we use last class because we use related my consept.
		
		// how to understand which use class? Hangi sinifi kullanmamiz gerektigini nasoil anlayacagiz.
		// login emaili nasil yazdim? maile gelip inspet dedim sonra class da 
		//"form-control private-form__control login-email" kopyaladim, 
		//findelementi bulurken de login e-maile gelene kadar sildim. 
				
			
		
		//First Usage
		//WebElement element=driver.findElement(By.className("login-email"));
		//element.sendKeys("ilhan@gmail.com");
		
		//Second Usage
		//driver.findElement(By.className("login-email")).sendKeys("bob@gmail.com");
		
		//Third Usage = profesional Usage
		
		By username=By.className("login-email");
		//WebElement element=driver.findElement(username);
		//element.sendKeys("class@gmail.com");
		
		// Element Utill 
		
		ElementUtil.geElement(driver, username).sendKeys("methods@gmail.com");
		
		
	}

}
