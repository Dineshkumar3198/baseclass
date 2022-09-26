package com.adactin.projectclass.Denu_Adactin.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

public class Facebook extends Baseclass {

	public static void main(String[] args) throws InterruptedException {

		browserlaunch("chrome");

		implicitywait();

		maximize();

		geturl("http://demo.automationtesting.in/Register.html");

		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		userinput(firstname, "Dinesh");
		threadsleep();
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		userinput(lastname, "kumar");
		threadsleep();
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		userinput(address, "thiruvallur street , thirumuhllai voyal chenai 62");
//		
		threadsleep();
//		
//		WebElement mail=driver.findElement(By.className("form-control ng-invalid ng-touched ng-dirty ng-valid-email ng-invalid-required"));
//		userinput(mail, "dineshh1998@gmail.com");
//		
		WebElement phonenum = driver.findElement(By.xpath("//input[@type='tel']"));
		userinput(phonenum, "1234567897");
		threadsleep();
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		clickbtn(gender);
		threadsleep();
		WebElement hobbies = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		clickbtn(hobbies);
		threadsleep();
		WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
		clickbtn(language);

		threadsleep();

		WebElement language1 = driver.findElement(By.xpath("//a[text()='English']"));
		clickbtn(language1);
		threadsleep();
		WebElement skills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		dropdown(skills, "text", "C");
		threadsleep();
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
		clickbtn(country);
		threadsleep();
		WebElement search = driver.findElement(By.xpath("//input[@role='textbox']"));
		// userinput(search, "india");

		search.sendKeys("India");
		threadsleep();
		WebElement year = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
		dropdown(year, "index", "6");
		threadsleep();
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		dropdown(month, "text", "May");
		threadsleep();
		WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		dropdown(day, "index", "4");
		threadsleep();
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		userinput(password, "denu@3198");
		threadsleep();
		WebElement password2 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		userinput(password2, "denu@3198");
		threadsleep();
		WebElement refresh = driver.findElement(By.xpath("//button[@type='button']"));
		clickbtn(refresh);
		threadsleep();
		driver.quit();

		System.out.println("tc- pass");

	}

}
