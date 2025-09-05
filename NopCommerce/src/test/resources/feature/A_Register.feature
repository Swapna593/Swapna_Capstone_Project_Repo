Feature: nopCommerce User Registration

Scenario Outline: Successful registration with valid data
Given User launches the browser and navigates to homepage
When User navigates to the Register page
And User selects gender as "<gender>"
And User enters First name "<firstName>" and Last name "<lastName>"
And User enters unique "<email>"
And User sets password "<password>" and confirms password
And User clicks on the Register button
Then A success message should be displayed
Examples:
| gender | firstName | lastName | email | password |
 | Female   | MARY SWAPNA     | ANKIREDDY | swapnaankireddy92@gmail.com   | abc123 |
 | Male | Prathap      | ANKIREDDY | ankireddyprathap@gmail.com   | abc123 |