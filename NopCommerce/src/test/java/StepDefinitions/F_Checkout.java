package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F_Checkout {
	WebDriver driver;
    PageClass pc;
 
    @Given("user on homepage")
    public void user_on_homepage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
        pc = new PageClass(driver);
    }
 
    @When("search a product and add to cart")
    public void search_a_product_and_add_to_cart() {
        pc.search("Apple iCam");
        pc.clickSearchBtn();
        pc.addToCart();
    }
 
    @And("Navigate to shopping cart")
    public void navigate_to_shopping_cart() {
        pc.navigateToCart();
    }
 
    @And("click on agree terms")
    public void click_on_agree_terms() {
        pc.clickAgreeTerms();
    }
 
    @And("click on checkout button")
    public void click_on_checkout_button() {
        pc.checkoutClick();
    }
 
    @And("click on checkout as guest button")
    public void click_on_checkout_as_guest_button() {
        pc.guestCheckoutClick();
    }
 
    @And("enter billing details")
    public void enter_billing_details() {
        pc.billingAddress();
    }
 
    @And("click on continue button")
    public void click_on_continue_button() {
        pc.clickBillContinue();
    }
 
    @And("select shipping method and click continue button")
    public void select_shipping_method_and_click_continue_button() {
        pc.shippingMethodBtnClick();
    }
 
    @And("select payment method and click continue button")
    public void select_payment_method_and_click_continue_button() {
        pc.paymentContinueClick();
    }
 
    @And("click continue for payment information")
    public void click_continue_for_payment_information() {
        pc.paymentInfoContinueClick();
    }
 
    @And("click on confirm button")
    public void click_on_confirm_button() {
        pc.confirmOrderClick();
    }
 
    @Then("Placed order successfully")
    public void placed_order_successfully() {
        System.out.println("✅ Placed order successfully");
        driver.quit();
    }

}
