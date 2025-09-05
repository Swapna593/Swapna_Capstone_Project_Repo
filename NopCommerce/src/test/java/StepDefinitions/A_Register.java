package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_Register {
	
	WebDriver driver;
	@Given("User launches the browser and navigates to homepage")
	public void user_launches_the_browser_and_navigates_to_homepage() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User navigates to the Register page")
	public void user_navigates_to_the_register_page() {
		PageClass pc=new PageClass(driver);
		pc.clickRegisterLink();
	}

	@And("User selects gender as {string}")
	public void user_selects_gender_as(String string) {
		PageClass pc=new PageClass(driver);
		pc.selectGender(string);
	}

	@And("User enters First name {string} and Last name {string}")
	public void user_enters_first_name_and_last_name(String string, String string2) {
		PageClass pc=new PageClass(driver);
		pc.enterName(string, string2);
	}

	
	@And("User enters unique {string}")
	public void user_enters_unique(String string) {
		PageClass pc=new PageClass(driver);
		pc.enterEmail(string);
	}

	@And("User sets password {string} and confirms password")
	public void user_sets_password_and_confirms_password(String pass) {
		PageClass pc=new PageClass(driver);
		pc.setPasswordAndConfirm(pass);
		
	}

	@And("User clicks on the Register button")
	public void user_clicks_on_the_register_button() {
		PageClass pc=new PageClass(driver);
		pc.clickRegisterButton();
	}

	@Then("A success message should be displayed")
	public void a_success_message_should_be_displayed() {
		System.out.println("registered successfully");
		driver.quit();
	}

}
