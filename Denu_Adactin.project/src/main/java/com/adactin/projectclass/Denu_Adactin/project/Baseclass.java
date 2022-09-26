package com.adactin.projectclass.Denu_Adactin.project;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	static WebDriver driver;//null
	//browserlaunch
	public static WebDriver browserlaunch(String options) {

		if(options.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty
					("user.dir")+"\\chromedriver\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
		}
		else if(options.equalsIgnoreCase("edge")){
		}
		else if(options.equalsIgnoreCase("gecko")) {
		}
		else {
			System.out.println("invalid browser exception");
			
		}
		driver.manage().window().maximize();
		
		return driver;
	}
	//url
	public static void geturl(String value) {

		driver.get(value);
		
	}
	
	
	// webelemennt base class
	public static void userinput(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void clickbtn(WebElement element) {
		element.click();
	}

	public static void clearbtn(WebElement element) {
		element.clear();
	}

	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void isdisplayed(WebElement element) {
		boolean display = element.isDisplayed();
		System.out.println(display);
	}
//
//	public static void isenabled(WebElement element) {
//		boolean enable = element.isEnabled();
//		System.out.println(enable);
//	}
//
//	public static void isselected(WebElement element) {
//		boolean select = element.isSelected();
//		System.out.println(select);		
//	}
//	
	public static void getAttribute(WebElement element,String value) {

		String text=element.getAttribute(value);
		System.out.println(text);
	}
	
	public static  void dropdown(WebElement element,String option,String value) {

		Select s =new Select(element);
		
		if(option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		else if(option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if(option.equalsIgnoreCase("index")) {
			int a =Integer.parseInt(value);
			s.selectByIndex(a);
		}
		else {
		}
	
		}
	
	 public static  void implicitywait() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
	 public static  void maximize() {

		 driver.manage().window().maximize();
	}
	 
	public static void threadsleep() throws InterruptedException {

		Thread.sleep(2000);
	}
	
//	private void keyboardenter() {
//
//		Select s =new Select();
//		s.keypress(KeyEvent.VK_ENTER);
//		s.keyrelease(KeyEvent.VK_ENTER);
//	}
	
		
	}


