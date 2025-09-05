Feature: nopCommerce user Login
Scenario Outline: Logging in with valid or invalid credentials
Given the user opens the browser and navigates to website
When the user enters email "<email>" and password "<password>"
And clicks login button
Then Successfully logging In
 Examples:
 | email                   | password |
 | swapnaankireddy92@gmail.com   | abc123 |
 | ankireddyprathap@gmail.com   | abc123 |