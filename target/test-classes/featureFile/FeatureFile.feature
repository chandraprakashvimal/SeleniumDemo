
Feature: Place order for Samsung Galaxy F6
  Scenario: Place order for Galaxy phone
    Given open the url and click on login link
    When login to the application with valid username "admin" and password "admin"
    And select Samsung galaxy S6
    And add the phone to the cart
    Then go to cart and place order
    And enter details and purchase
    And print the purchase id

