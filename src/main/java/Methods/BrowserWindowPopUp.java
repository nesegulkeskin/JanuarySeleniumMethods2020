package Methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) {
		
	//This code call Window Handling
	//it doesnt web application
		
	WebDriverManager.chromedriver().setup();	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.popuptest.com/goodpopups.html");
	
	driver.findElement(By.linkText("Good PopUp #3")).click();
		
	Set<String> handles=driver.getWindowHandles();
	Iterator<String> itr=handles.iterator();//How can we get uniq value?
	
	String parentWindowId=itr.next();
	System.out.println("ParentWindows is : " + parentWindowId);//ParentWindows=First Window
	
	String childWindowId=itr.next();
	System.out.println("ChildWindowId is : " + childWindowId);//ChildWindow= Second Window
	
	//If I want to swtich child Browser?
	
	driver.switchTo().window(childWindowId);
	System.out.println("Child window title is : " + driver.getTitle());
	driver.close();
	
	//I need to come back to parentWindow
	
	driver.switchTo().window(parentWindowId);
	System.out.println("Parent window title is : " + driver.getTitle());

	
	//SET = GENEL BILDI VIDEODAKI
	//return set
	//Set provides unordedred collection of uniq objects.
	//It doesnt allowed duplication.
	//set provides uniq value but unidexted
	
	//for loop u kullanamayiz cunku set collectinlarda iterator i kullanmamiz gerekiyor.
	//because next function inside iterator

	
	
	

	}

}
