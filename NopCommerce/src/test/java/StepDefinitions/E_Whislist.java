package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E_Whislist {
    WebDriver driver;
    
	@Given("user on home page")
	public void user_on_home_page() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("search a {string}")
	public void search_a(String string) {
		PageClass pc=new PageClass(driver);
		pc.search(string);
		pc.clickSearchBtn();
	}

	@When("open product and add that to wishlist")
	public void open_product_and_add_that_to_wishlist() {
		PageClass pc=new PageClass(driver);
		pc.openProduct();
		pc.addToWishlist();
	}

	@Then("successfully added to wishlist")
	public void successfully_added_to_wishlist() {
		System.out.println("Successfully added to wishlist");
		driver.quit();
	}

}
