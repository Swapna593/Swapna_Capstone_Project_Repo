package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class G_Logout {
	WebDriver driver;
	@Given("user on nopcommerce homepage")
	public void user_on_nopcommerce_homepage() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Register the user")
	public void register_the_user() {
		PageClass pc=new PageClass(driver);
		pc.clickRegisterLink();
		pc.enterName("Prathap Reddy", "Ankireddy");
		pc.enterEmail("ankireddy@gmail.com");
		pc.setPasswordAndConfirm("abc@123");
		pc.clickRegisterButton();
		System.out.println("registered successfully");
	}

	@And("logout using logout button")
	public void logout_using_logout_button() {
		PageClass pc=new PageClass(driver);
		pc.clickLogout();
	}

	@Then("Logged out successfully")
	public void logged_out_successfully() {
		System.out.println("Logged out successfully");
		driver.quit();
	}

}
