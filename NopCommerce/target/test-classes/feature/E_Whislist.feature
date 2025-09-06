Feature: Add to wishlist 
Scenario Outline: adding a product to wishlist
Given user on home page
When search a "<item>"
When open product and add that to wishlist
Then successfully added to wishlist
Examples:
|item|
|Apple icam|
