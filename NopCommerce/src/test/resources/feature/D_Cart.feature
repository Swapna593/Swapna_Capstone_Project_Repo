Feature: Add to Cart 
Scenario Outline: Customer adds a product to the shopping cart and delete from cart 
Given User on the nopCommerce home page
When search for "<item>"
And select the first product from the search results
And add the product to the cart
And delete from cart
Then successfully added and deleted from cart
Examples:
| item |
| laptop |
| Apple iCam |
