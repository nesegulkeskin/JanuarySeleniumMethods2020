package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		//Xpath used to find the location any element on a webpage using HTML structure.
		//Absolute xpath=Starts with single slash (/) starting from root element and all the way to the element.
		//Relative Xpath stars double slash(//) starting selection matching  anywhere in the document.
		//  //tagname[@attirubte='value']
		
		System.setProperty("webdriver.chrome.driver","/Users/nesekeskin/Documents/DRIVER/chromedriver");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://app.hubspot.com/login");
		
		// //htmltag[@attirubute='value']
		
		// //input[@id='username'] --> username 
		
		// //input[@id='password'] or //input[@id='password' and @type='password'] --> password
		
		// //button[@id='loginBtn'] or //button[@id='loginBtn' and @type='submit'] --> LoginBtn
		// //button[@id='loginBtn' and @data-test-id='password-login-button'] --> LoginBtn
		
		//driver.get("https://classic.crmpro.com");
		
		// //input[@name='username'] or //input[@name='username' and @type='text'] -->username
		// //input[@name='password'] or //input[@name='password' and @type='password'] --> password
		
		//contains()
		// //input[contains(@name, 'password')] or //input[contains(@name, 'password') and @type='password'] -->password
		// //input[contains(@class, 'btn btn-small')] or //input[contains(@class, 'btn btn-small') and @type='submit'] -->LoginBtn
		// //input[contains(@class, 'btn btn-small') and @value='Login'] --> LoginBtn
		// Some values available that return false or true
		
		//Why we use contains or our customize?
		// Dynamic Xpath 
		//You will have dynamic xpath, what is the dynamic <inpout id=test_123>  this is html tag.
		
		//what is the dynamic xpath?
		//for example,  when you open webpage, you wanna inspect the webpage.--> <inpout id=test_123>
		//if you refresh the webpage and dynamic element will be changed --> <input id=test_345> like this, it was changed
		// after refresh your element will not work, because it is dynamic xpath.
		// each time, if you wanna refresh  the webpage your dynamic xpath was changed.
		
		// in this case, we can use contains concept.
		// if you have dynamic webpage, you can fix like this. 
		
		// sample //input [contains(@id, 'test_')] with contains yani.
		// you will right only text.
		
		// contains is used for or dynamic elements properties.
		
		//Test function
		//test()
		// //a[test()='Sin up'] or //i18n-string[text()='Sign up'] or //a//i18n-string[text()='Sign up'] --> Sign Up
		// //a//i18n-string[text()='Privacy Policy'] -->privacy Policy
		
		// h5[test()]
		// //h5[contains(text(), 'That email address')]
		
		//start-with function
		// //input[start-with(@id, 'username')]
		// <input[ends-with(@id, '_test')]
		
		//ends-with function
		//<input id=test_123>
		//<input id=123_test>
		//<input[ends-with(@id, '_test')] // always does work
		
		//Postion (it means index number)
		// (//input[contains(@class, 'form-control')])[1]
		// (//input[contains(@class, 'form-control')])[2]
		
		// (//input[contains(@class, 'form-control')])[position()=1]
		
		//Parent and child tags in html
		// //div[contains(@class, 'private-form__input-wrapper')]/input[@id='username']--> direct child
		// //div[contains(@class, 'private-form__input-wrapper')]/input[@id='password']--> direct child

		// //div[@class='private-form__label-wrapper']/input[@id='username']--> direct parent
		
		//Following ( go to the parent and child tag)
		
		////div[@class='private-form__control-wrapper']/following::input[@id='password']
		////div[@class='private-form__control-wrapper']/following::input[@id='remember']
		
		// preceding (child tag after parent tag)
		////input[@id='password']/preceding::div[@class='private-form__label-wrapper']
		
		//child to parent (reverse direction)
		// //input[@name='username']/../../../../.. 
		// //input[@name='username']/parent::div[@class='input-group']
		// //input[@name='username']/parent::div//parent::form (reverse usage)
		
		//Last()
		// (//input[@type='text'])[last()] --> to reach last indext
		
		//ancester
		//input[@id='username']/ancester::body --> to reach grandpa
		
	}

}
