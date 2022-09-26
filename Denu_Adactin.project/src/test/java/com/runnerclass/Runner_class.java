package com.runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin_features\\adactin.feature",glue="com.stepdefinition",monochrome=true,
plugin= {"pretty","html:Reports/htmlreport.html","junit:Reports/xmlreport.xml","json:Reports/jsonreport.jason"},
dryRun=false
)

public class Runner_class {

	public static WebDriver driver;

	
	@BeforeClass
	public static void SetUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Denu_Adactin.project\\chromedriver\\chromedriver.exe");

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
