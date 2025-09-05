Feature: Product checkout
Scenario: adding a product product and complete checkout 
Given user on homepage
When search a product and add to cart
And Navigate to shopping cart
And click on agree terms
And click on checkout button
And click on checkout as guest button
And enter billing details
And click on continue button
And select shipping method and click continue button
And select payment method and click continue button
And click continue for payment information
And click on confirm button
Then Placed order successfully