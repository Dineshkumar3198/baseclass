package com.adactin.projectclass.Denu_Adactin.project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Task_1 extends Baseclass {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.out.println("Dinesh day-4 task");

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Dell\\eclipse-workspace\\Selenium_projecttask\\chromedriver01\\chromedriver.exe");
//
//		ChromeDriver driver = new ChromeDriver();
		driver=browserlaunch("chrome");
//		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/");
		
	WebElement username=driver.findElement(By.id("username"));
	
	userinput(username, "Dinesh1998");
	//username.clear();
	//username.sendKeys("Dinesh1998");
	
	WebElement password=driver.findElement(By.id("password"));
	userinput(password, "Denu@3198");
	//password.clear();
	//password.sendKeys("Denu@3198");
	
	WebElement login=driver.findElement(By.id("login"));
	login.click();
	
	
	WebElement location=driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
	
	Select a=new Select(location);
	a.selectByIndex(3);
	
	WebElement hotels=driver.findElement(By.xpath("//select[@name='hotels']"));
	
	Select b=new Select(hotels);
	b.selectByIndex(4);
	
	WebElement room=driver.findElement(By.xpath("//select[@name='room_type']"));
	
	Select c=new Select(room);
	c.selectByIndex(4);

	WebElement nos=driver.findElement(By.xpath("//select[@name='room_nos']"));
	
	Select d=new Select(nos);
	d.selectByIndex(3);
	
	WebElement check=driver.findElement(By.xpath("//input[@name='datepick_in']"));
	check.clear();
	check.sendKeys("03/08/2022");
	
	WebElement out=driver.findElement(By.xpath("//input[@name='datepick_out']"));
	out.clear();
	out.sendKeys("05/08/2022");

	WebElement adult=driver.findElement(By.xpath("//select[@name='adult_room']"));
	
	Select e=new Select(adult);
	e.selectByIndex(3);
	
	WebElement child=driver.findElement(By.xpath("//select[@name='child_room']"));
	
	Select f=new Select(child);
	f.selectByIndex(2);
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	
	driver.findElement(By.xpath("//input[@name='continue']")).click();
	
	driver.findElement(By.name("first_name")).sendKeys("dinesh");
	
	driver.findElement(By.name("last_name")).sendKeys("kumar");
	
	driver.findElement(By.name("address")).sendKeys("xxxxxxxxxxxxxxx");
	
	driver.findElement(By.name("cc_num")).sendKeys("1234123465785768");
	
	WebElement card=driver.findElement(By.xpath("//select[@class='select_combobox']"));
	
	Select g =new Select(card);
	g.selectByIndex(1);
	
	WebElement month=driver.findElement(By.name("cc_exp_month"));
	
	Select h=new Select(month);
	h.selectByIndex(1);
	
	WebElement year=driver.findElement(By.name("cc_exp_year"));
	
	Select i=new Select(year);
	i.selectByIndex(5);
	
	driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
	
	driver.findElement(By.name("book_now")).click();
	
	//driver.switchTo().alert().accept();
//	Select s=new Select(driver.findElement(By.name("order_no")));
	//String text=s.getFirstSelectedOption().getText();
	//System.out.println(text);
	
	driver.findElement(By.name("my_itinerary")).click();
	
	driver.findElement(By.xpath("//input[@name='check_all']")).click();
	
	driver.findElement(By.name("cancelall")).click();
	
	Alert alert=driver.switchTo().alert();
	String text=alert.getText();
	System.out.println(text);
	alert.accept();
	
	//Screenshot
			TakesScreenshot ts=(TakesScreenshot)driver;
			File s1=ts.getScreenshotAs(OutputType.FILE);
			File d1=new File("C:\\Users\\Dell\\eclipse-workspace\\Selenium_projecttask\\Screenshot\\minipro2.png");
			FileUtils.copyFile(s1, d1);
			
			driver.findElement(By.xpath("//input[@name='logout']")).click();
			
			driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
			
			System.out.println("TC_2 pass");
			
			driver.quit();
	
		
		
	}



	}


