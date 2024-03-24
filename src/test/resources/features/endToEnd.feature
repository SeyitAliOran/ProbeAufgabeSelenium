Feature: User should be able to login and finish purchase

  @wip
  Scenario: Login and End To End Test
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce"
    Then The user should be able to see "Products" header
    And The user adds the as "7.99" and "29.99" product
    And The user opens basket
    And The user clicks on checkout
    And The user enters details as "John" and "Wick" and "NW090312"
    Then The user verifies that the price is "Total: $41.02"
    And The user clicks on finish button
    Then The user should be able to see confirmation message as "Thank you for your order!"