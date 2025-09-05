package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class I_Currency {
	WebDriver driver;
	@Given("default homepage is open")
	public void default_homepage_is_open() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("change currency")
	public void change_currency() {
		PageClass pg=new PageClass(driver);
		pg.changeCurrency();
	}

	@Then("successfully currency change")
	public void successfully_currency_change() {
		System.out.println("Changed Currency Succesfully");
		driver.quit();
	}

}
