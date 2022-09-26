package com.runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin_features\\amazon.feature",glue="",monochrome=true)


public class RunnerClass_Amazon {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void SetUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Selenium_projecttask\\chromedriver01\\chromedriver.exe");

		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();

	}
	
	
}
