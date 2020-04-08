package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		//Interview Question
		//How to select an element without using select class 
		
		//1.We need to use listElement and FindElements
		//2.We creat Xpath to get all options, after that
		//3.we creat for logic and we will get all options
		
		List<WebElement> dayList=driver.findElements(By.xpath("//*[@id='day']/option"));
		//facebook sayfasinda month uzerine inspect yaptiktan sonra comman F ile yukaridaki xpath i yazdik.
		System.out.println(dayList.size());
		
		for (int i = 0; i < dayList.size(); i++) {
			System.out.println(dayList.get(i).getText());
			String text=dayList.get(i).getText();
			if (text.equals("15")) { //Burada facebook icindeki day tarihini 10 olarak yaptik.
				dayList.get(i).click();
				break;
			}
		}
		
		
		
	}

}
