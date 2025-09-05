package StepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {
	WebDriver driver;
	By registerlink=By.linkText("Register");
	
	By malegender=By.id("gender-male");
	By femalegender=By.id("gender-female");
	
	By firstname=By.id("FirstName");
	By lastname=By.id("LastName");
	
	By txtemail=By.id("Email");
	By txtpassword=By.id("Password");
	
	By confirmpassword=By.id("ConfirmPassword");
	
	By btnRegister=By.id("register-button");
	
	By btnLogin=By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
	
	By searchloc=By.id("small-searchterms");
	
	By searchBtn=By.xpath("//*[@id=\"small-search-box-form\"]/button");
	
	By cartProduct = By.cssSelector(".product-item h2 a");
	
	By addCartBtn=By.cssSelector(".button-2.product-box-add-to-cart-button");
	
	By removeButtons = By.xpath("//button[text()='Remove']");
	
	By wishlistBtn=By.id("add-to-wishlist-button-17");
	
	By navToCartLink=By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
	
	By agreeTermCheck=By.id("termsofservice");
	By checkoutBtn=By.id("checkout");
	
	By guestCheckoutBtn=By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]");
	
	By firstNameBilling=By.id("BillingNewAddress_FirstName");
	
	By lastNameBilling=By.id("BillingNewAddress_LastName");
	
	By mailBilling=By.id("BillingNewAddress_Email");
	
	By countryBilling=By.id("BillingNewAddress_CountryId");
	
	By stateBilling=By.id("BillingNewAddress_StateProvinceId");
	
	By cityBilling=By.id("BillingNewAddress_City");
	
	By addressBilling=By.id("BillingNewAddress_Address1");
	
	By zipCodeBilling=By.id("BillingNewAddress_ZipPostalCode");
	
	By numberBilling=By.id("BillingNewAddress_PhoneNumber");
	
	By billContinueButton=By.xpath("//*[@id=\"billing-buttons-container\"]/button[2]");

	By shippingMethodBtn=By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
	
	By payBtnContinue=By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
	
	By paymentInfoConBtn=By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
	
	By confirmOrderBtn=By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
	
	By logoutBtn=By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	
	By addToCompareBtn=By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[8]/div[2]/button");
	
	By changeCurrencyBtn=By.id("customerCurrency");
	
	By apparelBtn=By.xpath("//*[@id=\"main\"]/div/div/div/div/div[3]/div/div[2]/div/h2/a");
	
	By shoeBtn=By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a");
	
	public PageClass(WebDriver driver1) {
		this.driver = driver1;
	}
	public void clickRegisterLink() {
	    driver.findElement(registerlink).click();
    }
	
	 public void selectGender(String gender) {
	        if ("male".equalsIgnoreCase(gender)) {
	            driver.findElement(malegender).click();
	        } else {
	            driver.findElement(femalegender).click();
	        }
	 }
	 
	 public void enterName(String firstName, String lastName) {
		 WebElement fn=driver.findElement(firstname);
		 WebElement ln=driver.findElement(lastname);
	        fn.sendKeys(firstName);
	        ln.sendKeys(lastName);
	    }
	 
	 public void enterEmail(String email) {
	        driver.findElement(txtemail).sendKeys(email);
	    }
	 
	 public void setPasswordAndConfirm(String password) {
	        driver.findElement(txtpassword).sendKeys(password);
	       driver.findElement(confirmpassword).sendKeys(password);
	    }
	 
	 public void clickRegisterButton() {
	        driver.findElement(btnRegister).click();
	    }
	 
	 public void loginMailAndPass(String email,String pass) {
		 driver.findElement(txtemail).sendKeys(email);
		 driver.findElement(txtpassword).sendKeys(pass);
	 }
	 
	 public void loginButton() {
		 driver.findElement(btnLogin).click();
	 }
	 public void search(String string) {
		driver.findElement(searchloc).click();
		driver.findElement(searchloc).sendKeys(string);
	 }
	 public void clickSearchBtn() {
		driver.findElement(searchBtn).click();
	 }
	 
	 public String getFirstProductName() {
		    List<WebElement> productLinks = driver.findElements(cartProduct);
	        return productLinks.get(0).getText();
	 }
	 
	 public void selectFirstProduct() {
		    List<WebElement> productLinks = driver.findElements(cartProduct);
	        productLinks.get(0).click();
	 }
	 
	 public void addToCart() {
		 WebElement addToCartButton=driver.findElement(addCartBtn);
	     addToCartButton.click();	 }
	 public void deleteCart() {
//		 driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a")).click();
//		 
//		 List<WebElement> removeButtons = driver.findElements(this.removeButtons);
//	        while(!removeButtons.isEmpty()){
//	            removeButtons.get(0).click();
//	            removeButtons = driver.findElements(this.removeButtons);
//	       }
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    while (true) {
		        List<WebElement> removeBtns = driver.findElements(removeButtons);

		        if (removeBtns.isEmpty()) {
		            // All items removed—exit loop
		            break;
		        }

		        WebElement btn = removeBtns.get(0);

		        try {
		            btn.click();
		            // Wait until the button's element is removed/stale
		            wait.until(ExpectedConditions.stalenessOf(btn));
		        } catch (StaleElementReferenceException e) {
		            // Log or ignore—you'll refresh the element on next loop iteration
		        }
		    }

	 }
	 
	 public void addToWishlist() {
		 driver.findElement(wishlistBtn).click();
	 }
	 
	 public void openProduct() {
		driver.findElement(By.linkText("Apple iCam")).click();
	 }
	 
	 public void navigateToCart() {
        driver.findElement(navToCartLink).click();		
	 }
	 
	 public void clickAgreeTerms() {
		driver.findElement(agreeTermCheck).click();;
	 }
	 public void checkoutClick() {
        driver.findElement(checkoutBtn).click();		
	 }
	 public void guestCheckoutClick() {
       driver.findElement(guestCheckoutBtn).click();		
	 }
	 
	 public void billingAddress() {
		driver.findElement(firstNameBilling).click();
		driver.findElement(firstNameBilling).sendKeys("MARY SWAPNA");
		
		driver.findElement(lastNameBilling).click();
		driver.findElement(lastNameBilling).sendKeys("ANKIREDDY");
		
		driver.findElement(mailBilling).click();
		driver.findElement(mailBilling).sendKeys("swapnaankireddy92@gmail.com");
		
		WebElement country=driver.findElement(countryBilling);
		country.click();
		Select sel=new Select(country);
		sel.selectByVisibleText("India");
		
		WebElement state=driver.findElement(stateBilling);
		state.click();
		Select sel2=new Select(state);
		sel2.selectByVisibleText("Andhra Pradesh");
		
		driver.findElement(cityBilling).click();
		driver.findElement(cityBilling).sendKeys("Kadapa");
		
		driver.findElement(addressBilling).click();
		driver.findElement(addressBilling).sendKeys("abc");
		
		driver.findElement(zipCodeBilling).click();
		driver.findElement(zipCodeBilling).sendKeys("516289");
		
		driver.findElement(numberBilling).click();
		driver.findElement(numberBilling).sendKeys("9876543218");
		
	 }
	 public void clickBillContinue() {
		driver.findElement(billContinueButton).click();
	 }
	 
	 public void shippingMethodBtnClick() {
		 driver.findElement(shippingMethodBtn).click();
	 }
	 
	 public void paymentContinueClick(){
		driver.findElement(payBtnContinue).click(); 
	 }
	 
	 public void paymentInfoContinueClick() {
		 driver.findElement(paymentInfoConBtn).click();
	 }
	 
	 public void confirmOrderClick() {
		 driver.findElement(confirmOrderBtn).click();
	 }
	 public void clickLogout() {
		 driver.findElement(logoutBtn).click();
		
	 }
	 public void addToCompare() {
		driver.findElement(addToCompareBtn).click();
	 }
	 
	 public void changeCurrency() {
		WebElement ele=driver.findElement(changeCurrencyBtn);
		ele.click();
		Select sel=new Select(ele);
		sel.selectByVisibleText("Euro");
		
	 }
	 public void navToApparel() {
		driver.findElement(apparelBtn).click();
	 }
	 public void clickShoes() {
		driver.findElement(shoeBtn).click();
	 }
	 
		 
	 
}
