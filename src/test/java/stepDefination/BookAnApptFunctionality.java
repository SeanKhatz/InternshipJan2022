package stepDefination;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.MainParent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookAnApptFunctionality extends MainParent {
	@Given("user is in homepage")
	public void user_is_in_homepage() {
	Assert.assertEquals(driver.getTitle(), "Best Online IT Training Institute | Transfotech Academy");
	    
	}

	@And("user click Book An Appointment link")
	public void user_click_book_an_appointment_link() {
		driver.findElement(By.linkText("Book an Appointment")).click();   
	}

	@And("Book An Appointment fillable form should display")
	public void book_an_appointment_fillable_form_should_display() {
		driver.findElement(By.xpath("//div[@id='sgpb-popup-dialog-main-div']"));
	    
	}

	@And("user type in first name and last name")
	public void user_type_in_first_name_and_last_name() {
		driver.findElement(By.cssSelector("input[placeholder='Your First Name']")).sendKeys("James");
		driver.findElement(By.cssSelector("input[placeholder='Your Last Name']")).sendKeys("Bond");
		
	 
	}

	@And("user type in email address in Your Email section")
	public void user_type_in_email_address_in_your_email_section() {
	    driver.findElement(By.xpath("//input[@placeholder='Your Email']")).sendKeys("JamesBond007@mail.com");
	}

	@And("user type in phone number in Your Phone section")
	public void user_type_in_phone_number_in_your_phone_section() {
	    driver.findElement(By.xpath("//input[@placeholder='Your Phone']")).sendKeys("(777) 007-7777");
	}

	@And("user type in Date on this format mm\\/dd\\/yyyy")
	public void user_type_in_date_on_this_format_mm_dd_yyyy() {
	    driver.findElement(By.cssSelector("input[name='date-279']")).sendKeys("07/16/2021");
	}

	@And("user able to type chosen time")
	public void user_able_to_type_chosen_time() {
	    driver.findElement(By.cssSelector("#appt-time")).sendKeys("1:30 PM");
	}

	@And("Interested In? Section User should be able to click courses option")
	public void interested_in_section_user_should_be_able_to_click_courses_option() {
	    driver.findElement(By.cssSelector("input[value='QA Engineering'][name='your-Interested[]']")).click();
	}

	@When("user type in characters in Message Box")
	public void user_type_in_characters_in_message_box() {
	    driver.findElement(By.xpath("//div[@class='field-group']//textarea[@placeholder='Message']")).sendKeys("Hello I would like to book");
	}

	@Then("user click Send A Request button")
	public void user_click_send_a_request_button() {
	    driver.findElement(By.cssSelector("input[value='Send A Request']")).click();
	}

	@When("user did not click Book An Appointment")
	public void user_did_not_click_book_an_appointment() {
		Assert.assertEquals(driver.getTitle(), "Best Online IT Training Institute | Transfotech Academy");
	}

	@Then("Book An Appointment fillable form should NOT display")
	public void book_an_appointment_fillable_form_should_not_display() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://transfotechacademy.com/");
	}
	

}
