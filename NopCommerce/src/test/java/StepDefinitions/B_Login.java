package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B_Login {
   WebDriver driver;
	@Given("the user opens the browser and navigates to website")
	public void the_user_opens_the_browser_and_navigates_to_website() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("the user enters email {string} and password {string}")
	public void the_user_enters_email_and_password(String string, String string2) {
		PageClass pc=new PageClass(driver);
		pc.loginMailAndPass(string, string2);
	}

	@And("clicks login button")
	public void clicks_login_button() {
		PageClass pc=new PageClass(driver);
		pc.loginButton();
	}

	@Then("Successfully logging In")
	public void successfully_logging_in() {
		System.out.println("Successfully logged in");
		driver.quit();
	}

}
