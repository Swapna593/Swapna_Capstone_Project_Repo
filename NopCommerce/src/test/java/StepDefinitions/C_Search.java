package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class C_Search {
	
	WebDriver driver;
	PageClass pc;
	
	@Given("open the nopCommerce homepage")
	public void open_the_nop_commerce_homepage() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pc=new PageClass(driver);
	}

	@When("enter {string} in the search bar")
	public void enter_in_the_search_bar(String string) {
		pc.search(string);
	}

	@And("click the Search button")
	public void click_the_search_button() {
		pc.clickSearchBtn();
	}
	@Then("searching product successfull")
	public void searching_product_successfull() {
		System.out.println("search successfull");
		driver.quit();
	}


}
