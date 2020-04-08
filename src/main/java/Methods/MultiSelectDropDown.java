package Methods;



import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
	//https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/	
	//Multi Selection Menu	
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	
	driver.findElement(By.id("justAnInputBox")).click();
	
	Thread.sleep(3000);
		
	List<WebElement> dropList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	//Dikkat FindElements i seciyorsun cunku ListWebElement ve comman F ile xpath i yaziyorsun
	
	System.out.println(dropList.size());	
		
	for (int i = 0; i < dropList.size(); i++) {
		String text=dropList.get(i).getText();
		System.out.println(text); //how can ignore for empty 
		
		//Question2
		// Eger try catc i yoruma alirsak, it is working or not?
		//it worked but why use try catch
		// eger is statement choise olani  da yoruma alirsak, what will happen
		// butun null empty hepsini 
		//cevap= it gives Empty or null empty, all avaible links
		
		
		//try-catch in  icindeki "dropList.get(i).click();" methodunu try catch i tamamini
		//yoruma alarak yazdirdigimizda ne oluyor?
		//cevap= choice tamamini tikliyor.
		
		//dropList.get(i).click();
		
		//why are you put try catch blok?
		//dropList.get(i).click(); sadece bu methodu try catch alirsak asagidaki gibi exception hatasi almiyoruz.
		
		//protect code
		
		try {
			dropList.get(i).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			if (!text.isEmpty()) {
				dropList.get(i).click();
			}
			
		} catch (Exception e) {
			
		}
		
		//Question 1
		//Eger if i yoruma alirsak ne olur? it is working or not?
		//Cevap = working with Selected  all empty link, why we stopped the using break
		//we selected only till this case
		
		if (text.equals("choice 6 2 3")) {
			dropList.get(i).click();
			break;
		}
	}	
	Thread.sleep(3000);	
	selectMultipleValues(driver, "choice 3", "choice 6", "choice 1");
	selectMultipleValues(driver, "ALL");//Butun selectleri tikladi
	
	
	//Important
	
	//Yukarida sadece choice de bir tane sectim eger iki tane secmek istersem.
	
	//Question 1
	// i want to select multiple elements, how can i do that?
	//Answer = Asagidaki methodun icindeki parametrenin icndeki String e ... add three dot ekleyerek
	
	//Tek choice icin asagidaki hali ile
	//public static void selectMultipleValues(WebDriver driver, String value)
	
	//Multiple choice icin asagidaki hali ile yani string e ... ekleyerek
	//public static void selectMultipleValues(WebDriver driver, String value)
	
	//What is the three points?
	//... three point is array for that reasan we can use this usage like an array
	// in this point, i wanna write second for loop 
	
	
	}

	//Generic Method
	
	public static void selectMultipleValues(WebDriver driver, String... value){//three ...
		List<WebElement> dropList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++) {
			String text=dropList.get(i).getText();
		
			//second for loop to select multiple ("choice 3, choice 5, choice 4 gibi)
		for (int j = 0; j < value.length; j++) {// array so lenght
			
			
		if (!value[0].equalsIgnoreCase("ALL")) {
			
			
			try {
				if (!text.isEmpty()) {
					if (text.equals(value[j])) {//[j] de second for loop icin
						dropList.get(i).click();
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			}
		else {
			try {
				for (int full = 0; full <dropList.size(); full++) {
					dropList.get(full).click();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		}
		
		}
	
	
	}
}
	



		
		
	




		
		




