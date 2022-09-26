package com.stepdefinition;

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
import org.openqa.selenium.support.ui.Select;

import com.runnerclass.Runner_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Stepdefinition {
	 WebDriver driver=Runner_class.driver;
	 

	@Given("^user Launch The  Url$")
	public void user_Launch_The_Url() {
		driver.navigate().to("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user Enter The User Field Gives The {string}")
	public void user_enter_the_user_field_gives_the(String string) {
		driver.findElement(By.id("username")).sendKeys(string);
	    
	}

	@When("user Enters The Password In The {string}")
	public void user_enters_the_password_in_the(String string) {
		  driver.findElement(By.id("password")).sendKeys(string);
	   
	}


	//login
	@Then("user Clicks The Loginbtn and Navigates To Hotel Search Page")
	public void user_clicks_the_loginbtn_and_navigates_to_hotel_search_page() throws Exception  {
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
	 
	}
	//location
	@When("user Enter The Location Field and Dropdown The Location")
	public void user_enter_the_location_field_and_dropdown_the_location() {
		WebElement location=driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		
		Select a=new Select(location);
		a.selectByIndex(3);
	}

	//hotel field
	@When("user Enter The Hotels Field and Dropdown The Hotel and Select")
	public void user_enter_the_hotels_field_and_dropdown_the_hotel_and_select() {
		WebElement hotels=driver.findElement(By.xpath("//select[@name='hotels']"));
		
		Select b=new Select(hotels);
		b.selectByIndex(4);
	   
	}

	//Room type
	@When("user Enter The Room Type Field and Select The Room Type")
	public void user_enter_the_room_type_field_and_select_the_room_type() {
		
		WebElement room=driver.findElement(By.xpath("//select[@name='room_type']"));
		
		Select c=new Select(room);
		c.selectByIndex(4);

	}

	//nos of rooms
	@When("user Enter The Number of Rooms and Dropdown and Select the No of Room")
	public void user_enter_the_number_of_rooms_and_dropdown_and_select_the_no_of_room() {
		WebElement nos=driver.findElement(By.xpath("//select[@name='room_nos']"));
		
		Select d=new Select(nos);
		d.selectByIndex(3);
	   
	}

	//check in
	@When("user Enter The Check In Date and Gives the In Date")
	public void user_enter_the_check_in_date_and_gives_the_in_date() {
		WebElement check=driver.findElement(By.xpath("//input[@name='datepick_in']"));
		check.clear();
		check.sendKeys("03/08/2022");
	}

	//check out
	@When("user Enter The Check Out Date and Gives The Out Date")
	public void user_enter_the_check_out_date_and_gives_the_out_date() {
		WebElement out=driver.findElement(By.xpath("//input[@name='datepick_out']"));
		out.clear();
		out.sendKeys("05/08/2022");
	}

	//Adults
	@When("user Enter The Adults Per Room Field and Dropdown and Select The No Of Adults")
	public void user_enter_the_adults_per_room_field_and_dropdown_and_select_the_no_of_adults() {
		WebElement adult=driver.findElement(By.xpath("//select[@name='adult_room']"));
		
		Select e=new Select(adult);
		e.selectByIndex(3);
	}

	//children
	@When("user Enter The Children Per Room Field and Dropdown and Select The No of Children")
	public void user_enter_the_children_per_room_field_and_dropdown_and_select_the_no_of_children() {
		WebElement child=driver.findElement(By.xpath("//select[@name='child_room']"));
		
		Select f=new Select(child);
		f.selectByIndex(2);
	   
	}

	//Search
	@Then("user Click The Searchbtn and Navigates To Search Hotel1 Page")
	public void user_click_the_searchbtn_and_navigates_to_search_hotel1_page() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	}
	//click hotel
	@When("user Enter Selection Box and Select One Of The Hotel and Click")
	public void user_enter_selection_box_and_select_one_of_the_hotel_and_click() {
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
	   
	}

	//continue
	@Then("user Click The Coninuebtn and Navigates To Book A Hotel Page")
	public void user_click_the_coninuebtn_and_navigates_to_book_a_hotel_page() {
		driver.findElement(By.xpath("//input[@name='continue']")).click();
	    
	}

	//First Name
	@When("user Enter The First Name Field and Feed The First Name")
	public void user_enter_the_first_name_field_and_feed_the_first_name() {
		driver.findElement(By.name("first_name")).sendKeys("dinesh");
	   
	}

	//last name
	@When("user Enter The Last Name Field and Feed The Last Name")
	public void user_enter_the_last_name_field_and_feed_the_last_name() {
		driver.findElement(By.name("last_name")).sendKeys("kumar");
	   
	}

	//Address
	@When("user Enter The Address Field and Gives The Address")
	public void user_enter_the_address_field_and_gives_the_address() {
		
		driver.findElement(By.name("address")).sendKeys("xxxxxxxxxxxxxxx");
	}

	//Card no
	@When("user Enter The Credit Card No Field and Gives the {int} Digit Card No")
	public void user_enter_the_credit_card_no_field_and_gives_the_digit_card_no(Integer int1) {
		driver.findElement(By.name("cc_num")).sendKeys("1234123465785768");
	   
	}

	//Card type
	@When("user Enter The Credit Card Type Field and Dropdown and Select The Card Type")
	public void user_enter_the_credit_card_type_field_and_dropdown_and_select_the_card_type() {
		WebElement card=driver.findElement(By.xpath("//select[@class='select_combobox']"));
		
		Select g =new Select(card);
		g.selectByIndex(1);
	    
	}

	//month 
	@When("user Enter The Expiry Month Field and Dropdown and Select The Month")
	public void user_enter_the_expiry_month_field_and_dropdown_and_select_the_month() {
		WebElement month=driver.findElement(By.name("cc_exp_month"));
		
		Select h=new Select(month);
		h.selectByIndex(1);
	   
	}
	

	//year
	@When("user Enter The Expiry Year Field and Dropdown and Select The Year")
	public void user_enter_the_expiry_year_field_and_dropdown_and_select_the_year() {
		WebElement year=driver.findElement(By.name("cc_exp_year"));
		
		Select i=new Select(year);
		i.selectByIndex(5);
	}

	//cvv nos
	@When("user Enter The Cvv Nos Field and Gives The Cvv Nos")
	public void user_enter_the_cvv_nos_field_and_gives_the_cvv_nos() {
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
	    
	}

	//click on book now
	@Then("user Click On The Book Now and Navigates To The Booking Confirmation")
	public void user_click_on_the_book_now_and_navigates_to_the_booking_confirmation() {
		driver.findElement(By.name("book_now")).click();
	   
	}

	//booked id
	@Then("user Click On The My Itinerybtn and Navigates To The Booked Itenary Page")
	public void user_click_on_the_my_itinerybtn_and_navigates_to_the_booked_itenary_page() {
		driver.findElement(By.name("my_itinerary")).click();
	    
	}

	//select the id
	@When("user Enter The Option and Select All The Order Id Option")
	public void user_enter_the_option_and_select_all_the_order_id_option() {
		driver.findElement(By.xpath("//input[@name='check_all']")).click();
	    	}

	//cancel the selected id
	@When("user Click On The Cancel Selected and Navigates To the Alert Page")
	public void user_click_on_the_cancel_selected_and_navigates_to_the_alert_page() {
		driver.findElement(By.name("cancelall")).click();
	}

	//alert
	@When("user click On The Alert Box and Error Will Gone")
	public void user_click_on_the_alert_box_and_error_will_gone() {
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
	}

	//screenshot
	@When("user Take The Screen Shot Of The page")
	public void user_take_the_screen_shot_of_the_page() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File s1=ts.getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\Dell\\eclipse-workspace\\Selenium_projecttask\\Screenshot\\minipro2.png");
		FileUtils.copyFile(s1, d1);
	}

	//logout
	@When("user Click on LogOut")
	public void user_click_on_log_out() {
		driver.findElement(By.xpath("//input[@name='logout']")).click();
	}

	//login
	@When("user Click On The Main page Login Option Again")
	public void user_click_on_the_main_page_login_option_again() {
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
	}

	//output
	@Then("user Takes The Output Of The Case")
	public void user_takes_the_output_of_the_case() {
		System.out.println("TC_2 pass");
	   
	}



}
