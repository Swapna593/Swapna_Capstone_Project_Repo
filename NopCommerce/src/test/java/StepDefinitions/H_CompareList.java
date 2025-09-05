package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class H_CompareList {
	WebDriver driver;
	@Given("User on the product page")
	public void user_on_the_product_page() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/oversized-women-t-shirt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("add to compare list")
	public void add_to_compare_list() {
		PageClass pg=new PageClass(driver);
		pg.addToCompare();
	}

	@Then("successfully added to compare list")
	public void successfully_added_to_compare_list() {
		System.out.println("Product Added to compare list");
		driver.quit();
	}

}
