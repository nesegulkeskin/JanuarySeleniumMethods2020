package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		WebElement dayElemet=driver.findElement(By.id("day"));
		WebElement monthElement=driver.findElement(By.id("month"));
		WebElement yearElement=driver.findElement(By.id("year"));
		
		Select select1=new Select(dayElemet);
		System.out.println(select1.isMultiple());//toString methodu cagirabiliyorum ama outout cikarmiyor cunku listte kullanmam gerekiyormus.
		//output= false because facebook is false
		
		//What isMultible drodown ?
		
		//A dropdown list that allows multiple selections

		/* w3 internet sitesi goruntusu
		 * 
		 * This is a Multiple dropdown menu
		 * <> iki diamod arasi olunca multiple dropdown oluyor.
		 * <option value="volvo"> Bu ornekteki gibi
		 * 
		select multiple>
		  <option value="volvo">Volvo</option>
		  <option value="saab">Saab</option>
		  <option value="opel">Opel</option>
		  <option value="audi">Audi</option>
		</select>
		*/
		
		//The mutiple attirubte is a boolean attiribute.
		
		
		
		
		
	}

}
