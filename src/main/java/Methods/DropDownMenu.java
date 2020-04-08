package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		//Asagida generic method (getelement method) u yazdigim icin 
		//burada asagidaki methodlari yoruma aldim.
		//By day= ... diye baslayan methodu yazdim sonrasinda.
		
		
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		
		SelectDropDownValueByText(driver, day, "13"); //SelectDropDownValueByText method 3 parametreli olduktan sonra
		SelectDropDownValueByText(driver, month, "Jun"); // basina driver lari ekleyince hata ortadan kalkti.
		SelectDropDownValueByText(driver, year, "1980");
		//Bu methodlari yazdiktan sonra yukarida ayri ayri yazdiklarimi yoruma aldim.
		
		//Dikkat yukarida By day=... diye baslayan methodu yazdiktan sonra
		//yukaridaki methodlart hata verdi.
		//Sonrasinda generic methodda (webdriver driver i By locator olarak degistirtdim.)
		
		
		//Dikkat, yukaridaki methodu generic methodu yazdigim icin yaptim. (Yani Bu day=....)
		
		//WebElement day=driver.findElement(By.id("day"));
		//WebElement month=driver.findElement(By.id("month"));
		//WebElement year=driver.findElement(By.id("year"));
		
		
		
		//Burada selectByVisisble methodunu kullandik.
		// SelectByVisible methodunun icine index no yu yaziyoruz.(Bu bilgiyi teyit et)
		
		//First Usage
		//Select select1=new Select(day);
		//select1.selectByVisibleText("13");
		
		//Select select2=new Select(month);
		//select2.selectByVisibleText("Jun");
		
		
		//Select select3=new Select(year);
		//select3.selectByVisibleText("1980");
		
		//Asagida SelectDropDownValueByText methodunu olusturduktan sonra burada cagirdim.
		
		
		//INDEX ile gosterme
		
	//	WebElement dayElement=driver.findElement(By.id("day"));
	//	WebElement monthElement=driver.findElement(By.id("month"));
	//	WebElement yearElement=driver.findElement(By.id("year"));
		
		//Select select1=new Select(dayElement);
		//select1.selectByIndex(4);
				
		//Select select2=new Select(monthElement);
		//select2.selectByIndex(6);
				
				
		//Select select3=new Select(yearElement);
		//select3.selectByIndex(1980);
		
		SelectDropDownSelectByIndex(driver, day, 16);
		SelectDropDownSelectByIndex(driver, month, 11);
		SelectDropDownSelectByIndex(driver, year, 4);
	}
	
	 //Second Usage with create methods
	
	/**
	 * This is used to select the values from dropDown on the basis of visible text
	 * Bu, dropDown'dan görünür metin temelinde değerleri seçmek için kullanılır.
	 * @param element
	 * @param value
	 * 
	 */
	//Second Usage with create methods-DIKKAT !!! SelectByVisible Method icin
	
	public static void SelectDropDownValueByText(WebDriver driver,By locator, String value){
		WebElement element= getElement(driver, locator);
		Select select=new Select(element);//Burada element yaziyordu sonra
		select.selectByVisibleText(value);					//GetElement methodunu cagirdiktan sonra yukariya 
															//ewbdriver drivere ekledik ve 3 parametreli method oldu.
	}

	
	
		
		/**
		 * This is used to select the values from dropDown on the basis of visible INDEX
		 * @param driver
		 * @param locator
		 * @param index
		 */
	
		//Second Usage with create methods-DIKKAT !!! SelectByINDEX Method icin- 
		//Parametrenin icinde INT INDEX  yaptik
	
		public static void SelectDropDownSelectByIndex(WebDriver driver,By locator, int index){
			WebElement element= getElement(driver, locator);
			Select select=new Select(element);
			select.selectByIndex(index);				
			
		}
		

	
	/**
	 * it is used to creat webElement on the basis of By locator.
	 * Konumlandırıcı tarafından webElement oluşturmak için kullanılır.
	 * @param driver
	 * @param locator
	 * @return
	 */
	//This is ola generic methods
	
	public static WebElement getElement(WebDriver driver, By locator){
		WebElement element=driver.findElement(locator);
		return element;
	}
	

}
