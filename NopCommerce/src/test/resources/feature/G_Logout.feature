Feature: Logout functionality 
Scenario: LoggedIn user or Registered user able to logout 
Given user on nopcommerce homepage
When Register the user
And logout using logout button
Then Logged out successfully
