package stepDefination;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.MainParent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutUsLinkFunctionalityTest extends MainParent {
	@Given("user is in the homepage")
	public void user_is_in_the_homepage() {
	Assert.assertEquals(driver.getTitle(), "Best Online IT Training Institute | Transfotech Academy");
	}

	@When("user clicks About Us link")
	public void user_clicks_about_us_link() {
	driver.findElement(By.linkText("About Us")).click();
	}

	@Then("user able to see Who We Are")
	public void user_able_to_see_who_we_are() {
	driver.findElement(By.cssSelector("div[class='elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-3c4bb064'] div[class='elementor-widget-wrap']"));
	}
	
	@Given("user is in About Us page")
	public void user_is_in_about_us_page() {
	driver.findElement(By.linkText("About Us")).click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://transfotechacademy.com/about-us/");
	}

	@And("user go to Our Values section")
	public void user_go_to_our_values_section() {
	driver.findElement(By.xpath("//h2[normalize-space()='OUR VALUES']"));
	}

	@When("user able to read Our Trending Courses first")
	public void user_able_to_read_our_trending_courses_first() {
	driver.findElement(By.xpath("//h2[normalize-space()='Our Trending Courses']"));
	}

	@Then("user able see and read the topics Best Learning Academy and Industry Leading Expert")
	public void user_able_see_and_read_the_topics_best_learning_academy_and_industry_leading_expert() {
	driver.findElement(By.xpath("//h3[normalize-space()='Best Learning Academy']"));
	driver.findElement(By.xpath("//h3[normalize-space()='Industry Leading Expert']"));
	}

	@When("user did not go to Our Values section")
	public void user_did_not_go_to_our_values_section() {
	Assert.assertEquals(driver.getCurrentUrl(),"https://transfotechacademy.com/about-us/");
	}

	@Then("user will not able to read Our Values section but will be in the same page")
	public void user_will_not_able_to_read_our_values_section_but_will_be_in_the_same_page() {
	Assert.assertEquals(driver.getTitle(),"About Us | Transfotech Academy");
	}
}
