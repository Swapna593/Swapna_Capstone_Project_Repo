package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D_Cart {
    WebDriver driver;
	@Given("User on the nopCommerce home page")
	public void user_on_the_nop_commerce_home_page() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("search for {string}")
	public void search_for(String item1) {
		PageClass pc=new PageClass(driver);
		pc.search(item1);
		pc.clickSearchBtn();
	}

	@And("select the first product from the search results")
	public void select_the_first_product_from_the_search_results() {
		PageClass pc=new PageClass(driver);
		pc.selectFirstProduct();
		
	}

	@And("add the product to the cart")
	public void add_the_product_to_the_cart() throws InterruptedException {
		PageClass pc=new PageClass(driver);
		pc.addToCart();
	}
	
	@When("delete from cart")
	public void delete_from_cart() {
		PageClass pc=new PageClass(driver);
		pc.deleteCart();
	}
	
	@Then("successfully added and deleted from cart")
	public void successfully_added_and_deleted_from_cart() {
		System.out.println("Added and deleted from cart");
		driver.quit();
	}

}
