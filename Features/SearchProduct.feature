Feature: Search product on Amazon
 Scenario: Search for a Product
  Given I am on the Amazon homepage
  When I search for "<product>"
  And I click on searchbar icon
  And I click on the product
  Then I validate the Visibility and Invisibility of the product
  Examples:
    |product|
    |redmi 9a|