package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class J_ShopByCat {
	WebDriver driver;
	@Given("user on default homepage")
	public void user_on_default_homepage() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("navigate to Apparel category")
	public void navigate_to_apparel_category() {
		PageClass pc=new PageClass(driver);
		pc.navToApparel();
	}

	@And("click on shoes")
	public void click_on_shoes() {
		PageClass pc=new PageClass(driver);
		pc.clickShoes();
	}

	@Then("able to shop by category successfully")
	public void able_to_shop_by_category_successfully() {
		System.out.println("User able to navigate and shop and by category");
		driver.quit();
	}

}
