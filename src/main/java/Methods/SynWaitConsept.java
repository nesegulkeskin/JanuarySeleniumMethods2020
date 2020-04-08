package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class SynWaitConsept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		//This methods tells web driver to wait if the element is not available immedtiately  and
		//(Bu yöntemler web sürücüsüne öğe hemen kullanılamıyorsa beklemesini)
		
		//WebDriver waits till the element is visible.(Webdriver oge gorulene kadar bekler.)
		// in specified time. it will work. (Belirtilen zamanda calisacak)
		// if not it throws an exception like NoSuchElementException
		
		//implicitly Way
		//Implicitly work with WebElement
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Impicitly wait will applied an any element.
		//(Beklenmedik bir şekilde herhangi bir eleman uygulanır.)
		//You can only apply to webElement other than does not work
		//Yalnızca çalışmayan webElement uygulamasına başvurabilirsiniz.
		//in the particular time (15 yerine 3 yapinca) icinde Implicitly WebElement i bulamaz ise "NoSuchElement" exception hatasi aliriz.
		//How to solve "NoSuchElement" exceptiona
		driver.get("https://app.hubspot.com/login");
			
		//static wait
		// it is used to slown down element or threads
		//Thread.sleep(5000); //driver.manager yani implicitly methodunu yoruma alip,
		//thread.sleep methodunu yorumdan cikartunca 
		//output=Title :HubSpot Login oldu.
		
		
		//Bu method getTitle dan onceye konunca output"HubSpot Login" oldu.
		//output login olarak verdi cnuku
		//we will wait 5 secopnds
		//Theard.Sleep not part of selenium.
		//it belons to java.
		//5000 seconds is particular time.
		
		//Imlicitly wait  does not work in this case
		//(Bu durumda açıkça bekle çalışmıyor.)
		//because Title is not WebElement
		//implicitly wait global wait
		System.out.println(("Title :") + driver.getTitle());
		
		//output=Checking browser
		//why? because it needs WAIT
		
		driver.findElement(By.id("username")).sendKeys("ilhan@gmail.com");
		// output = yine Checking Browser verdi
		
		
		
		
	}

}
