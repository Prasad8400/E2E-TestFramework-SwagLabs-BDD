Feature: Add to cart functionality

  Scenario: Add and remove items from the cart
    When I add backpack to the cart
    Then the cart should have 1 items
    When I add bike light to the cart
    Then the cart should have 2 items
    When I remove bike light from the cart
    Then the cart should have 1 items
    And I open the cart
