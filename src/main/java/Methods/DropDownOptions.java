package Methods;

import java.time.Month;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class DropDownOptions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		//All optionas single parameter
		//How many options there are available in the Select Tag
		
		
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		
		ArrayList<String> dayOptions=getAllOptions(driver, day);//Arraylist yaptiktan sotra basina arraylist yazdik
		System.out.println("Total days are : " +dayOptions.size());
		
		if (dayOptions.size()==32) {
			System.out.println("Total number of days are correct");
		}
		
		else {
			System.out.println("Total number of days are incorrect");
		}
		
		//Print
		
		for (int i = 0; i < dayOptions.size(); i++) {
			String text=dayOptions.get(i);
			System.out.println(text);
		}
		
		//it is validation(onaylama)
		
		ArrayList<String> monthOptions= getAllOptions(driver, month);
		
		
		ArrayList<String> yearOptions=getAllOptions(driver, year);
		
		
		
//		WebElement day=driver.findElement(By.id("day"));
//		WebElement manth=driver.findElement(By.id("month"));
//		WebElement year=driver.findElement(By.id("year"));
//		
//		Select select1=new Select(day);//We select "day". 
//										//because we want to count .
//										//How many days are availabe in the select tag
//		Select select2=new Select(manth);
//		
		//DAYS...
		
		//How Can I do that?
		//java.util.List<WebElement> dayOptions=select1.getOptions();
		//System.out.println(dayOptions.size());
		// output=32... but day is 0.index so total 32 
		
		
		// All avaible to print
		
//		for (int i = 0; i < dayOptions.size(); i++) {
//			String text=dayOptions.get(i).getText();
//			System.out.println(text);
//		}
		
		//MONTH...
		
		//java.util.List<WebElement> monthOptions=select2.getOptions();
		//System.out.println(monthOptions.size());
		// output=13... but MONTH is 0.index so total 13 
				
				
//		for (int i = 0; i < monthOptions.size(); i++) {
//					String text=monthOptions.get(i).getText();
//					System.out.println(text);
//				}
	}
	
	
		//Get AllOoption from html
	
			public static ArrayList<String> getAllOptions(WebDriver driver, By locator){
			//return optionlist i ekledikten sonra void i sildik ve ARRAYLIST YAZDIK	
			ArrayList<String> optionList=new ArrayList<String>();//bunu sonra ekledik
			
			WebElement element=getElement(driver, locator);
			Select select=new Select(element);
			
			java.util.List<WebElement> dropDownOptions=select.getOptions();
			//System.out.println(dropDownOptions.size());
			
			for (int i = 0; i < dropDownOptions.size(); i++) {
				String text=dropDownOptions.get(i).getText();
				//System.out.println(text);
				optionList.add(text);//bunu da arraylisti yazdiktan sonra yaptik.
			}
			
			//arraylist return arraylist so i need to add return optionlist
				return optionList;
		}
		
		
		//Profesional olan generic method ile yazma.
		//Generic method ile cagirma
		
		public static WebElement getElement(WebDriver driver, By locator){
			WebElement element=driver.findElement(locator);
			return element;
		}
		
	}	
		

	


