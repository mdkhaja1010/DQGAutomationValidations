Feature: Add To Cart on Amazon
 Scenario: Adding a product to cart and validating the price
  Given I am on the Amazon homepage
  When I search for "<product>"
  And I click on searchbar icon
  And I click on the product
  And I click on add to cart button
  Then I validate the product price and cart price
  And I click on the cart button
  And I Click on the delete button
   Examples:
    |product|
    |redmi 9a| 