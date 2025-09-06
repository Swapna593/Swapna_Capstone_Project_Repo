Feature: Product Search using the search bar 
Scenario Outline: Search for products in search bar 
Given  open the nopCommerce homepage
When  enter "<searchTerm>" in the search bar
And  click the Search button
Then searching product successfull
Examples:
| searchTerm   |
| Laptop       |
| Smartphone   |